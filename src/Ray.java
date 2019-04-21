public class Ray {

    //Origin
    public Vector o;
    //Direction
    public Vector d;

    public float min;

    public float max;

    public Ray(Vector o, Vector d) {
        this.o = o;
        this.d = d;
        this.min = 0.0f;
        this.max = Float.MAX_VALUE;
    }

    public Vector at(float t) {
        return this.o.add(d.mul(t));
    }
}
