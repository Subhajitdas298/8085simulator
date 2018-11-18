

import java.awt.Window;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * @author subha
 */
public class Util {
    public static String capitalizeFirstLetter(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }

    public static void customizeFrame(Window frame) {
        Image icon = Toolkit.getDefaultToolkit().getImage(frame.getClass().getResource("/resources/chip.png"));
        //ImageIcon icon = new ImageIcon("./icons/256x256.png");
        frame.setIconImage(icon);
        frame.setLocationRelativeTo(null);
    }
}
