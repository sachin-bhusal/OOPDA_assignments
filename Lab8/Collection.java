package Lab8;
import java.util.*;

public class Collection 
{    
      public static void main(String[] args) {
        // Sorting an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 6));
        System.out.println("Original ArrayList: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Sorting a LinkedList
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Banana", "Apple", "Cherry", "Mango"));
        System.out.println("Original LinkedList: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // Sorting in reverse order arraylist
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList sorted in reverse order: " + arrayList);

        // Sorting in reverse order for linkedlist
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println("ArrayList sorted in reverse order: " + linkedList);
    }
}
