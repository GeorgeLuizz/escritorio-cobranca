public class PessoaJuridica extends Pessoa {
    
    /*
    atriutos
    */
    private String cnpj;
    
    /*
    metodos
    */
    
    
        /*  metodo que permite alterar o valor do atributo  */
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
        /*  metodo que permite acessar o valor do atributo  */
    public String getCnpj(){
        return cnpj;
    }
}
