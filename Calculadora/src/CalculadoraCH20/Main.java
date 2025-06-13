package CalculadoraCH20;
import java.util.Scanner;
import java.lang.Exception;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("==========Calculadora Basica Generation =========="); //Titulo
        System.out.println("Ingresa el primer numero: "); //Solicito Ingrese el primer digito
        int num1 = sc.nextInt(); // guarda el valor de la variable
        System.out.println("Ingresa el segundo numero: "); //Solicito Ingrese el segundo digito
        int num2 = sc.nextInt(); // guarda el valor de la variable

        System.out.println("Ingresa el operador +,-,*,/ :"); //Solicito un operador
        char operador = sc.next().charAt(0); // los guarda en la variable tipo caracter
        int resultado = 0;
        boolean valido = true;

        try {
            switch (operador) {
                case '+':
                    resultado = calc.sumar(num1, num2);
                    break;
                case '-':
                    resultado = calc.restar(num1, num2);
                    break;
                case '*':
                    resultado = calc.multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = calc.dividir(num1, num2);
                    break;
                case '%':
                    resultado = calc.modulo(num1, num2);
                    break;
                default:
                    valido = false;
                    System.out.println("Resultado: " + resultado);
            }
            if (valido) {
                System.out.println("Resultado: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        System.out.println("\n\n=======================Proceso Finalizado=======================");
        System.out.println("==========Gracias por utilizar calculadora Generation ==========");


        System.out.println("\n Autor:Consuelo Pinto");
    }
}