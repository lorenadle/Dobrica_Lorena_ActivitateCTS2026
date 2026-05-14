package decorator;

import clase.Factura;
import clase.IFactura;

public abstract class Decorator  implements IFactura {
    protected Factura factura;

    public Decorator(Factura factura) {
        this.factura = factura;
    }


@Override
    public void printeazafactura(){
        factura.printeazafactura();;
    System.out.println("la multi ani!");
}

public abstract void aplicaDiscount(int procent);
}

