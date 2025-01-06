package modifiers;

public class AccessModifiers {

    static User fUser = new User("Natanael Cano", 22, 2674467, 999999);
    User sUser = new User("Peso Pluma", 30, 264356, 111111);

    public static void staticExamples(){

        /*int fUserPermissions = fUser.getPermissions();
        int sUserPermissions = sUser.getPermissions();*/
        // Warn: Static member 'modifiers.User.getPermissions()' accessed via instance reference

        int userPermissions = User.getPermissions();
        System.out.println("User permissions code:" + userPermissions);

        /*fUser.deletePermissions();
        int sUserPermissions = sUser.getPermissions();
        System.out.println("sUserPermissions);*/
        // Output: 0 - Modifies all objects because a class method is used

        User.deletePermissions();
        int sUserPermissions = User.getPermissions();
        System.out.println("Second user Permissions code:" + sUserPermissions);
    }

    public static void accessExamples(){
        // Public access
        // Allows modification of the attribute value and/or access to public methods
        System.out.println("User age: " + fUser.age);
        fUser.age = 33;
        System.out.println("Modified user age: " + fUser.age);
        // It is not possible to access private methods
        // User.permissionsExamples();
        // Error: 'permissionsExamples()' has private access in 'modifiers.User'
    }
}