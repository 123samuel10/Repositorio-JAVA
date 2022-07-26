package EJERCICIO;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTURA UNO ");
        FacturaUno mostrarDatos=new FacturaUno("manzana",2,1000,"pera",2,1000,"banano",2,1000,"piña",2,1000,"platano",2,1000);
        mostrarDatos.mostrarPantalla();
        mostrarDatos.factura();
        System.out.println("-------------------------------------------");

        System.out.println("FACTURA DOS");
        FacturaDos facturaDos=new FacturaDos("gaseosa",2,1000,"agua",1,500,"jugo natural",2,1000,"milo",2,1000,"git",2,1000 );
        facturaDos.mostrarPantalla();
        facturaDos.facturaDos();
        System.out.println("----------------------------------------------");

        System.out.println("FACTURA TRES");
        FacturaTres facturaTres=new FacturaTres("papa de limon",2,1000,"choclitos",3,1000,"avena",2,3000,"yogurt",1,1000,"panela",2,1500);
        facturaTres.mostrarPantalla3();
        facturaTres.totalFacturaTres();
        System.out.println("_------------------------------------------");
        int resul=mostrarDatos.factura();
        int resul2=facturaDos.facturaDos();
        int resul3=facturaTres.totalFacturaTres();
        int TotalTres=resul+resul2+resul3;
        System.out.println("TOTAL DE LAS TRES FACTURAS ES: " + TotalTres);




    }
}