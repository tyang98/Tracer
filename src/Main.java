public class Main {
    public static void main(String[] args) {
        int width = 200;
        int height = 200;
        float sceneHeight =  2.0f;
        float sceneWidth =  2.0f;

        PPM image = new PPM(width, height, "test.ppm");

        Vector corner= new Vector(-2.0f, -1.0f, -1.0f);
        Vector horizontal = new Vector(4.0f, 0.0f, 0.0f);
        Vector vertical = new Vector(0.0f, 2.0f, 0.0f);
        Vector origin = new Vector(0.0f, 0.0f, 2.0f);

        Sphere sphere  = new Sphere(new Vector(0.0f, 0.0f, 0.0f), 0.5f);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                float v = (((float) i) / height);
                float u = (((float) j) / width);

                Ray eye = new Ray(origin, corner.add(horizontal.mul(u).add(vertical.mul(v))));
                Hit hit = new Hit();

                if (sphere.intersect(eye, hit)) {
                    image.write(hit.n);
                } else {
                    image.write(new Vector(1.0f, 1.0f, 1.0f));
                }
            }

        }
    }
}
