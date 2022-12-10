package Classes;

public class Ponto3D extends Ponto{
    private float z;

    public Ponto3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Ponto3D(Ponto3D p3D){
        super(p3D.getX(), p3D.getY());
        this.z = p3D.getZ();
    }

    public float getZ() {
        return z;
    }

    @Override
    public String toString(){
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }


}
