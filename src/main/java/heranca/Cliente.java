package heranca;

public class Cliente implements Autenticavel{

    AutenticacaoUtil au;

    public Cliente(){
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
