package utils;

import java.util.ArrayDeque;

public class SignValidator {
    public boolean isValid(String s){
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } 
            
            else if (c == ')' || c == '}' || c == ']') {
                
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if (c == ')' && tope != '(') return false;
                if (c == '}' && tope != '{') return false;
                if (c == ']' && tope != '[') return false;
            }
        }
        
        return pila.isEmpty();
    }
}
