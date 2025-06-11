package tarea;

import javax.swing.*; // Importar los componentes gráficos 
import java.awt.*;    // Importar clases para manejar colores y layouts
import java.awt.event.ActionEvent; // Importar clases para manejar eventos 

public class Ventana {

	//metodo principal
	public static void main(String[] args) {
		//llamar al metodo para crear interfaz
		 SwingUtilities.invokeLater(Ventana::createAndShowGUI);
	}
	
	// Método que construye y muestra la ventana 
    private static void createAndShowGUI() {
        // Crear la ventana principal 
        JFrame frame = new JFrame("Ventana de Colores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(600, 400); // Definir el tamaño de la ventana 

        // Crear un panel donde se colocarán los botones
        JPanel panel = new JPanel();
        
        frame.add(panel); // Agregar el panel a la ventana

        
    }
	
}
