package graficos;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Video57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco57 miMarco111=new Marco57();
		miMarco111.setVisible(true);
		miMarco111.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco57 extends JFrame
{
	public Marco57()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Image miIcono=ventana.getImage("src/imagenes/auto.jpg");
		this.setIconImage(miIcono);
		this.setResizable(false);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
	}
}
