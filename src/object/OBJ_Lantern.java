package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Lantern extends  SuperObject{

    GamePanel gp;

    public OBJ_Lantern(GamePanel gp) {
        name = "Lantern";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/pine_cone_lantern.png"));
            utilityTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
