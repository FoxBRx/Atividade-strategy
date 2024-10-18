import Strategys.DescontosStrategy;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList <LojaOnline> lista = new ArrayList();

    public void addProduto(LojaOnline item) {
        lista.add(item);
    }

    public void removeProduto(LojaOnline item) {
        lista.remove(item);
    }

    public void receber (DescontosStrategy tipoCliente) {
        tipoCliente.calcularDesconto(getTotalProdutos());
    }

    public Double getTotalProdutos() {
        Double totalProd = 0.0;

        for (LojaOnline item : lista) {
            totalProd += item.getPreco();
        }
            return totalProd;
    }



}
