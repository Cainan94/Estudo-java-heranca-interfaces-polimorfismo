package heranca_e_construtores;

import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.20);
    }

    @Override
    public BigDecimal getValorImposto() {
        return new BigDecimal(super.saldo).multiply(new BigDecimal(0.01));
    }
}
