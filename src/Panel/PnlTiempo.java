package Panel;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


public class PnlTiempo extends JPanel {
	private int tiempoNum[] = {0,0,5};
	private String tiempoCad[] = {"","",""};
	private int tamanioFuente = 200, limiteX = 250, limiteY = 170;
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Arial", Font.BOLD, tamanioFuente)); 
		for (int i = 0; i < tiempoNum.length; i++) {
			if(tiempoNum[i] < 10){
				tiempoCad[i] = "0" + tiempoNum[i];
			}
			else{
				tiempoCad[i] = "" + tiempoNum[i];				}
		}
		g.drawString((tiempoCad[2] + ":" + tiempoCad[1]+ ":" + tiempoCad[0]), limiteX , limiteY);
	}
	
	public void setTiempos(int hora, int min, int seg){
		this.tiempoNum[0] = seg;
		this.tiempoNum[1] = min;
		this.tiempoNum[2] = hora;
		repaint();
	}
	
	public void setPositionAndFont(int limiteX, int limiteY, int tamanioFuente){
		this.limiteX = limiteX;
		this.limiteY = limiteY;
		this.tamanioFuente = tamanioFuente;
		repaint();
	}
	
	public int[] getTiempos(){
		return tiempoNum;
	}
}
