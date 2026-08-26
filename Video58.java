package graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco58 miMarco=new Marco58();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco58 extends JFrame
{
	public Marco58()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo58 miLienzo=new Lienzo58();
		this.add(miLienzo);
	}
}


class Lienzo58 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Hola Mundo", 100, 100);
	}
}
