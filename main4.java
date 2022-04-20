import java.util.Scanner;

public class main4 {
    public static void main(String[] args){

        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o Valor Inicial(a1): ");
        double vInicial = valores.nextDouble();
        System.out.println("Digite o Número de Termos(n): ");
        double vTermo = valores.nextDouble();
        System.out.println("Digite uma Razão(q) maior ou igual a 2: ");
        double vRazao = valores.nextDouble();
        valores.close();
        if (vRazao < 2){
            System.out.println("Insira uma razão maior que 2!");
        }

        double resultado = (vInicial * (Math.pow(vRazao, vTermo) -1) / (vRazao -1));
        System.out.println("Resultado final é: " + resultado);
    }
}