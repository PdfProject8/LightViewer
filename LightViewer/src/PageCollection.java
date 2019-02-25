
/**
 * This is a collection class for Pages.
 * @author Adeepa Gunathilake
 */

public class PageCollection {     
    private final int capacity; //Represents the capacity of this class.
    private Page[] pages; //This array is used to stores the pages this class.
    private int current; //Current positio(the page referred currently in the pages array).

    /**
     * Initialize a new PageCollection class.
     * @param capacity The capacity of this class(i.e the maximum number of 
     * {@code Page} objects this collection class can bear).
     * @see Page
     */
    public PageCollection(int capacity) {
        if(capacity < 0) capacity = 0;
        this.capacity = capacity;
        pages = new Page[capacity];
    }
    
    /**
     * @return Capacity of this PageCollection i.e maximum number of {@code Page}
     * objects this class can bear.
     */
    public int getCapacity(){
        return capacity;
    }
    
    public Page getCurrentPage(){
        return pages[current];
    }
}
