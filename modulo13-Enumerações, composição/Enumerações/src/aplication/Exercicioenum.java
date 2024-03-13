package aplication;

import entidade.Pedidos;
import entidade_enum.StatusPedido;
import java.util.Date;

public class Exercicioenum {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n\n");

        Pedidos pedido = new Pedidos(100, new Date(), StatusPedido.PEDIDO_ENVIADO );

        System.out.println("\n\n");

        System.out.println(pedido);

        System.out.println("\n\n");

        StatusPedido p1 = StatusPedido.PEDIDO_ENVIADO;

        System.out.println(p1);

        System.out.println("\n\n");

        StatusPedido p2 = StatusPedido.valueOf("PEDIDO_ENVIADO");

        System.out.println(p2);

        System.out.println("\n\n");
    }
}
