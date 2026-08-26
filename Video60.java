package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco60 miMarco=new Marco60();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco60 extends JFrame
{
	public Marco60()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo60 miLienzo=new Lienzo60();
		
		this.add(miLienzo);
		
	}
}


class Lienzo60 extends JPanel
{
	

	public void paintComponent(Graphics g)
	{
		
		
		super.paintComponent(g);
		this.setBackground(Color.BLUE);
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D miRectangulo=new Rectangle2D.Double(150,100,300,150);
		g2.draw(miRectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(miRectangulo);
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(150, 100, 450, 250));
		
		Ellipse2D circulo=new Ellipse2D.Double();
		double centroX=miRectangulo.getCenterX();
		double centroY=miRectangulo.getCenterY();
		double radio=167;
		
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);
		
		
		
	}
}