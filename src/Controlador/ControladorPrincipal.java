package Controlador;

import Panel.PnlTiempo;
import Vista.Principal;

public class ControladorPrincipal{
	private Principal ventana;
	private ContoladorBtn contBtn;
	private ControladorChange contChange;

	public ControladorPrincipal(Principal ventana, PnlTiempo pnlTiempo){
		this.ventana = ventana;
		contBtn = new ContoladorBtn(pnlTiempo, ventana.pnlOpciones);
		contChange = new ControladorChange(ventana, pnlTiempo);
		ventana.setVisible(true);
		inicializar();
	}
	
	public void inicializar(){
		ventana.btnIniciar.setActionCommand("btnIniciar");
		ventana.btnIniciar.addActionListener(contBtn);
		ventana.spnrLimX.addChangeListener(contChange);
		ventana.spnrLimY.addChangeListener(contChange);
		ventana.spnrFont.addChangeListener(contChange);
		ventana.spnrSeg.addChangeListener(contChange);
		ventana.spnrMin.addChangeListener(contChange);
		ventana.spnrHrs.addChangeListener(contChange);
	}
	

}
