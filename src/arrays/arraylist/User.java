package arrays.arraylist;

public class User implements Comparable<User>{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User anotherUser) {
        return this.getName().compareTo(anotherUser.getName());
    }
}
