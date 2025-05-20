package cofre;

public class Libra extends Moeda {

    public Libra(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Libra: £" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 6.2;
    }
}