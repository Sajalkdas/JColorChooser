package colorChooser;

import java.awt.Color;
import java.util.EventObject;

/*
 * @author Sajal Das
 */
public class ColorEvent extends EventObject {
    private Color color;

    public ColorEvent(Object source, Color color) {
        super(source);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
