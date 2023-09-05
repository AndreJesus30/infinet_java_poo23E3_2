import com.oop.gestaovendas.entities.enums.AdicionaisComida;
import com.oop.gestaovendas.entities.enums.TipoBebida;
import com.oop.gestaovendas.entities.pedido.Pedido;
import com.oop.gestaovendas.entities.pedido.Solicitante;
import com.oop.gestaovendas.entities.produto.BebidaImpl;
import com.oop.gestaovendas.entities.produto.ComidaImpl;
import com.oop.gestaovendas.entities.produto.Produto;
import com.oop.gestaovendas.services.FormatadorDeListaProduto;
import com.oop.gestaovendas.services.SolicitadorDeNovoPedidoServico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

        SolicitadorDeNovoPedidoServico pedido = new SolicitadorDeNovoPedidoServico();

        Solicitante solicitante = new Solicitante("João", "De Morais", "Rua 78, QD 6, Lt 3, Setor Aruana");

        Produto produto1 = new ComidaImpl(550, false, new ArrayList<AdicionaisComida>(), "Sanduiche", 26.00, 4564897);
        produto1.valorComDescontoPromocional(0.05);

        Produto produto2 = new BebidaImpl(true, 500, TipoBebida.CocaCola, "Refrigerante", 10.00, 5467254);
        produto2.valorComDescontoPromocional(0.10);

        List<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        pedido.setNovoPedido(solicitante, listaProdutos,"Deixar na portaria do prédio", LocalDateTime.now());

        Set<Pedido> pedidos = pedido.getConjuntoDePedidos();
        System.out.println("");
        System.out.println(pedidos.toString());


        System.out.println("");
        System.out.println("---------//----------//----------//----------//---------//----------//----------//----------");
        System.out.println("");


        //input e output exemplo
        FormatadorDeListaProduto.formatadorDelistaProdutos(
                "src/main/java/com/oop/gestaovendas/files/produtos_lista.txt",
                "src/main/java/com/oop/gestaovendas/files/produtos_lista_Formatado.txt"
        );
    }
}
