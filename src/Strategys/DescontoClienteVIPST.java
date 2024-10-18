package Strategys;

public class DescontoClienteVIPST implements DescontosStrategy {
    @Override
    public void calcularDesconto(Double preco) {
        System.out.println("Tipo de cliente: VIP\n" +
                "Desconto aplicado: 20%\n" +
                "Total dos produtos sem desconto: R$" + preco + "\n" +
                "Total dos produtos com desconto: R$" + (preco - (preco * 0.20)));
    }
}
