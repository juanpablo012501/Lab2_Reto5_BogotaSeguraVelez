package DOSW.com;

public class Menta extends ToppingDecorator{
    public Menta(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "+ Menta";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 1300;
    }
}
