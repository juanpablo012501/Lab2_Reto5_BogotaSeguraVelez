package DOSW.com;

public class Chocolate extends  ToppingDecorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "+ Chocolate";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 1500;
    }
}
