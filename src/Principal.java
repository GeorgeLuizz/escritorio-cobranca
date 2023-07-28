public class Principal {
    public static void main(String[] args) {
        
        PessoaJuridica loja = new PessoaJuridica();
        loja.setNome("Loja Dois Irmãos");
        loja.setCnpj("53.158.777/0001-45");
        
        PessoaFisica individuo = new PessoaFisica();
        individuo.setNome("João");
        individuo.setCpf("483.588.410-86");
        individuo.setDataNascimento("15/11/1998");
        
        
        Divida divida = new Divida(individuo, loja, 1000.00);
        // Exibindo informações da dívida...
        System.out.println("\nInformações sobre a dívida:");
        System.out.println("Devedor: " + individuo.getNome());
        System.out.println("Cobrador: " + loja.getNome());
        System.out.printf("Dívida de R$" + divida.getValorDivida());
    }
}

