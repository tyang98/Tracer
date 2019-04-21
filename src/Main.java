public class Main {
    public static void main(String[] args) {
        int width = 200;
        int height = 200;
        float sceneHeight =  2.0f;
        float sceneWidth =  2.0f;

        PPM image = new PPM(width, height, "test.ppm");

        Vector corner= new Vector(-1.0f, -1.0f, -1.0f);
        Vector dir = new Vector(0.0f, 0.0f, 1.0f);

        Sphere sphere  = new Sphere(new Vector(0.0f, 0.0f, 0.0f), 0.5f);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                float dx = (((float) i) / width) * sceneWidth;
                float dy = (((float) j) / height) * sceneHeight;

                Ray eye = new Ray(new Vector(corner.x + dx, corner.y + dy , corner.z), dir);

                if (sphere.intersect(eye)) {
                    image.write(new Vector(1.0f, 0.0f, 0.0f));
                } else {
                    image.write(new Vector(1.0f, 1.0f, 1.0f));
                }
            }

        }
    }
}
