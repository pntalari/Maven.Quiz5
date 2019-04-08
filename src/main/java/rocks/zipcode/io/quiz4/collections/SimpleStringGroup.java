package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup<T> implements Iterable<T> {

    List<String> list;
    public SimpleStringGroup() {
        list = new ArrayList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(String string) {
        list.add(string);
    }

    public Boolean has(String string) {
        return list.contains(string);
    }

    public String fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(String string) {
       if(list.contains(string)){
          list.remove(string);
       }
    }

    public void clear() {
        list.clear();
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        for(T str: this){
            action.accept(str);
        }

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
