package Classes;

public class Ponto {
    private float x, y;

    public Ponto(float px, float py) {
        this.x = px;
        this.y = py;
    }

    public Ponto() {
        this(0, 0);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public static double distance(Ponto p1, Ponto p2) {
        return (Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) +
                (p2.getY() - p1.getY()) * (p2.getY() - p1.getY())));
    }

    public double distanceFrom(Ponto p1) {
        return (Math.sqrt((this.x - p1.getX()) * (this.x - p1.getX()) +
                (this.y - p1.getY()) * (this.y - p1.getY())));
    }

    public static double distance(Ponto p1) {
        return (Math.sqrt((p1.getX()) * (p1.getX()) +
                (p1.getY()) * (p1.getY())));
    }

    public static int quadrante(Ponto p) {
        float x = p.getX();
        float y = p.getY();

        if (x == 0 || y == 0) {
            return 0;
        }
        if (x > 0) {
            if (y > 0) {
                return 1;
            }
            return 4;
        } else {
            if (y > 0) {
                return 2;
            }
            return 3;
        }
    }

    public String toString(){
        return "("+ x + ", " + y + ")";
    }

    public boolean isAxisX(){
        if(x == 0){
            return true;
        }
        return false;
    }

    public boolean isAxisY(){
        if(y == 0){
            return true;
        }
        return false;
    }
    
    public boolean isAxis(){
        if(x == 0 || y==0){
            return true;
        }
        return false;
    }

    public boolean isOrigin(){
        if(x == 0 && y==0){
            return true;
        }
        return false;
    }
}
