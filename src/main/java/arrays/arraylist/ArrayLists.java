package arrays.arraylist;

// import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public class ArrayLists {
    private static int[] nums; // Field

    public  static void runFixedArrays(){
        // Classic fixed array - Fixed size and absence of methods
        // Arrays are fixed-size, memory-efficient structures that can store primitives or objects.
        // They’re low-level and require external utilities (Arrays) for operations like sorting or printing.

        // Local variable
        // int[] nums = new int[5]; Warning! New array - Field hidden (Shadowing)
        // System.err.println(nums.length);

        nums = new int[5];

        nums[0] = 3;
        nums[1] = 6;
        nums[2] = 1;
        nums[3] = 5;
        nums[4] = 2;

        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
    }

    public static void arrayListExamples(){
        // Lists (like ArrayList) are dynamic, object-oriented containers that grow automatically and provide many built-in methods for manipulation.
        // They only hold objects and rely on the Collections framework for advanced operations.

        // Tied to ArrayList type
        ArrayList arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(0);
        arrayList.add(4);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        // arrayList.stream().forEach(System.out::println);
        // System.out.println(arrayList.isEmpty());
        // System.out.println(arrayList.size());
        // System.out.println(arrayList.getLast());


        // List interface - High abstraction level
        // List<String> usersList = new ArrayList<>();
        List<String> usersList = new LinkedList<>();

        usersList.add("Dariel");
        usersList.add("Axel");

        Collections.sort(usersList);
        System.out.println("Ordered by name: " + usersList);
    }
}
