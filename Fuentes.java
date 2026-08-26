package graficos;

import java.awt.GraphicsEnvironment;

public class Fuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letras[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String tipoLetra:letras)
		{
			System.out.println(tipoLetra);
		}
	}

}
