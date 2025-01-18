package colorChooser;

import java.awt.Color;
import javax.swing.JLabel;

public class ColorLabel extends JLabel implements ColorListener{

    @Override
    public void changeColor(ColorEvent ce) {
        //setText("R: " + ce.getColor().getRed() + " G: " + ce.getColor().getGreen() + " B: " + ce.getColor().getBlue());
       setText("Hex: #" + Integer.toHexString(ce.getColor().getRed()) + Integer.toHexString(ce.getColor().getGreen()) + Integer.toHexString(ce.getColor().getBlue()));      
       setForeground(ce.getColor());
    }
    
    public ColorLabel() {
        super();
        //setText("R: 0 G: 0 B: 0");
        setText("Hex: #000000");
        setForeground(Color.BLACK);
    }
}
