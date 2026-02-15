package DOSW.com;

public abstract class ToppingDecorator implements Cafe{
    protected Cafe cafe;

    public ToppingDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
}
