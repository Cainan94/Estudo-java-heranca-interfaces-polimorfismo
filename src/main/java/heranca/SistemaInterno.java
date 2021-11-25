package heranca;

public class SistemaInterno {
    private int senha = 222;

    public void autentica(Autenticavel af){
        boolean autenticou = af.autentication(this.senha);
        if(autenticou){
            System.out.println("Acesso liberado");
        } else{
            System.out.println("Acesso negado");
        }
    }
}
