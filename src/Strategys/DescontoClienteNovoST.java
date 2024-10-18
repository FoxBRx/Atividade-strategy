package Strategys;

public class DescontoClienteNovoST implements DescontosStrategy {
    @Override
    public void calcularDesconto(Double preco) {
        System.out.println("Tipo de cliente: Novo\n" +
                "Desconto aplicado: N/A\n" +
                "Total dos produtos com desconto: R$" + preco);
    }
}
