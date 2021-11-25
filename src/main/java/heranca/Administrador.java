package heranca;

import java.math.BigDecimal;

public class Administrador extends Funcionario implements Autenticavel{

    AutenticacaoUtil au;

    public Administrador(){
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

    @Override
    public BigDecimal getBonificacao() {
        return new BigDecimal(50);
    }
}
