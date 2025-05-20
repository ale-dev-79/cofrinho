package cofre;

public class Iene extends Moeda {

    public Iene(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Iene: ¥" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 0.035;
    }
}