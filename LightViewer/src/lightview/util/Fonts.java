package lightview.util;


import org.apache.pdfbox.pdmodel.font.PDFont;

import java.util.*;
import java.awt.*;
import org.apache.pdfbox.pdmodel.font.PDFontDescriptor;

/**
 *
 * @author Adeepa Gunathilake
 */
public class Fonts {
    public static Font getFont(PDFont font, int size){
        /*Map<String, Font> fontMap = new HashMap<>();
        fontMap.put("Times-Roman", new Font("Times New Roman", Font.PLAIN, Size));
        fontMap.put("Times-Bold", new Font("Times New Roman", Font.BOLD, Size));
        fontMap.put("Times-Italic", new Font("Times New Roman", Font.ITALIC, Size));
        fontMap.put("Times-Bold-Italic", new Font("Times New Roman", Font.BOLD | Font.ITALIC, Size));*/
        PDFontDescriptor desc = font.getFontDescriptor();
        String name = desc.getFontName(), family = desc.getFontFamily();
        int type = Font.PLAIN;
        if(name.contains(",")){
            String[] f = name.split(",");
            if(f.length > 1){
                switch(f[1].trim()){
                    case "Bold":
                        type = Font.BOLD;
                        break;
                    case "Italic":
                        type = Font.ITALIC;
                        break;
                    case "BoldItalic":
                        type = Font.BOLD | Font.ITALIC;
                        break;
                }
            }
            name = f[0];
        }
        return new Font((family == null) ? name : family, type, size);
        
    }
}
