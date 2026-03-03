import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carta {
    private int indice;

    public Carta(Random r) {
        indice = r.nextInt(52) + 1;
    }

    public void mostrar(JPanel pnl, int x, int y) {
        String nombreImagen = "imagenes/Carta" + indice + ".jpg";
        ImageIcon imgCarta = new ImageIcon(getClass().getResource(nombreImagen));

        JLabel lblCarta = new JLabel(imgCarta);
        lblCarta.setBounds(x, y, imgCarta.getIconWidth(), imgCarta.getIconHeight());

        pnl.add(lblCarta);

    }
}
