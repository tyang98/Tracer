public class Main {
    public static void main(String[] args) {
        int width = 200;
        int height = 100;
        PPM image = new PPM(width, height, "test.ppm");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                float r = ((float) i) / height;
                float g = ((float) j) / width;
                Vector color = new Vector(r, g, 0);
                image.write(color);
            }

        }
    }
}
