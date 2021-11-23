package heranca;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {

    private String nome;
    private String cpf;
    private BigDecimal salario;

    public BigDecimal bonificacao(){
        return salario.multiply(new BigDecimal(0.05)).setScale(2,RoundingMode.HALF_UP);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
