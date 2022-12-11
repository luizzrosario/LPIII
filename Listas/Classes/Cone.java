package Classes;

public class Cone extends SolidoRedondo{
    private float h;
    private float volume;
    private float base;

    public Cone(float r, float h) {
        super(r);
        this.h = h;
        this.volume = calculaVolume();
        this.base = calculaBase();
    }

    public float calculaVolume() {
        return (pi * super.getRaio() * super.getRaio() * this.h)/3;
    }

    public float calculaBase() {
        return pi * super.getRaio() * super.getRaio();
    }
    public String toString() {
        return "Raio: " + super.getRaio() + "\nCircunferência: " + super.getCircun() + "\nBase: " + base + "\nVolume: "
                + volume;
    }
    
}
