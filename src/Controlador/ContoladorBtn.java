package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Panel.PnlTiempo;
import Temporizador.Temporizador;

public class ContoladorBtn implements ActionListener {
	private Thread hilo;
	private PnlTiempo pnlTiempo;
	private JPanel pnlOpciones;
	
	public ContoladorBtn(PnlTiempo pnlTiempo, JPanel pnlOpciones){
		this.pnlTiempo = pnlTiempo;
		this.pnlOpciones = pnlOpciones;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("btnIniciar")){
			hilo = new Thread(new Temporizador(pnlTiempo));
			hilo.start();
			pnlOpciones.setVisible(false);
		}
	}

}
