public class Vector {
    public float x;
    public float y;
    public float z;

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector sub(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    public Vector mul(float c) {
        return new Vector(this.x * c, this.y * c, this.z * c);
    }

    public Vector div(float c) {
        return new Vector(this.x / c, this.y / c, this.z / c);
    }

    public float dot(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public float lenSq()
    {
        return this.dot(this);
    }

    public float len() {
        return (float) Math.sqrt(this.lenSq());
    }

    public Vector normalize() {
        return this.div(this.len());
    }
}
