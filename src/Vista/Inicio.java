package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

public class Inicio extends JDialog implements KeyListener{

	private JPanel contentPane;
	public JSpinner spnrEquipos;
	public JSpinner spnrEje;
	public JButton btnAceptar;

	public Inicio() {
		setSize(450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.addKeyListener(this);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblConcursoDeProgramacin = new JLabel("Concurso de Programaci\u00F3n");
		lblConcursoDeProgramacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblConcursoDeProgramacin.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblConcursoDeProgramacin.setBounds(10, 11, 404, 60);
		panel.add(lblConcursoDeProgramacin);
		
		JLabel lblNmeroDeEquipos = new JLabel("N\u00FAmero de Equipos:");
		lblNmeroDeEquipos.setBounds(109, 104, 130, 14);
		panel.add(lblNmeroDeEquipos);
		
		JLabel lblNmeroDeIncisos = new JLabel("N\u00FAmero de Ejercicios:");
		lblNmeroDeIncisos.setBounds(109, 144, 130, 14);
		panel.add(lblNmeroDeIncisos);
		
		spnrEquipos = new JSpinner();
		spnrEquipos.setModel(new SpinnerNumberModel(new Integer(2), new Integer(2), null, new Integer(1)));
		spnrEquipos.setBounds(249, 101, 45, 20);
		panel.add(spnrEquipos);
		
		spnrEje = new JSpinner();
		spnrEje.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spnrEje.setBounds(249, 141, 45, 20);
		panel.add(spnrEje);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(169, 201, 89, 23);
		panel.add(btnAceptar);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,arg0.KEY_PRESSED);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
