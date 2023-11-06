package TrabalhoADS;

import javax.swing.*;

public class Controle extends Mercadoria {

    public Controle(){
        formula(dados());
    }
    public Mercadoria dados(){
        Mercadoria produto = new Mercadoria();
        produto.setCompra(Integer.parseInt(JOptionPane.showInputDialog("Informar o valor da compra: " )));
        produto.setVenda(Integer.parseInt(JOptionPane.showInputDialog("Informar o valor da venda: " )));
        return produto;
    }

    public final void formula(Mercadoria produtos) {
        Float resultado = produtos.getMarkup() * produtos.getVenda() * produtos.getCompra();
        JOptionPane.showMessageDialog(null, resultado);
        System.out.println(resultado);
    }
}