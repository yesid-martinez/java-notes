public class Main {
    public static void main(String[] args) {

        String fPass = "AxelGabber";

        // Verifica si las dos variables apuntan al mismo objeto en la memoria
        if (fPass == "axelgabber") {
            System.out.println("First test passed");
        } else {
            System.out.println("First test failed");
        }

        String USER_DATA = "3AS2s471DYG8Q25J";

        // EL método equals() Se utiliza al comparar el contenido de Strings
        if (fPass.equals(USER_DATA)) {
            System.out.println("Second test passed");
        } else {
            System.out.println("Second test failed");
        }

    }
}