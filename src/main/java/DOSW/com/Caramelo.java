package DOSW.com;

public class Caramelo extends ToppingDecorator {
    public Caramelo(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "+ Caramelo";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 1200;
    }
}
