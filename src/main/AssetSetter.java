package main;

import object.OBJ_Boots;
import object.OBJ_Lantern;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Lantern();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Boots();
        gp.obj[1].worldX = 21 * gp.tileSize;
        gp.obj[1].worldY = 5 * gp.tileSize;
    }
}
