/**
 * @author Adeepa Gunathilake
 */

import java.io.IOException;
import java.util.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.*;
import java.awt.Dimension;

public class DataExtractor {
    private PDDocument document;
    
    public DataExtractor(){
        document = null;
    }
    
    public DataExtractor(PDDocument document){
        this.document = document;
    }

    public PDDocument getDocument() {
        return document;
    }

    public void setDocument(PDDocument document) {
        this.document = document;
    }
    
    /**
     * Extracts the text lines and the locations of the start positions of those
     * lines. This method returns an Object[][] array which the size is 
     * Object[2][number of text lines in the page]. This array contains the text
     * lines and the locations of those lines as follows, <br>
     * <p>
     * assume the code is like this,<br>
     * {@code Object[][] arr = extractLines(i);}<br>then,
     * <li>If you haven't set the document through setDocument() method(or using
     * constructor) or the document is null, then null value will be returned.</li>
     * <li><b>{@code arr[0]}</b> represents the locations of the text lines. An
     * array of {@code java.awt.Dimension} class is used for this. So you can
     * cast it as per requirement.</li>
     * <li><b>{@code arr[1]}</b> represents the text lines. An array of String
     * is used for this. So you can cast as per requirement.
     * </P>
     * @param pageIndex A <b>non-zero based</b> value indicating the page index
     * of the page.
     * @return An {@code Object[][]} array where the text lines and dimensions of
     * those lines are stored.
     * @throws IOException
     */
    public Object[][] extractLines(int pageIndex) throws IOException{
        if(document == null) return null;
        ArrayList<Dimension> linePos = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        
        PDFTextStripper stripper = new PDFTextStripper()
        {
            @Override
            protected void startPage(PDPage page) throws IOException
            {
                startOfLine = true;
                super.startPage(page);
            }

            @Override
            protected void writeLineSeparator() throws IOException
            {
                startOfLine = true;
                super.writeLineSeparator();
            }

            @Override
            protected void writeString(String text, List<TextPosition> textPositions) 
                    throws IOException
            {
                if (startOfLine)
                {
                    TextPosition txtPos = textPositions.get(0);
                    linePos.add(new Dimension((int)txtPos.getXDirAdj(), 
                            (int)txtPos.getYDirAdj()));
                    lines.add(text);
                    startOfLine = false;
                }
            }
            
            boolean startOfLine = true;
        };
        stripper.setStartPage(pageIndex);
        stripper.setEndPage(pageIndex);
        stripper.getText(document);
        Object[][] data = new Object[2][linePos.size()];
        linePos.toArray(data[0]);
        lines.toArray(data[1]);
        return data;
    }
    
    public int getPageCount(){
        return document.getNumberOfPages();
    }
}
