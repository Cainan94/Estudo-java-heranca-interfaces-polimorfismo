import heranca.*;
import heranca_e_construtores.CalculadoraDeImposto;
import heranca_e_construtores.ContaCorrente;
import heranca_e_construtores.ContaPoupanca;
import heranca_e_construtores.SeguroDeVida;
import polimorfismo.ControleBonificacao;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        testesCalculadoraImposto();
    }

    private static void testesHerancaEPolimorfismos(){
        Gerente g = new Gerente();
        g.setSalario(new BigDecimal(5000));

        Programador p = new Programador();
        p.setSalario(new BigDecimal(3800));

        Designer d = new Designer();
        d.setSalario(new BigDecimal(2000));

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(g);
        controleBonificacao.registra(p);
        controleBonificacao.registra(d);

        System.out.println("Soma: "+controleBonificacao.getSoma());
    }

    private static void testesHeranca_e_Construtores(){
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200);

        cc.transfere(10,cp);

        System.out.println("Conta Corrente: "+cc.getSaldo());
        System.out.println("Conta Poupança: "+cp.getSaldo());
    }

    private static void testeInterface(){

        Gerente g2 = new Gerente();


        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(333);

        Cliente c = new Cliente();
        c.setSenha(222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(c);
    }

    private static void testesCalculadoraImposto(){
        ContaCorrente cc = new ContaCorrente(222,222);
        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadoraDeImposto cdi = new CalculadoraDeImposto();
        cdi.registra(cc);
        cdi.registra(sv);

        System.out.println(cdi.getTotalImposto());
    }

}
