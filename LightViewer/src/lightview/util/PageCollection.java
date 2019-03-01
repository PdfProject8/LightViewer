package lightview.util;


/**
 * This is a collection class for Pages.
 * @author Adeepa Gunathilake
 */

public class PageCollection {     
    private final int capacity; //Represents the capacity of this class.
    private Page[] pages; //This array is used to stores the pages this class.

    /**
     * Initialize a new PageCollection class. If {@code capacity} is set to a value
     * equal or less than zero,then the capacity will be set to 0.
     * @param capacity The <b>non-zero based</b> capacity of this class(i.e the maximum number of 
     * {@code Page} objects this collection class can bear).
     * @see Page
     */
    public PageCollection(int capacity) {
        if(capacity < 1) capacity = 0;
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
     * Sets a page(inputs a page) in this collection. The index(i.e position) of
     * the page is represented by {@code index} parameter. If the index is greater
     * than the capacity of this collection or less than 0, then no page will 
     * be set.
     * @param index zero based index (or the position of the page in this collection)
     * @param page The {@code Page} object to be set.
     */
    public void setPage(int index, Page page){
        if (index < 0 || index > capacity - 1) return;
        pages[index] = page;
    }
    
    /**
     * @param index The zero-based index of the page you want to get.
     * @return Page relevant to the given index or if the index is greater than
     * the number of pages this class has, then null will return.
     */
    public Page getPage(int index){
        return (index < 0 || index > capacity - 1) ? null : pages[index];
    }
    
    /**
     * Resize the size of this PageCollection i.e extend or reduce the capacity
     * of this PageCollection. The new capacity of the collection is the value of
     * parameter {@code newCapacity}. If new capacity is equal or less than zero,
     * then new capacity of the collection will be 0. <br><br>
     * If the capacity is reduce, the data which currently has in this class 
     * which are out of the bounds of this class when the capacity reduced will 
     * be lose.<br><br>
     * example : <br><br>If the current capacity of this class is 100 and you're going
     * to reduce the capacity to 80, then all the pages in the range of 1
     * <sup>st</sup> page to 80<sup>th</sup> page including 1<sup>st</sup> page
     * and 80<sup>th</sup> page will be saved while pages in the range of 
     * 80<sup>th</sup> page to 100<sup>th</sup> page will lose.
     * @param newCapacity The <b>non-zero based</b> new capacity.
     */
    public void resize(int newCapacity){
        if(newCapacity < 1) newCapacity = 0;
        Page[] temp = pages;
        pages = new Page[newCapacity];
        System.arraycopy(temp, 0, pages, 0, 
                (newCapacity >= temp.length) ? temp.length : pages.length);
    }
}
