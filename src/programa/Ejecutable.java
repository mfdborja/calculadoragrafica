package programa;

import javax.swing.UIManager;
import java.awt.*;

public class Ejecutable {

    //Construir la aplicación
    public Ejecutable() {
        VPrincipal frame = new VPrincipal();
        //Validar marcos que tienen tamaños preestablecidos
        //Empaquetar marcos que cuentan con información de tamaño preferente útil. Ej. de su diseño.
        frame.validate();

        //Centrar la ventana
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        frame.setVisible(true);
    }

    //Método Main
    public static void main(String[] args) {
        try {
            //Cambiar el estilo de la ventana
            //UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");

        } catch (Exception e) {
        }

        //Dibujar la ventana
        new Ejecutable();
    }
}
