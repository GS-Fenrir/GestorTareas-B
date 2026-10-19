import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> tareas = new ArrayList<>();
    static String MENU = "    /---MENÚ---\\    \n" +
        "   1. Agregar tarea.\n" +
        "   2. Eliminar tarea.\n" +
        "   3. Salir.\n" +
        "Elige una opción: ";
    public static void main(String[] args) throws Exception {
        mainMenu();
    }

    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print(MENU);
        int opt = input.nextInt();
        
        switch(opt){
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> end();
        }
    }

    public static void agregarTarea(){
        tareas.add("tarea1");
    }

    public static void end(){
        System.out.println("Sesión finalizada");
    }
}