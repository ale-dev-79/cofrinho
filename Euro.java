package cofre;

public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro: €" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.7;
    }
}