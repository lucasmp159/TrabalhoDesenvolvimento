package TrabalhoADS;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Mercadoria dados = controle.dados(); // Atribuindo um retorno a variável.
        controle.formula(dados);

        Peso peso = new Peso();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o peso:");
        peso.setPeso(leitor.nextFloat());
        System.out.println("Qual o tamanho da mercadoria?");
        peso.setTamanho(leitor.nextFloat());
        System.out.println("Valor do produto: " + peso.calcularValor()); //valor baseado no peso e tamanho
    }

}
