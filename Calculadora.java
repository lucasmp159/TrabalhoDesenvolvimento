package TrabalhoADS;

public class Calculadora {
      public int somar(int a, int b) {
        return a + b;
    }
    public void calcularMarkup(Mercadoria mercadoria) {
        float markup = mercadoria.getMarkup();
        System.out.println("O markup da mercadoria é: " + markup);
    }
    public static void main(String[] args) {
        Mercadoria produto = new Mercadoria();
        produto.setCompra(50);
        produto.setVenda(100);
      
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(10, 20);
        System.out.println("Resultado da soma: " + resultado);
      
        calculadora.calcularMarkup(produto);
    }
}

