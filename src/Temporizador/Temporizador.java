package Temporizador;

import javax.swing.JOptionPane;

import Panel.PnlTiempo;
import Vista.Principal;

public class Temporizador implements Runnable{
	private int seg = 0, min = 0, hora = 0, sumador = 1;
	private int[] tiempos;
	private PnlTiempo ventana;
	
	public Temporizador(PnlTiempo ventana){
		this.ventana = ventana;
		this.tiempos = ventana.getTiempos();
		this.seg = tiempos[0];
		this.min = tiempos[1];
		this.hora = tiempos[2];
	}
	
	@Override
	public void run() {
		while(sumador > 0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
			if(seg == 0){
				seg = 60;
				min --;
			}
			seg--;
			if(min < 0){
				min = 59;
				hora--;
			}
			if(hora <= 0){
				hora = 0;
			}
			sumador = seg + min + hora;
			ventana.setTiempos(hora, min, seg);
		}
		JOptionPane.showMessageDialog(null, "Se acabó el tiempo");
	}
}
