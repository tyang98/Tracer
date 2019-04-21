import java.io.FileWriter;
import java.io.IOException;

public class PPM {

    FileWriter out;

    public PPM(int width, int height, String file)
    {
        try {
            this.out = new FileWriter(file);
            this.out.write("P3\n");
            this.out.write(width + " " + height + "\n");
            this.out.write(255 + "\n");

        } catch (IOException io) {
            System.out.println("Could not open file");
            System.exit(1);
        }
    }

    public void write(Vector color)
    {
        try {
            int r = (int) (color.x * 255.0);
            int g = (int) (color.y * 255.0);
            int b = (int) (color.z * 255.0);
            this.out.write(r + " " + g + " " + b + " ");
        } catch (IOException io) {
            System.out.println("Could not write to file");
            System.exit(1);
        }

    }
}
