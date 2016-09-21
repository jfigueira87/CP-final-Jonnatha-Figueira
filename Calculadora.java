package principal;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
              
    }
    
    public static int restar(int a, int b){
		if (a<b){
			System.out.println("Error. El primer número debe ser mayor para poder realizar la resta");
		}else{
			int s=a-b;
			return s;
		}
        
    }
    
    
}