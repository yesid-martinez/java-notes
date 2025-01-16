package arrays.arraylist;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2){
        return Integer.compare(u1.getAge(), u2.getAge());

        // It's also possible to use the 'compareTo' method
        // return u1.getName().compareTo(u2.getName());

        // The comparable interface must be consistent with the equals method
    }
}
