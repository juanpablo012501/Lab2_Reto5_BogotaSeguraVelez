package DOSW.com;

public class CafeBase implements Cafe {

    @Override
    public String getDescripcion() {
        return "Cafe base";
    }

    @Override
    public double getPrecio() {
        return 2000;
    }
}
