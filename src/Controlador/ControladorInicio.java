package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.Inicio;
import Vista.Principal;

public class ControladorInicio implements ActionListener {
	private Inicio ventanaInicio;
	private Principal ventanaPrin;
	ControladorPrincipal controlador;
	
	public ControladorInicio(Inicio ventanaInicio){
		this.ventanaInicio = ventanaInicio;
		this.ventanaInicio.setVisible(true);
		inicializar();
	}
	
	public void inicializar(){
		ventanaInicio.btnAceptar.setActionCommand("btnAceptar");
		ventanaInicio.btnAceptar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("btnAceptar")){
			
			ventanaPrin = new Principal((int)ventanaInicio.spnrEquipos.getValue(),(int)ventanaInicio.spnrEje.getValue());
			controlador = new ControladorPrincipal(ventanaPrin, ventanaPrin.pnlTime);
			ventanaInicio.dispose();
		}
	}

}
