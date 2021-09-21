package mx.com.gm.ventas;

//CLASE PRODUCTO 
public class Producto {

    private final int idProducto; //id 
    private String nombre; //nombre
    private double precio; //precio
    private static int contadorProductos; //contador

    private Producto() { //Constructor vacio private que inicializa el contador
        this.idProducto = ++Producto.contadorProductos;;
    }

    public Producto(String nombre, double precio) { //Constructor con 2 argumentos
        this(); //Llamamos al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto(){
        return this.idProducto;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
