package tarea;

import java.awt.Color;
import java.awt.Component;

public aspect AspectoColor {
  after (Color color): call (void java.awt.Component+.setBackground (Color)) && args (color){
    // Imprime en consola el mensaje del nuevo color de fondo
    System.out.println("Se cambio el color a: " + getColorName(color));
  }

  // metodo para obtener el nombre
  private String getColorName (Color color) {
    if (Color.PINK.equals(color)) return "PINK";
    if (Color.GREEN.equals(color)) return "GREEN";
    if (Color.YELLOW.equals(color)) return "YELLOW";
    return "Otro color";
  }
}
