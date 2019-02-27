/**
 * @author Adeepa Gunathilake
 */

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import java.awt.Dimension;
import java.util.ArrayList;

public class DataExtractor {
    private File file = new File("E:/BlenderGuru_KeyboardShortcutGuide_v2.pdf");
    private PDDocument document;
    
    public DataExtractor(){
        try {
            document = PDDocument.load(file);
        } catch (IOException ex) {
            Logger.getLogger(DataExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Extracts the text lines and the locations of the start positions of those
     * lines. This method returns an Object[][] array which the size is 
     * Object[2][number of text lines in the page]. This array contains the text
     * lines and the locations of those lines as follows, <br>
     * <p>
     * assume the code is like this,<br>
     * {@code Object[][] arr = extractLines(i);}<br>then,
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
    
    public static void main(String []a){
        DataExtractor pdf = new DataExtractor();
        try {
            Object[][] data = pdf.extractLines(1);
            //Dimension[] pos = (Dimension[])data[0];
            //String[] text = (String[]) data[1];
            System.out.println(pdf.getPageCount());
        } catch (IOException ex) {
            Logger.getLogger(DataExtractor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
