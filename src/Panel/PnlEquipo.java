package Panel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.GridLayout;

public class PnlEquipo extends JPanel {

	private JCheckBox arrCheck[];

	public PnlEquipo(int numEjercicios, String nombreEquipo) {
		setLayout(new GridLayout(0, 1, 0, 0));
		this.arrCheck = new JCheckBox[numEjercicios];
		
		JLabel lblEquipo = new JLabel("Equipo " + nombreEquipo);
		lblEquipo.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblEquipo);
		
		for (int i = 0; i < arrCheck.length; i++) {
			arrCheck[i] = new JCheckBox("Ejercicio " + (i + 1));
			add(arrCheck[i]);
		}

	}
}
