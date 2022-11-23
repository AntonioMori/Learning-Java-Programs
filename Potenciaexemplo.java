import java.util.Scanner;
public class Potenciaexemplo {
    
    static int potencia(int a, int b)
	{
		if (b == 0)
			return 1;	
		int resposta = a;
		int incremento = a;
		int i, j;
		
		for (i = 1; i < b; i++) {
			for (j = 1; j < a; j++) {
				resposta += incremento;
			}
			incremento = resposta;
		}
		return resposta;}
    public static void main(String[] args) {
        System.out.println("Seja bem vindo novamente ao Robozinho Mori!\nAtravés deste programa iremos trabalhar com potências.\nDigite base desejada: ");
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();
        System.out.println("Agora digite o expoente desejado: ");
        int expoente = entrada.nextInt();
        int resultado = potencia(base,expoente);
        System.out.println("O resuldato da operação é:\n"+base+"^"+expoente+"="+ resultado);
        entrada.close();
    }
}



	
	
	

	
	
	
	



