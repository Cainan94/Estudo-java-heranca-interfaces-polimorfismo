package polimorfismo;

import heranca.Funcionario;

import java.math.BigDecimal;

public class ControleBonificacao {

    private BigDecimal soma = BigDecimal.ZERO;

    public void registra(Funcionario f){
        BigDecimal bonificacao = f.getBonificacao();
        System.out.println(bonificacao);
        this.soma = this.soma.add(bonificacao);
    }
    public BigDecimal getSoma() {
        return soma;
    }

}
