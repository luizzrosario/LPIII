package Classes;

public class Time {
    private int hora;
    private int min;
    private int seg;

    // construtor
    public Time(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    public Time(int h, int m) {
        this(h, m, 0);
    }

    public Time(int h) {
        this(h, 0, 0);
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time(Time tempo) {
        this(tempo.getHora(), tempo.getMin(), tempo.getSeg());
    }

    // getters
    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void imprimirTempo() {
        System.out.println(this.getHora() + ":" + this.getMin() + ":" + this.getSeg());
    }

    public static int timeInInt(Time T) {
        return ((T.getHora() * 3600) + (T.getMin() * 60) + (T.getSeg()));
    }

    public static Time intInTime(int T) {
        int h;
        int m;
        int s;

        h = (T / 3600);
        m = (T % 3600) / 60;
        s = ((T % 3600) % 60);

        Time tempo = new Time(h, m, s);

        return tempo;
    }

    public static Time diffTime(Time T1, Time T2) {
        int diff;
        if (timeInInt(T2) > timeInInt(T1)) {
            diff = timeInInt(T2) - timeInInt(T1);
        } else {
            diff = timeInInt(T1) - timeInInt(T2);
        }

        return intInTime(diff);
    }
}
