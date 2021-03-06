package Iterator;

/**
 * 迭代器模式
 * 用于顺序访问集合对象的元素，不需要知道集合对象的底层表示
 */
public interface Iterator {
    public  boolean hasNext();
    public  Object next();
}
