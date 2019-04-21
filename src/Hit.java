public class Hit {
    //Normal vector
    public Vector n;

    //Hit time
    public float t;

    //Hit point
    public Vector p;

    public Hit() {
        this.t = Float.MAX_VALUE;
    }
}
