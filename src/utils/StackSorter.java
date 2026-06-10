package utils;

import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        StackSorter sorter = new StackSorter();
        Stack<Integer> miPila = new Stack<>();

        miPila.push(34);
        miPila.push(3);
        miPila.push(31);
        miPila.push(98);
        miPila.push(92);
        miPila.push(23);

        System.out.println("Pila original (Tope al final): " + miPila);

        sorter.sortStack(miPila);

        System.out.println("Pila ordenada (Tope al final, los menores arriba): " + miPila);
        
        System.out.println("El número más pequeño en el tope es: " + miPila.peek());
    }
}
