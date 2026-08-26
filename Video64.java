package graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Video64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco64 miMarco=new Marco64();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco64 extends JFrame
{
	public Marco64()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo64 miLienzo=new Lienzo64(anchoVentana,altoVentana);
		this.add(miLienzo);
	}
	
}

class Lienzo64 extends JPanel
{
	private Image miImagen;
	private int anchoMarco,altoMarco;
	
	public Lienzo64(int ancho,int alto)
	{
		anchoMarco=ancho/2;
		altoMarco=alto/2;
		
		try
		{
			miImagen=ImageIO.read(new File("src/imagenes/auto.jpg"));
		}
		catch(IOException e)
		{
			System.out.println("La imagen no se encuentra");
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(miImagen, 0, 0,null);
		int anchoImagen=miImagen.getWidth(this);
		int altoImagen=miImagen.getHeight(this);
		
		for(int i=0;i<anchoMarco;i++)
		{
			for(int j=0;j<altoMarco;j++)
			{
				g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i,altoImagen* j);
			}
		}
	}
}