package arrays.arraylist;

import java.util.*;

public class Lists {
    public static void arraysExamples(){
        // Classic array
        // Fixed size and absence of methods
        int[] nums = {3, 80, 72, 64, 99, 22, 2, 4, 1, 77, 28};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // “var” Inferences the data type
        // The compiler will automatically infer the variable type based on the assigned value.
        var user = new User("Axel", 20);
        var sUser = new User("Pirat4", 30);
        var thUser = new User("Ibai", 40);

        // Arraylist class
        List<User> usersList = new ArrayList<>();

        usersList.add(sUser);
        usersList.add(thUser);
        usersList.add(user);

        System.out.println(usersList);
         Collections.sort(usersList);
        System.out.println("Ordered by name: " + usersList);

        List<String> usersName = new LinkedList<>();
        usersName.add(sUser.name);
        usersName.add(thUser.name);
        usersName.add(user.name);

        System.out.println("Unordered list: " + usersName);
        Collections.sort(usersName);
        System.out.println("Ordered list: " + usersName);

        System.out.println(usersList);
        AgeComparator comparator = new AgeComparator();
        Collections.sort(usersList, comparator);
        System.out.println("Ordered by age: " + usersList);
    }
}
