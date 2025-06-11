package tarea;

import java.awt.Color;
import javax.swing.JLabel;

public aspect AspectoContador {
	
	// Contador de cambios
    private int colorChangeCount = 0;

    // Referencia  al JLabel 
    public static JLabel counterLabel;

    after(Color color): call(void java.awt.Component+.setBackground(Color)) && args(color) {

        colorChangeCount++; // Incrementar el contador

        // Mostrar en consola
        System.out.println("[] Conteo de cambios de color: " + colorChangeCount);

        // Actualizar el texto del JLabel 
        if (counterLabel != null) {
            counterLabel.setText("Cambios de color: " + colorChangeCount);
        }
    }

}
