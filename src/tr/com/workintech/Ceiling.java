package tr.com.workintech;

import tr.com.workintech.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create() {
        System.out.println("Height: " + height + "\nPaintColor: " + paintedColor);
    }
}
