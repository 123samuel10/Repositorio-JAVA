package EJERCICIO;

public class FacturaTres {


    private String productoUno;
    int cantidadUno;
    int precioUno;

    private String productoDos;
    int cantidadDos;
    int precioDos;

    private String productoTres;
    int cantidadTres;
    int precioTres;

    private String productoCuatro;
    int cantidadCuatro;
    int precioCuatro;

    private  String productoCinco;
    int cantidadCinco;
    int precioCinco;

    public  FacturaTres(String productoUno, int cantidadUno, int precioUno, String productoDos, int cantidadDos, int precioDos, String  productoTres, int cantidadTres, int precioTres, String productoCuatro, int cantidadCuatro, int precioCuatro, String productoCinco, int cantidadCinco, int precioCinco){
        this.productoUno=productoUno;
        this.cantidadUno=cantidadUno;
        this.precioUno=precioUno;

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
    public void mostrarPantalla3(){
        System.out.println("el producto es: " + productoUno + "cantidad: " + cantidadUno + "precio: " + precioUno);
        System.out.println("el producto es: " + productoDos + "cantidad: " + cantidadDos + "precio: " + precioDos);
        System.out.println("el producto es: " + productoTres + "cantidad: " + cantidadTres + "precio: " + precioTres);
        System.out.println("el producto es: " + productoCuatro + "cantidad: " + cantidadCuatro + "precio: " + precioCuatro);
        System.out.println("el producto es: " + productoCinco + "cantidad: " + cantidadCinco + "precio: " + precioCinco);
    }

    public int totalFacturaTres(){
        int resultadoUno=cantidadUno*precioUno;
        int resultadoDos=cantidadDos*precioDos;
        int resultadoTres=cantidadTres*precioTres;
        int resultadoCuatro=cantidadCuatro*precioCuatro;
        int resultadoCinco=cantidadCinco*precioCinco;
        int TotalFactura=resultadoUno+resultadoDos+resultadoTres+resultadoCuatro+resultadoCinco;
        System.out.println("el total de la factura 3 es "+TotalFactura);
        return TotalFactura;
    }


}
