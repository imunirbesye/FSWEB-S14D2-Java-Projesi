import tr.com.workintech.*;
import tr.com.workintech.enums.LampType;
import tr.com.workintech.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("left");
        Wall wall2 = new Wall("front");
        Wall wall3 = new Wall("right");
        Wall wall4 = new Wall("back");

        Ceiling ceiling = new Ceiling(2, PaintColor.RED);
        Bed bed = new Bed("Double", 3, 1, 2, 1);
        Lamp lamp = new Lamp(LampType.LED, false, 7);
        Wardrobe wardrobe = new Wardrobe(2, 2, 25.0);
        Carpet carpet = new Carpet(3, 4, PaintColor.WHITE);

        Bedroom bedroom = new Bedroom("Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getBed().make();
        bedroom.getWall1().create(); 
    }
}