package lightview.util;

import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;

/**
 * @author Viduranga Landers
 */
public class DataCache {
    private int currentPage;
    private File currentFile;
    private PageCollection pageCache = null;
    private PDDocument doc;

    private static DataCache instance = null;
    
    private DataCache(){
        currentPage = 0;
        currentFile = null;
        doc = null;
    }
    
    private DataCache(File currentFile, int currentPage, int collectionLength){
        this.currentFile = currentFile;
        this.currentPage = currentPage;
        if(this.pageCache == null) pageCache = new PageCollection(collectionLength);
        else pageCache.resize(collectionLength);
        doc = null;
        
    }
    
    public static DataCache getInstance(){
        if(instance == null){
            instance = new DataCache();
        }
        return instance;
    }
    
    public static DataCache getInstance(File file, int pgIndex, int collectionLen){
        
        return getInstance();
    }
    
    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public File getCurrentFile() {
        return currentFile;
    }

    public void setCurrentFile(File currentFile) {
        this.currentFile = currentFile;
    }

    public PageCollection getPageCache() {
        return pageCache;
    }

    public void setPageCache(PageCollection pageCache) {
        this.pageCache = pageCache;
    }
    
    public PDDocument getDoc() {
        return doc;
    }

    public void setDoc(PDDocument doc) {
        this.doc = doc;
    }
    

    
}
