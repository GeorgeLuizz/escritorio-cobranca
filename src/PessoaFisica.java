import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PessoaFisica extends Pessoa{
    private String cpf;
    private LocalDate dataNascimento;
    
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    
}
