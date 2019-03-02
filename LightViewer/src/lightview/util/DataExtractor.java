package lightview.util;

/**
 * @author Adeepa Gunathilake
 */

import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.util.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.*;
import java.awt.Point;
import org.apache.pdfbox.contentstream.PDFStreamEngine;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImage;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

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
     * array of {@code java.awt.Point} class is used for this. So you can
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
        if(document == null || pageIndex > getPageCount() || pageIndex < 1) 
            return null;
        ArrayList<Point> positions = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<PDFont> fonts = new ArrayList<>();
        ArrayList<Float> fontSizes = new ArrayList<>();
        PDFTextStripper stripper = new PDFTextStripper()
        {
            @Override
            protected void processTextPosition(TextPosition text) {
                super.processTextPosition(text);
                if((!positions.isEmpty()) && 
                        (int)text.getY() == positions.get(positions.size() - 1).getY() 
                        && fonts.get(fonts.size() - 1) == text.getFont()
                        && fontSizes.get(fontSizes.size() - 1) == text.getFontSizeInPt())
                {
                    lines.set(lines.size() - 1, lines.get(lines.size() - 1) +
                            text.getUnicode());
                }
                else{
                    positions.add(new Point((int)text.getX(), (int)text.getY()));
                    lines.add(text.getUnicode());
                    fonts.add(text.getFont());
                    fontSizes.add(text.getFontSizeInPt());
                }
            }
        };
        
        stripper.setStartPage(pageIndex);
        stripper.setEndPage(pageIndex);
        stripper.getText(document);
        
        Object[][] data = new Object[4][positions.size()];
        positions.toArray(data[0]);
        lines.toArray(data[1]);
        fonts.toArray(data[2]);
        fontSizes.toArray(data[3]);
        return data;
    }
    
    public void getImages(){
        PDFStreamEngine streamEngine = new PDFStreamEngine() {
            @Override
            protected void processOperator(Operator operator, List<COSBase> operands) throws IOException {
                String operation = operator.getName();
                if("Do".equals(operation)){
                    COSName objectName = (COSName) operands.get(0);
                    PDXObject xobject = getResources().getXObject( objectName );
                    if(xobject instanceof PDImageXObject){
                        PDImageXObject image = (PDImageXObject)xobject;
                        int imageWidth = image.getWidth();  
                        int imageHeight = image.getHeight();
                        
                    }
                }
                else super.processOperator(operator, operands);
            }
            
        };
    }
    
    public Dimension getPageSize(int pageIndex){
        document.getPage(pageIndex);
        return new Dimension((int)document.getPage(pageIndex).getMediaBox().getWidth(),
                (int)document.getPage(pageIndex).getMediaBox().getHeight());
    }
    
    public int getPageCount(){
        return document.getNumberOfPages();
    }

    @Override
    protected void finalize() throws Throwable {
        //document.close();
        super.finalize();
    }
    
    
}
