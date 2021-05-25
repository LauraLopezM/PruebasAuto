package com.ejemolo.uno;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
	public static void main(String[] args)
	//ejercicio 1 hoja 2
    {
        String palabra1;
        String palabra2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera palabra ");
        palabra1 = teclado.nextLine();
        System.out.print("Introduzca la segunda palabra ");
        palabra2 = teclado.nextLine();
        
        char[] Char1 = palabra1.toCharArray();
        char[] Char2 = palabra2.toCharArray();
        
        Arrays.sort(Char1);
        Arrays.sort(Char2);
        
        System.out.println(palabra1);
        System.out.println(palabra2);
       
        
        if (Arrays.equals(Char1, Char2)) {
        	System.out.printf("  Las palabras SI son anagramas  "  );
        	
        }else {
        	System.out.printf("  Las palabras NO son anagramas   "   );
        }
        
        
    }
}
