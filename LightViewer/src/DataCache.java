
import java.io.File;

/*
 */

/**
 *
 * @author Viduranga Landers
 */
public class DataCache {
    private static int currentPage;
    private static java.io.File currentFile;
    private static PageCollection pageCache;

    public static int getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(int currentPage) {
        DataCache.currentPage = currentPage;
    }

    public static File getCurrentFile() {
        return currentFile;
    }

    public static void setCurrentFile(File currentFile) {
        DataCache.currentFile = currentFile;
    }

    public static PageCollection getPageCache() {
        return pageCache;
    }

    public static void setPageCache(PageCollection pageCache) {
        DataCache.pageCache = pageCache;
    }
    
}
