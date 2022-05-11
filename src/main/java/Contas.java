public abstract class Contas implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int Agencia;
    protected int Conta;
    protected double saldo;
    private Clientes clientes;


    public Contas(Clientes clientes) {
        this.Agencia = Contas.AGENCIA_PADRAO;
        this.Conta = SEQUENCIAL++;
        this.clientes = clientes;
    }


    @Override
    public void saque(double valor) {
        saldo -= valor;

    }

    @Override
    public void deposito(double valor) {
        saldo =+ valor;

    }

    @Override
    public void pix(double valor, Contas contaDestino) {
        this.saque(valor);
        contaDestino.deposito(valor);
    }


    public int getAgencia() {
        return Agencia;
    }

    public int getConta() {
        return Conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void ImprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.clientes.getNome()));
        System.out.println(String.format("Agencia: %d", this.Agencia));
        System.out.println(String.format("Conta: %d", this.Conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
