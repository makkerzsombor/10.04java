package hu.petrik.sokszogoop;

public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public Teglalap(){
        super(Math.random() * 10 + 5);
        this.b = Math.random() * 10 + 5;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return 2 * (this.getA() + this.b);
    }
    @Override
    public double getTerulet() {
        return this.getA() * this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a=%-10.3f b=%-10.3f %s", this.getA(), this.b, super.toString());
    }
}
