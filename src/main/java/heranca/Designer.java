package heranca;

import java.math.BigDecimal;

public class Designer extends Funcionario {

    @Override
    public BigDecimal getBonificacao() {
        return new BigDecimal(200);
    }
}
