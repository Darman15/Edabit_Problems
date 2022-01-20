public class RgbColor {



    public static int[] invertColor(int[] rgb) {

        for (int i = 0; i < rgb.length; i++) {
            rgb[i] = rgb[i] - 255;
            if (rgb[i] <= 0) {
                rgb[i] = Math.abs(rgb[i]);
            }

        }
        return rgb;

    }
}
