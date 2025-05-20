package cofre;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar: US$" + valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.2;
    }
}