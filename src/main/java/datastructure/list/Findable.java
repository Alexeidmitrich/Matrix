package datastructure.list;

public interface Findable <T> {

     boolean find(T item);

     boolean find(T item, int startIndex);

     boolean find(T item, int startIndex, int endIndex);

}
