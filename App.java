import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("Olaaaa, seja bem vindo ao Robozinho Mori! Através deste canal podemos te ajudar com nosso Contador de Vogais virtual.\nPara começarmos.. Digite o seu nome:");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Muito bem " + nome + ", Digite a seguir qual trecho de texto você deseja contar as vogais:");
        String frase = input.nextLine();
        input.close();
        int vog = 0, cons = 0;
        frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == 32) continue;
            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
                vog++;
                continue;
            }
            if(c >= 98 && c <= 122) cons++;
        }
        System.out.println("\nTotal de vogais: " + vog + "\nTotal de consoantes: "+cons +"\nObrigado pela preferência!");
        System.out.println("Esse é o tamanho da frase: "+ frase.length());
        
    }
}
