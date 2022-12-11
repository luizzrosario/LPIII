package Classes;

public class SolidoRedondo {
    private float raio;
    private float volume;
    private float circun;
    static final float pi = 3.14f;

    public SolidoRedondo(float r) {
        this.raio = r;
        this.circun = calcutaCircun();
        this.volume = calculaVolume();
    }

    public float getRaio() {
        return raio;
    }

    public float getCircun() {
        return circun;
    }

    public float getVolume() {
        return volume;
    }

    private float calcutaCircun() {
        return pi * this.raio;
    }

    private float calculaVolume() {
        return (4 * pi * this.raio * this.raio * this.raio) / 3;
    }

    public String toString() {
        return "O sólido tem raio: " + this.raio + "\nVolume: " + volume + "\nCircunferência: " + circun;
    }

}
