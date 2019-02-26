
/**
 * This is a collection class for Pages.
 * @author Adeepa Gunathilake
 */

public class PageCollection {     
    private final int capacity; //Represents the capacity of this class.
    private Page[] pages; //This array is used to stores the pages this class.

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
    
    /**
     * @param index The zero-based index of the page you want to get.
     * @return Page relevant to the given index.
     */
    public Page getPage(int index){
        return (index < 0 || index > capacity - 1) ? null : pages[index];
    }
}
