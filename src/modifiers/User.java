package modifiers;

public class User {
    // Instance variables
    String name;
    public int age;
    protected long id;
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

    public static void permissionsExamples() {
        // this.age = 18;
        // Cannot access instance variables or methods
        // Error: 'modifiers.User.this' cannot be referenced from a static context
    }
}
