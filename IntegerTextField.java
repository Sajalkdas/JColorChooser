package colorChooser;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class IntegerTextField extends JTextField {

    private static class IntegerDocument extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            String currText = getText(0, getLength());
            StringBuilder b = new StringBuilder(currText);
            b.insert(offs, str);
            currText = b.toString();
            boolean proceed = true;
            try {
                if (!currText.isEmpty()) {
                    int val = Integer.valueOf(currText);
                    proceed = val >= 0 && val <= 255;
                }
            } catch (NumberFormatException e) {
                proceed = false;
            }
            if (proceed) {
                super.insertString(offs, str, a);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
              new ColorChooser().setVisible(true);
            }
        });
    }
}
