package heranca;

import java.math.BigDecimal;

public class Gerente extends Funcionario{

    private Integer senha;

    public boolean autentication(Integer senha){
        return senha.equals(senha);
    }

    public BigDecimal getBonificacao(){
        return super.bonificacao().add(super.getSalario());
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
