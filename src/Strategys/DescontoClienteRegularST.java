package Strategys;

public class DescontoClienteRegularST implements DescontosStrategy {


    @Override
    public void calcularDesconto(Double preco) {
        System.out.println("Tipo de cliente: Novo\n" +
                "Desconto aplicado: 10%\n" +
                "Total dos produtos sem desconto: R$" + preco + "\n" +
                "Total dos produtos com desconto: R$" + (preco - (preco * 0.10)));
    }
}
