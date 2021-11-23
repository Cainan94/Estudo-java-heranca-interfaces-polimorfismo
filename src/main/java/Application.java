import heranca.Funcionario;
import heranca.Gerente;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setCpf("999.999.999-99");
        f.setNome("Fernando");
        f.setSalario(new BigDecimal(3800));

        System.out.println("funcionario: "+f.getNome());
        System.out.println(f.bonificacao());

        Gerente g = new Gerente();
        g.setCpf("888.888.888-98");
        g.setNome("Gabriel");
        g.setSalario(new BigDecimal(5000));
        g.setSenha(123);

        System.out.println("Gerente: "+g.getNome());
        System.out.println(g.autentication(123));
        System.out.println(g.getBonificacao());
    }
}
