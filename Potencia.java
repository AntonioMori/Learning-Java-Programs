import java.util.Scanner;

public class Potencia {
    //static
    int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        int baseV = input.nextInt();
        System.out.println("Digite o valor do expoente: ");
        int expoenteV = input.nextInt();
        
        Potencia aula3 = new Potencia();
        int resultado = aula3.calcularPotencia(2, 3);
        System.out.println(resultado);
    }
}
