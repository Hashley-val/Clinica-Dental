import java.util.Scanner;

public class Clinica_Dental
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int opcPrincipal = 0;
        while (opcPrincipal !=4)
        {
            System.out.println("===========================");
            System.out.println("DENTAL CONNECT - BIENVENIDO");
            System.out.println("===========================");
            System.out.println("  ");
            System.out.println("Elige una opción:");
            System.out.println("1. Visor Publico");
            System.out.println("2. Registrarse");
            System.out.println("3. Iniciar sesión");
            System.out.println("4. Salir");

            opcPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcPrincipal)
            {
                case 1:
                    MenuPublico();
                    break;
                case 2:
                    MenuRegistro();
                    break;
                case 3:
                    MenuInicioSesión();
                    break;
                default:
                    

            }
        }

    }

    private static void MenuInicioSesión()
    {

    }

    private static void MenuRegistro()
    {

    }
    private static void MenuPublico()
    {

    }

}
