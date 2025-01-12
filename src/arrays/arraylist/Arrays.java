package arrays.arraylist;

import java.util.ArrayList;

public class Arrays {
    public static void arraysExamples(){
        // Classic array
        // Fixed size and absence of methods
        int[] nums = new int[5];
        for (int in = 0; in < nums.length; in++){
            nums[in] = in + 3;
            System.out.println(nums[in]);
        }

        // “var” Inferences the data type
        // The compiler will automatically infer the variable type based on the assigned value.
        var user = new User("Axel", 20);
        var sUser = new User("Pirat4", 30);

        // Arraylist class
        ArrayList<User> usersList = new ArrayList<>();
        System.out.println(usersList); // Output: [] (Empty list)
        usersList.add(user);
        User newUser = usersList.getFirst();
        System.out.println(newUser.name);
        usersList.add(sUser);
        System.out.println(usersList.size());

        int i = 1;
        for (User value : usersList) {
            System.out.println(i + ": " + value.name);
            i+= 1;
        }

        String resp = user.toString();
        System.out.println(resp);
    }
}
