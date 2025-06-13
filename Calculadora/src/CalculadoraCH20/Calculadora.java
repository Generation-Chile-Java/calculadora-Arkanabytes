package CalculadoraCH20;
import java.lang.Exception;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public int restar(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) throws Exception {
        if (b==0){
            throw new Exception("No se puede dividir por cero");
        }
        return a/b;
    }
    public int modulo(int a, int b) throws Exception {
        if (b==0){
            throw new Exception("No se puede calcular un modulo por cero");
        }
        return a%b;
    }
}