public class Divida {

    private Pessoa devedora;
    private Pessoa cobradora;
    private Double valorDivida;
    
    public Pessoa getDevedora() {
        return devedora;
    }

    public Pessoa getCobradora() {
        return cobradora;
    }

    public Double getValorDivida() {
        return valorDivida;
    }
    
    public Divida(Pessoa devedora, Pessoa cobradora, double valorDivida){
        this.devedora  = devedora;
        this.cobradora = cobradora;
        this.valorDivida  = valorDivida;
    }
    
    
}
