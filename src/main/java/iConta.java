public interface iConta {

    void saque(double valor);

    void deposito(double valor);

    void pix(double valor, Contas contaDestino);

    void imprimirExtrato();
}
