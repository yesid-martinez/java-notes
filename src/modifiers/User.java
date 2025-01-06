package modifiers;

public class User {
    // Instance variables
    String name; // Default access (package-private)
    /* Accessible only within the same package
    Classes outside the package will not be able to directly access that member, even if they are in an inheritance hierarchy */

    public int age;

    protected long id;
    /* Both protected and default access allow classes in the same package to access the attribute or method */

    private long accountId;

    // Class variables
    // If any object modifies the variable, it changes in all objects
    private static int permissionsCode;

    public User(String name, int age, long id, long accountId) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.accountId = accountId;

        /*this.permissionsCode = permissionsCode;
        Error: Permitted but conceptually invalid
        Static member 'modifiers.User.permissionsCode' accessed via instance reference*/
        User.permissionsCode = 777;
    }

    // Class methods
    public static int getPermissions() {
        return User.permissionsCode;
    }

    public static void setPermissions(int code) {
        User.permissionsCode = code;
    }

    public static void deletePermissions() {
        User.permissionsCode = 0;
    }

    private static void permissionsExamples() {
        // this.age = 18;
        // Cannot access instance variables or methods
        // Error: 'modifiers.User.this' cannot be referenced from a static context

        System.out.println("Private method example");
    }
}
