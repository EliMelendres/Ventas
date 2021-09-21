package mx.com.gm.ventas;

//CLASE ORDEN
public class Orden {

    private int idOrden; //id 
    private Producto productos[]; //array de productos
    private static int contadorOrdenes; //contador
    private int contadorProductos; //contador de productos
    public static final int MAX_PRODUCTOS = 10; //constante maximo de productos

    public Orden() { //Constructor vacio 
        this.idOrden = ++Orden.contadorOrdenes; //Inicializa el valor del id orden
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; //Inicializa el valor de array de productos
    }

    public void agregarProductos(Producto producto) { //Metodo que recibe productos
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto; //Agrego el producto al array
        } else {
            System.out.println("Se ha superado la cantidad maxima de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() { //Metodo que calcula el total
        double total = 0.0; //Variable que va acumular el total
        
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio(); //Acumulamos el precio de los productos
        }
        return total;
    }

    public void mostrarOrden() { //Metodo que muestra la orden
        double totalOrden= this.calcularTotal();
        
        System.out.println("\n Id orden: "+ this.idOrden);
        System.out.println("Productos de la orden: ");
        
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("producto: "+ productos[i]);
        }
        System.out.println("Total de la orden: $"+ totalOrden);
    }

}
