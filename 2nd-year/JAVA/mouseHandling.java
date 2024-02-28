import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

class mouseHandling extends JFrame implements MouseListener {
    Label l;

    mouseHandling() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 600, 20);
        add(l);

        setSize(600, 700);
        setLayout(null);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {

        l.setText("mouse Released");

    }

    public void mouseEntered(MouseEvent e) {
        l.setText("mouse entered");
    }

    public void mouseExited(MouseEvent e) {

        l.setText("mouse exited");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("mouse clicked at " + e.getX() + " , " + e.getY());
    }

    public static void main(String[] args) {
        new mouseHandling();
    }

}