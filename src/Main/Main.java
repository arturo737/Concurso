package Main;

import Vista.Inicio;
import Vista.Principal;
import Controlador.ControladorInicio;
import Controlador.ControladorPrincipal;

public class Main {

	public static void main(String[] args) {
		//Principal ventana = new Principal();
		//ControladorPrincipal controlador = new ControladorPrincipal(ventana, ventana.pnlTime);
		Inicio ventanaInicio = new Inicio();
		ControladorInicio controlI = new ControladorInicio(ventanaInicio);
	}

}
