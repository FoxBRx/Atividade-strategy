import Strategys.DescontoClienteNovoST;
import Strategys.DescontoClienteRegularST;
import Strategys.DescontoClienteVIPST;

public class Main {
    public static void main(String[] args) {

        LojaOnline produto1 = new LojaOnline("Camiseta", 50.0);
        LojaOnline produto2 = new LojaOnline("Calça", 100.0);
        LojaOnline produto3 = new LojaOnline("Bermuda", 75.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.addProduto(produto1);
        carrinho.addProduto(produto2);
        carrinho.addProduto(produto3);

        carrinho.receber(new DescontoClienteNovoST());

        System.out.println("\n||>                               <||\n");

        carrinho.receber(new DescontoClienteRegularST());

        System.out.println("\n||>                               <||\n");

        carrinho.receber(new DescontoClienteVIPST());

    }
}
