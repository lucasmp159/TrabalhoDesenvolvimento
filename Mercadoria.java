package TrabalhoADS;

public class Mercadoria {
    private Integer compra;
    private Integer venda;


    public Integer getCompra() {
        return compra;
    }

    public void setCompra(Integer compra) {
        this.compra = compra;
    }

    public Integer getVenda() {
        return venda;
    }

    public void setVenda(Integer venda) {
        this.venda = venda;
    }

    public final Float getMarkup() {
        return 1.54f;
    }
}