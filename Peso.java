package TrabalhoADS;

public class Peso {

    private float peso;
    private float tamanho;
    public float  calcularValor() {
        float valor = peso / (tamanho * tamanho); //um calculo para o valor do produto baseado no peso e tamanho
        return valor;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public float getTamanho(){
        return tamanho;
    }
}
