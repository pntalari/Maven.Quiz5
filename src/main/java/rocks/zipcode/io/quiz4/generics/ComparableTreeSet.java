package rocks.zipcode.io.quiz4.generics;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable {

    Set<T> sets;

    public ComparableTreeSet() {

    }

    public ComparableTreeSet(T... arr) {
        this.sets = new TreeSet<T>();
        for (T set : arr) {
            this.sets.add(set);
        }
    }


    public int compareTo(ComparableTreeSet<T> o) {
        if (o.compareTo(o) > 1)
            return -1;
        else if (o.compareTo(o) < 1)
            return 1;
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return sets.toString();
    }
}
