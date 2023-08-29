package main;

import entity.NPC_SnowMan;
import object.OBJ_Boots;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Lantern;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
//        gp.obj[0] = new OBJ_Lantern(gp);
//        gp.obj[0].worldX = 23 * gp.tileSize;
//        gp.obj[0].worldY = 7 * gp.tileSize;
//
//        gp.obj[1] = new OBJ_Boots(gp);
//        gp.obj[1].worldX = 21 * gp.tileSize;
//        gp.obj[1].worldY = 5 * gp.tileSize;
//
//        gp.obj[2] = new OBJ_Key(gp);
//        gp.obj[2].worldX = 26 * gp.tileSize;
//        gp.obj[2].worldY = 5 * gp.tileSize;
//
//        gp.obj[3] = new OBJ_Door(gp);
//        gp.obj[3].worldX = 28 * gp.tileSize;
//        gp.obj[3].worldY = 4 * gp.tileSize;
    }

    public void setNPC() {
        gp.npc[0] = new NPC_SnowMan(gp);
        gp.npc[0].worldX = gp.tileSize * 21;
        gp.npc[0].worldY = gp.tileSize * 21;
    }
}
