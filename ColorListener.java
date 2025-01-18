package colorChooser;

import java.util.EventListener;

public interface ColorListener extends EventListener{
    public void changeColor(ColorEvent ce);
}
