package TrabalhoADS;


public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Mercadoria dados = controle.dados(); // Atribuindo um retorno a variável.
        controle.formula(dados);
   }
}