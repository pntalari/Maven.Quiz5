package rocks.zipcode.io.quiz4.generics;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface  {
    List<T> list;

    public Group() {
        list = new ArrayList<>();
    }

    public Integer count() {

        return list.size();
    }

    public T fetch(int indexOfValue) {

        return list.get(indexOfValue);
    }


    @Override
    public Boolean has(Object valueToInsert) {
        return list.contains(valueToInsert);
    }

    @Override
    public void insert(Object string) {
        list.add((T) string);
    }

    @Override
    public void delete(Object valueToInsert) {
        list.remove(valueToInsert);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        for(Object obj: this){
            action.accept(obj);
        }

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
