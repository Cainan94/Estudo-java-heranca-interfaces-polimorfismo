package heranca;

import java.math.BigDecimal;

public class Gerente extends Funcionario implements Autenticavel {


    @Override
    public BigDecimal getBonificacao(){
        return super.getSalario();
    }

    AutenticacaoUtil au;

    public Gerente(){
        this.au = new AutenticacaoUtil();
    }

    @Override
    public boolean autentication(Integer senha) {
        return this.au.autentication(senha);
    }

    @Override
    public void setSenha(Integer senha) {
        this.au.setSenha(senha);
    }
}
