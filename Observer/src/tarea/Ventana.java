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
        
        //Crear 3 botones
        JButton redButton = new JButton("Rosado");
        JButton greenButton = new JButton("Verde");
        JButton blueButton = new JButton("Amarillo");
        
        //Definir que sucedera al hacer click en el botón Rosado
        
        redButton.addActionListener((ActionEvent e) -> panel.setBackground(Color.PINK));
        
        //Define la acción del botón verde
        greenButton.addActionListener((ActionEvent e) -> panel.setBackground(Color .GREEN));
         // Definir la acción del botón Amarillo
        blueButton.addActionListener((ActionEvent e) -> panel. setBackground(Color.YELLOW));
        // Agregar los botones al panel
        panel. add (redButton); 
        panel. add (greenButton); 
        panel.add (blueButton);
        // Mostrar la ventana
        frame.setVisible(true);

    }
	
}
