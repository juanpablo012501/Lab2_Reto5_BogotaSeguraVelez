package DOSW.com;

public class CremaBatida extends ToppingDecorator{
    public CremaBatida(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "+ Crema batida";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 2000;
    }
}
