import java.util.Stack;
import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("====== PRACTICA DE ESTRUCTURA DE DATOS ======\n");
        System.out.println("\nEstudiante: Martin Amaya\n");
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }
    public static void runSignValidator(){
        SignValidator signValidator = new SignValidator();

        String cadena1 = "{()]}";
        String cadena2 = "{[(])}";

        System.out.println("Ejercicio 01: Validacion de Signos");
        System.out.println("Cadena: " + cadena1 + "| Resultado: " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + "| Resultado: " + signValidator.isValid(cadena2));

    }

    public static void runStackSorter(){
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        StackSorter sorter = new StackSorter();
        System.out.println("\nEjercicio 02: Ordenar Stack");
        System.out.println("Stack original: " + stack);

        sorter.sortStack(stack);

        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());
    }

    public static void runQueuePalindrome(){
        QueuePalindrome queuePalindrome = new QueuePalindrome();

        System.out.println("\nEjercicio 03: Palindromo usando colas");
        System.out.println("Ana     | Resultado: " + queuePalindrome.esPalindromo("ana"));
        System.out.println("Radar     | Resultado: " + queuePalindrome.esPalindromo("radar"));
        System.out.println("Java     | Resultado: " + queuePalindrome.esPalindromo("Java"));
    }



}
