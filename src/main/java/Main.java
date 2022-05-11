public class Main {

    public static void main(String[] args){
        Clientes dylan = new Clientes();
        dylan.setNome("Dylan");

        Contas cc = new ContaCorrente(dylan);
        cc.deposito(100);

        Contas cp = new ContaPoupanca(dylan);
        cc.pix(100, cp);

        cc.ImprimirExtrato();
        cp.ImprimirExtrato();

    }
}
