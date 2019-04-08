package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> implements GroupInterface {

    List myList;

    public SortedGroup() {
        this.myList = new ArrayList();
    }

    public Integer indexOf(T value) {
        return myList.indexOf(value);
    }

    @Override
    public Integer count() {
        return myList.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return myList.contains(valueToInsert);
    }

    @Override
    public Object fetch(int indexOfValue) {
        return myList.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        myList.add(string);
        Collections.sort(myList);
    }

    @Override
    public void delete(Object valueToInsert) {
        myList.remove(valueToInsert);
        Collections.sort(myList);
    }

    @Override
    public void clear() {
        myList.clear();
    }

    @Override
    public Iterator iterator() {
        return myList.iterator();
    }
}
