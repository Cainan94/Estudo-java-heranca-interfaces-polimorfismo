package heranca;

import java.math.BigDecimal;

public class Programador extends Funcionario{

    @Override
    public BigDecimal getBonificacao(){
        return new BigDecimal(500);
    }

}
