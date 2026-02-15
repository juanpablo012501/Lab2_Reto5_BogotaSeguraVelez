package DOSW.com;

public class Leche extends ToppingDecorator {
    public Leche(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String getDescripcion() {
        return  cafe.getDescripcion() +  "+ Leche";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 1000;
    }
}
