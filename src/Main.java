import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(3);
        set1.add(1);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(9);
        System.out.println(set2);
        System.out.println();
        System.out.println();
        System.out.println(symmetricDifference(set1, set2));

    }

        public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
            Set<Integer> set3 = new TreeSet<>(set1);
            set3.addAll(set2);
            Set<Integer> sort = new HashSet<>(set1);
            sort.retainAll(set2);
            set3.removeAll(sort);
            return set3;
        }


}