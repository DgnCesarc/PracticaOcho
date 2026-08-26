package graficos;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco62 miMarco=new Marco62();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco62 extends JFrame
{
	public Marco62()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo62 miLienzo=new Lienzo62();
		this.add(miLienzo);
	}
}

class Lienzo62 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		g2.setFont(new Font("Comic Sans MS",Font.ITALIC,32));
		g2.drawString("Hola Bienvenidos", 50, 50);
		
		g2.setFont(new Font("Impact",Font.BOLD,22));
		g2.drawString("Segundo Texto", 50, 150);
	}
}
