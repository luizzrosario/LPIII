import Classes.Time;

public class Q2 {
    public static void main(String[] args) {
        Time tempo1 = new Time(16, 23, 40);
        Time tempo2 = new Time(15);
        Time tempo3 = new Time(Time.diffTime(tempo1, tempo2));

        tempo3.imprimirTempo();
        
    }
}
