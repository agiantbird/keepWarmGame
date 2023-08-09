package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Lantern extends  SuperObject{
    public OBJ_Lantern() {
        name = "Lantern";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/pine_cone_lantern.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
