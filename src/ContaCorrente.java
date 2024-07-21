
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente() {   
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----- Extrato da Conta Corrente -----");
        super.imprimirInformacoes();  
    }

}