package juegosPersonajes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class JuegosPersonajes {

	public static void main(String[] args) {
		
		String preguntas1 , preguntas2, preguntas3 ;
		
		
		JOptionPane.showMessageDialog(null, null, "Adivine el personaje " , JOptionPane.DEFAULT_OPTION, new ImageIcon(JuegosPersonajes.class.getResource("/img/personajes.jpg")));
		
		preguntas1 =(String) JOptionPane.showInputDialog("Esta vivo?");
		preguntas2 =(String) JOptionPane.showInputDialog("Es mujer?");
		preguntas3 =(String) JOptionPane.showInputDialog("Es politico?");
		

		if (preguntas1.equalsIgnoreCase("si") && preguntas2.equalsIgnoreCase("si") && preguntas3.equalsIgnoreCase("no") ) {
			JOptionPane.showInternalMessageDialog(null, "Esta correcto 😊 "  , "respuesta correcta " , JOptionPane.DEFAULT_OPTION, new ImageIcon(JuegosPersonajes.class.getResource("/img/susana.jpg")));
		} else if(preguntas1.equalsIgnoreCase("si") && preguntas2.equalsIgnoreCase("no") && preguntas3.equalsIgnoreCase("no")) {
			JOptionPane.showInternalMessageDialog(null, "Esta correcto 😊  " , "respuesta correcta " , JOptionPane.DEFAULT_OPTION, new ImageIcon(JuegosPersonajes.class.getResource("/img/messi.jpg")));
		}else if(preguntas1.equalsIgnoreCase("si") && preguntas2.equalsIgnoreCase("no") && preguntas3.equalsIgnoreCase("si")) {
			JOptionPane.showInternalMessageDialog(null, "Esta correcto 😊 " , "respuesta correcta " , JOptionPane.DEFAULT_OPTION, new ImageIcon(JuegosPersonajes.class.getResource("/img/Sergio_Massa.jpg")));
		}else if(preguntas1.equalsIgnoreCase("no") && preguntas2.equalsIgnoreCase("No") &&  preguntas3.equalsIgnoreCase("si") ){
			JOptionPane.showInternalMessageDialog(null, "Esta correcto 😊 " , "respuesta correcta " , JOptionPane.DEFAULT_OPTION, new ImageIcon(JuegosPersonajes.class.getResource("/img/Sarmiento.jpg")));
		}

		 
		 
		 
	}

}
