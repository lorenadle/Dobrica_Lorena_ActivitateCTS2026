package program;

import clase.Factura;
import decorator.Decorator;
import decorator.FacturaDecorata;

public class Program {
    public static void main(String[] args) {
        Factura factura=new Factura(134,1000);
        factura.printeazafactura();

        Decorator facturaDecorata=new FacturaDecorata(factura);
        facturaDecorata.aplicaDiscount(10);
        facturaDecorata.printeazafactura();
    }
}
