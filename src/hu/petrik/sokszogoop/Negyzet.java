package hu.petrik.sokszogoop;

public class Negyzet extends Sokszog {
    private double atlo;

    public Negyzet(double a, double atlo) {
        super(a);
        this.atlo = atlo;
    }

    public Negyzet() {
        super(Math.random() * 10 + 5);
        this.atlo = Math.random() * 10 + 5;
    }

    public double getAtlo() {
        return atlo;
    }

    public void setAtlo(double atlo) {
        this.atlo = atlo;
    }

    @Override
    public double getKerulet() {
        return 4 * getA();
    }

    @Override
    public double getTerulet() {
        return Math.pow(getA() * Math.sqrt(2), 2) / 2;
    }

    @Override
    public String toString() {
        return String.format("Négyzet: a=%-10.3f %s", getA(), super.toString());
    }
}
