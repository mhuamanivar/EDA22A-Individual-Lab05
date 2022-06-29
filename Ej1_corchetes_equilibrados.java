//Nombre: Melsy Melany Huamaní Vargas

import java.util.Scanner;
import java.util.Stack;

public class Ej1_corchetes_equilibrados {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        
	//Se convierte en arreglo la cadena ingresada.

        cadena = sc.next();
        char letras[] = cadena.toCharArray();

	//Se verifica si la cadena contiene otros caracteres
        
        if (cadenaAdecuada(letras)) {
            System.out.println(verificarEquilibrio(letras) ? "SI" : "NO");
        } else {
            System.out.println("La cadena contiene otros caracteres");
        }
        
    }
    
    //Metodo para verificar que la cadena solo contenga "(", "[", "{", "}", "]", ")"

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
        
	//Se crea el stack donde se trabajaran los corchetes
	
        Stack <Character> stackLetras = new Stack <Character>();
        
        //Se ingresan al principio todos los inicios de corchetes
	//Luego cada corchete va eliminando su par del stack, solo si es que corresponde

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
