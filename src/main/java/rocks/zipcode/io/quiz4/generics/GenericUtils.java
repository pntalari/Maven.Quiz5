package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {


    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new HashSet<Set<T>>();
        if (originalSet.isEmpty()) {
            sets.add(new TreeSet<>());
         //    sets.descendingSet();
//            List listRet = new ArrayList(sets);
//            Collections.sort(listRet,Collections.reverseOrder());
//            Set setRet = new LinkedHashSet(listRet);
            return sets;
        }
        List<T> list = new ArrayList<T>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
        for (Iterable<T> set : powerSet(rest)) {
            Set<T> newSet = new HashSet<>();
            newSet.add(head);
            newSet.addAll((Collection<? extends T>) set);
            sets.add(newSet);
            sets.add((Set<T>) set);
        }
      //  sets.descendingSet();
//        List listRet = new ArrayList(sets);
//        Collections.sort(listRet,Collections.reverseOrder());
//        Set setRet = new LinkedHashSet(listRet);
        return sets;
    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }


}
