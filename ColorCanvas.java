package colorChooser;

import javax.swing.JPanel;

/**
 *
 * @author Sajal Das
 */
public class ColorCanvas extends JPanel implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
        setBackground(ce.getColor()); 
    }
    
    public ColorCanvas() {
        super();
        setBackground(java.awt.Color.BLACK);
//        setBackground(black);
    }
}
