package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog {
    private double alfa;
    private double b;


    public Paralelogramma() {
        super(Math.random() * 10 + 5);
        this.b = Math.random() * 10 + 5;
        this.alfa = Math.random() * 178 + 1;
    }

    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.b = b;
        this.alfa = alfa;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    public double getKerulet() {
        return 2 * (getA() + this.b);
    }
    @Override
    public double getTerulet() {
        return getA() * this.b * Math.sin(this.alfa);
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a=%-10.3f b=%-10.3f %s", getA(), this.b, super.toString());
    }
}
