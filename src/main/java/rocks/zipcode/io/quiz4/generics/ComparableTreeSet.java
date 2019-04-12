package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T extends Comparable> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>> {

    public ComparableTreeSet() {

    }

    public ComparableTreeSet(T... arr) {
        for (T el : arr) {
            add(el);
        }
    }


    @Override
    public int compareTo(ComparableTreeSet<T> o) {
     //   return toString().compareTo(o.toString());

        Iterator<T> other = o.iterator();

        for(T current: this){
            T otherObj = other.next();

            if(current.compareTo(otherObj) !=0) {
                return current.compareTo(otherObj);
            }
        }
        return 0;

    }

}
