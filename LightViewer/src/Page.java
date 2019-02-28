
/**
 * @author Adeepa Gunathilake
 */

import java.awt.*;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;


public class Page {
    private JPanel page;
    private final DataExtractor extractor;
    private final int pageIndex;
    
    public Page(PDDocument doc, int pageIndex) {
        this.pageIndex = pageIndex;
        extractor = new DataExtractor(doc);
    }
    
    public JPanel getPage() throws IOException{
        createPage();
        return page;
    }
    
    public void createPage() throws IOException{
        page = new JPanel();
        page.setLayout(null);
        page.setBackground(Color.WHITE);
        page.setSize(extractor.getPageSize(pageIndex));
        JTextArea[] lines = createText();
        for(int i = 0; i < lines.length; i++){
            page.add(lines[i]);
        }
    }
    
    private JTextArea[] createText() throws IOException{
        ArrayList<JTextArea> lines = new ArrayList<>();
        Object[][] data = extractor.extractLines(pageIndex);
        Point[] loc = Arrays.copyOf(data[0], data[0].length, Point[].class);
        String[] text = Arrays.copyOf(data[1], data[1].length, String[].class);
        PDFont[] font = Arrays.copyOf(data[2], data[2].length, PDFont[].class);
        Float[] sizes = Arrays.copyOf(data[3], data[3].length, Float[].class);
        
        for(int i = 0; i < loc.length; i++){
            PDFontDescriptor fd = font[i].getFontDescriptor();
            int size = (int)sizes[i].floatValue();
            System.out.println(size);
            JTextArea txt = new JTextArea();
            txt.setSize(800, size + 3);
            Map<TextAttribute, Object> attributes = new HashMap<>();
            
            attributes.put(TextAttribute.SIZE, size);
            attributes.put(TextAttribute.FAMILY, 
                    font[i].getFontDescriptor().getFontFamily());
            attributes.put(TextAttribute.WEIGHT, 
                    font[i].getFontDescriptor().getFontWeight());
            
            Font txtFont = new Font(attributes);
            //txtFont.
            txt.setFont(txtFont);
            txt.setText(text[i]);
            txt.setForeground(Color.BLACK);
            txt.setLocation(loc[i]);
            txt.setBorder(null);
            txt.setBackground(new Color(0,0,0,0));
            txt.setEditable(false);
            lines.add(txt);
            System.out.println(fd.getFontFamily());
        }
        return Arrays.copyOf(lines.toArray(), lines.size(), JTextArea[].class);
    }
}
