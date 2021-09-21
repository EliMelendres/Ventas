package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {

    public static void main(String[] args) {
        Orden miOrden1 = new Orden();
        Producto producto1 = new Producto("Hamburguesa", 200.0);
        Producto producto2 = new Producto("Pizza", 1000.0);
       
        miOrden1.agregarProductos(producto1);
        miOrden1.agregarProductos(producto2);
        miOrden1.mostrarOrden();
        
        Orden miOrden2 = new Orden();
        Producto producto3 = new Producto("Helado",70.50);
        miOrden2.agregarProductos(producto3);
        miOrden2.agregarProductos(producto1);
        miOrden2.mostrarOrden();
    }
}
