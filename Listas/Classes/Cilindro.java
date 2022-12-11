package Classes;

public class Cilindro extends SolidoRedondo {
    private float h;
    private float volume;
    private float base;

    public Cilindro(float r, float h) {
        super(r);
        this.h = h;
        this.volume = calculaVolume();
        this.base = calculaBase();
    }

    public float calculaVolume() {
        return pi * super.getRaio() * super.getRaio() * this.h;
    }

    public float calculaBase() {
        return pi * super.getRaio() * super.getRaio();
    }

    @Override
    public String toString() {
        return "Raio: " + super.getRaio() + "\nCircunferência: " + super.getCircun() + "\nBase: " + base + "\nVolume: "
                + volume;
    }
}
