public class ContaPoupanca extends Contas {

    public ContaPoupanca(Clientes clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-----------------------------");
        System.out.println("=== Extato Conta Poupança ===");
        super.ImprimirExtrato();
    }


}
