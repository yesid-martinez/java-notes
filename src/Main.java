public class Main {
    public static void main(String[] args) {
        String name = "Axel";
        byte age = 20;

        if (name.equals("Admin") || name.equals( "admin")) {
            System.out.printf("Usuario incorrecto %n");
        } else if (age >= 18 && age <= 24) {
            System.out.printf("Usuario permitido %n");
        }

        switch (name) {
            case "Yesid":
                System.out.print("Bienvenido Yesid");
                break;
            case "Axel":
                System.out.print("Bienvenido Axel");
                break;
            default:
                System.out.print("Solo personal autorizado.");
        }
    }
}