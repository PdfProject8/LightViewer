import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper; 
public class AddingContent {
   public static void main (String args[]) throws IOException {
      File file = new File("E:/BlenderGuru_KeyboardShortcutGuide_v2.pdf");
      PDDocument document = PDDocument.load(file);

      //Instantiate PDFTextStripper class
      PDFTextStripper pdfStripper = new PDFTextStripper();
      //Retrieving text from PDF document
      String text = pdfStripper.getText(document);
      System.out.println(text);

      //Closing the document
      document.close();
   }
}