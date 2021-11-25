package heranca;

public class AutenticacaoUtil {
    private Integer senha;

    public boolean autentication(Integer senha) {
        return this.senha.equals(senha);
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
