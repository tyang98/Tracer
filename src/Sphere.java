public class Sphere {

    public Vector center;
    public float radius;

    public Sphere(Vector center, float radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public boolean intersect(Ray ray, Hit hit) {
        Vector o = ray.o.sub(this.center);
        float a = ray.d.lenSq();
        float b = o.dot(ray.d);
        float c = o.lenSq() - (this.radius * this.radius);

        float d = b * b - a * c;

        if (d < 0.0) return false;

        float t0 = (-b - (float) Math.sqrt(d)) / a;
        float t1 = (-b + (float) Math.sqrt(d)) / a;
        float t;

        if (t0 > ray.min && t0 < ray.max) {
            t = t0;
        } else if (t1 > ray.min && t1 < ray.max) {
            t = t1;
        } else {
            return false;
        }

        ray.max = t;
        hit.t = t;
        hit.p = ray.at(t);
        hit.n = hit.p.sub(this.center).normalize();
        return true;
    }

}
