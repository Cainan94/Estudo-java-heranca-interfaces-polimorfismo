package heranca_e_construtores;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    private BigDecimal totalImposto = BigDecimal.ZERO;
    public void registra(Tributavel t){
        BigDecimal valor = t.getValorImposto();
        this.totalImposto = totalImposto.add(valor);
    }

    public BigDecimal getTotalImposto(){
        return this.totalImposto;
    }
}
