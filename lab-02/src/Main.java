import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // --- CustomArrayList demo ---
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);


        System.out.println("Before sort:      " + arrayList);

        // Natural order (ascending) — like Comparable, rule is fixed inside sort()
        arrayList.sort();
        System.out.println("After sort():     " + arrayList);

        // Descending — custom rule passed as Comparator
        arrayList.sort(Comparator.comparingInt(a -> a));
        System.out.println("After sort(desc): " + arrayList);


    }
}
