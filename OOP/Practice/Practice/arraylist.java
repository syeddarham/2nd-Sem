import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println("Initial List: "+list);
        System.out.println("Is List Empty? "+list.isEmpty());
        System.out.println("List contains 3? "+list.contains(3));
        System.out.println("Index of 2: "+list.indexOf(2));
        list.set(1, 10);
        System.out.println("List after setting 10 at index 1: "+list);
        list.remove(1);
        System.out.println("List after removing 10: "+list);
        list.clear();
        System.out.println("List after clearing: "+list);
        Collections.sort(list);
        System.out.println("List after sorting: "+list); 
    }  
}

