package EJERCICIO;

public class FacturaUno {
    private  String productoUno;
    int cantidadaUno;
    int precio;
    private String productoDos;
    int cantidadDos;
    int precioDos;
    private String productoTres;
    int cantidadTres;
    int precioTres;
    private  String productoCuatro;
    int cantidadCuatro;
    int precioCuatro;
    private String productoCinco;
    int cantidadCinco;
    int precioCinco;

    public FacturaUno(String productoUno, int cantidadaUno, int precio,String productoDos, int cantidadDos, int precioDos,String productoTres,int cantidadTres, int precioTres,String productoCuatro, int cantidadCuatro, int precioCuatro,String productoCinco,int cantidadCinco,int precioCinco){
        this.productoUno=productoUno;
        this.cantidadaUno=cantidadaUno;
        this.precio=precio;

        this.productoDos=productoDos;
        this.cantidadDos=cantidadDos;
        this.precioDos=precioDos;

        this.productoTres=productoTres;
        this.cantidadTres=cantidadTres;
        this.precioTres=precioTres;

        this.productoCuatro=productoCuatro;
        this.cantidadCuatro=cantidadCuatro;
        this.precioCuatro=precioCuatro;

        this.productoCinco=productoCinco;
        this.cantidadCinco=cantidadCinco;
        this.precioCinco=precioCinco;
    }

    public void mostrarPantalla(){
        System.out.println("el producto uno es "+ productoUno + "cantidad: "+ cantidadaUno +" Precio:"+ precio);
        System.out.println("el producto dos es " + productoDos +"cantidad: "+ cantidadDos + " Precio: "+precioDos);
        System.out.println("el producto tres es " + productoTres +"cantidad: "+ cantidadTres + " Precio: "+precioTres);
        System.out.println("el producto Cuatro es " + productoCuatro +"cantidad: "+ cantidadCuatro + " Precio: "+precioCuatro);
        System.out.println("el producto Cuatro es " +productoCinco +"cantidad: "+ cantidadCinco + " Precio: "+precioCinco);
    }

    public int factura(){
        int resultado=cantidadaUno*precio;
        int resultadoD=cantidadDos*precioDos;
        int resultadoat=cantidadTres*precioTres;
        int resultadoC=cantidadCuatro*precioCuatro;
        int resultadoCin=cantidadCinco*precioCinco;
        int total=resultado+resultadoD+resultadoat+resultadoC+resultadoCin;
        System.out.println("el total de la factura uno es: "+ total);
        return total;
    }
}
