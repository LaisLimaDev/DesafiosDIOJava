import java.io.IOException;
import java.util.Scanner;

/*Enunciado: 
 * A fórmula de Binet é uma forma de calcular números de Fibonacci.
 
Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula .
Entrada: A entrada é um número natural n (0 < n ≤ 50).

Saída: A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

 */

public class Binet {

  public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        double number = entrada.nextDouble();
        double resultado = (Math.pow((1+Math.pow(5, 0.5)) / 2,number) - Math.pow((1-Math.pow(5, 0.5)) / 2,number)) / Math.pow(5,0.5);
        System.out.printf("%.1f\n",resultado);
       
    }
   
} 