public class Sphere {

    public Vector center;
    public float radius;

    public Sphere(Vector center, float radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public boolean intersect(Ray ray)
    {
        Vector o = ray.o.sub(this.center);
        float a = ray.d.lenSq();
        float b = o.dot(ray.d);
        float c = o.lenSq() - (this.radius * this.radius);

        float d = b * b - a * c;

        return (d >= 0.0);
    }

}
