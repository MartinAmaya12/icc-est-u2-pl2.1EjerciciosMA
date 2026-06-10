package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {
    public boolean esPalindromo(String texto) {
        Queue<Character> cola = new LinkedList<>();
        Stack<Character> pila = new Stack<>();

        for (char letra : texto.toCharArray()) {
            cola.add(letra);  
            pila.push(letra); 
        }

  
        while (!cola.isEmpty()) {
   
            char deLaCola = cola.remove(); 
            char deLaPila = pila.pop();    

    
            if (deLaCola != deLaPila) {
                return false; 
            }
        }


        return true;
    }
}
