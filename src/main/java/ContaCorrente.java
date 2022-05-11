public class ContaCorrente extends Contas{

    public ContaCorrente(Clientes clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("=== Extato Conta Corrente ===");
        super.ImprimirExtrato();
    }
}