package DOSW.com;

public class ToppingPersonalizado extends ToppingDecorator {
    public ToppingPersonalizado(Cafe topping) {
        super(topping);
    }


    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "+ Topping personalizado";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 2000;
    }
}
