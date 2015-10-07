package Controlador;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Panel.PnlTiempo;
import Vista.Principal;

public class ControladorChange implements ChangeListener {
	private PnlTiempo pnlTiempo;
	private Principal ventanaP;
	
	public ControladorChange(Principal ventanaP, PnlTiempo pnlTiempo){
		this.pnlTiempo = pnlTiempo;
		this.ventanaP = ventanaP;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		pnlTiempo.setPositionAndFont((int)ventanaP.spnrLimX.getValue(), (int)ventanaP.spnrLimY.getValue(),(int)ventanaP.spnrFont.getValue());
		pnlTiempo.setTiempos((int)ventanaP.spnrHrs.getValue(),(int)ventanaP.spnrMin.getValue(),(int)ventanaP.spnrSeg.getValue());
	}
}
