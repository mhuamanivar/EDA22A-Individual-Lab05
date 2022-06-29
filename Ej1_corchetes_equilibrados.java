import java.util.Scanner;
import java.util.Stack;

public class Ej1_corchetes_equilibrados {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        cadena = sc.next();
        char letras[] = cadena.toCharArray();
        
        if (cadenaAdecuada(letras)) {
            System.out.println(verificarEquilibrio(letras) ? "SI" : "NO");
        } else {
            System.out.println("La cadena contiene otros caracteres");
        }
        
        
    }
    
    public static boolean cadenaAdecuada(char[] letras) {
        boolean soloCorchetes = true;
        
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] != '(' && letras[i] != '{' && letras[i] != '[' && letras[i] != ']' && letras[i] != '}' && letras[i] != ')') {
                soloCorchetes = false;
            }
        }
        
        return soloCorchetes;
    }
    
    public static boolean verificarEquilibrio(char[] letras) {
        
        Stack <Character> stackLetras = new Stack <Character>();
        
        for (int i = 0; i < letras.length; i++) {
            
            if (letras[i] == '(' || letras[i] == '[' || letras[i] == '{') {
                stackLetras.push(letras[i]);
            }
            else if (stackLetras.isEmpty()){
                return false;
            }
            else {
                switch (letras[i]) {
                    case ')' :
                        if (stackLetras.peek() == '(') stackLetras.pop();
                        break;
                    case ']' :
                        if (stackLetras.peek() == '[') stackLetras.pop();
                        break;
                    case '}' :
                        if (stackLetras.peek() == '{') stackLetras.pop();
                        break;
                }
            }
        }
        return stackLetras.isEmpty();
    }
}
