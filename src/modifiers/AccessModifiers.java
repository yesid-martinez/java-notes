package modifiers;

public class AccessModifiers {

    public static void staticExamples(){
        User fUser = new User("Natanael Cano", 22, 2674467, 999999);
        User sUser = new User("Peso Pluma", 30, 264356, 111111);

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

}
