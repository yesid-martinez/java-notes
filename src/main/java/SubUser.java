import modifiers.User;

// Attributes or methods marked as protected can be accessed from child classes in other packages

public class SubUser extends User {
    public SubUser(String name, int age, long id, long accountId) {
        super(name, age, id, accountId);
    }

    public void protectedAccess(){
        System.out.println("New user ID: " + this.id);
        // Access allowed because SubUser inherits from User
    }
}
