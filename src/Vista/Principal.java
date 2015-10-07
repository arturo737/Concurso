package Vista;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SpinnerNumberModel;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import Panel.PnlEquipo;
import Panel.PnlTiempo;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	public PnlTiempo pnlTime;
	public JPanel pnlOpciones;
	public JSpinner spnrLimX;
	public JSpinner spnrLimY;
	public JSpinner spnrHrs;
	public JButton btnIniciar;
	public JSpinner spnrSeg;
	public JSpinner spnrMin;
	public JSpinner spnrFont;
	private int numEjercicios = 0;
	private int numEquipos = 0;
	
	public Principal(int numEquipos, int numEjercicios) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension tamanio = tk.getScreenSize();
		setSize((int)tamanio.getWidth(), (int)tamanio.getHeight());
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.numEjercicios = numEjercicios;
		this.numEquipos = numEquipos;
		pnlTime = new PnlTiempo();
		contentPane.add(pnlTime, BorderLayout.CENTER);
		
		JPanel pnlEquipos = new JPanel();
		pnlEquipos.setMinimumSize(new Dimension(10, 100));
		pnlEquipos.setPreferredSize(new Dimension(10, 300));
		contentPane.add(pnlEquipos, BorderLayout.SOUTH);
		pnlEquipos.setLayout(new GridLayout(0, numEquipos, 0, 0));
		
		for (int i = 0; i < numEquipos; i++) {
			pnlEquipos.add(new PnlEquipo(numEjercicios,"" + (i+1)));
		}
		
		pnlOpciones = new JPanel();
		pnlOpciones.setPreferredSize(new Dimension(10, 40));
		contentPane.add(pnlOpciones, BorderLayout.NORTH);
		GridBagLayout gbl_pnlOpciones = new GridBagLayout();
		gbl_pnlOpciones.columnWidths = new int[] {50, 50, 60, 50, 120, 50, 111, 60, 50, 60, 50, 60, 50, 111, 0};
		gbl_pnlOpciones.rowHeights = new int[] {20, 0};
		gbl_pnlOpciones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlOpciones.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlOpciones.setLayout(gbl_pnlOpciones);
		
		JLabel lblLimX = new JLabel("Limite X:");
		GridBagConstraints gbc_lblLimX = new GridBagConstraints();
		gbc_lblLimX.anchor = GridBagConstraints.EAST;
		gbc_lblLimX.fill = GridBagConstraints.VERTICAL;
		gbc_lblLimX.insets = new Insets(0, 0, 0, 5);
		gbc_lblLimX.gridx = 0;
		gbc_lblLimX.gridy = 0;
		pnlOpciones.add(lblLimX, gbc_lblLimX);
		
		spnrLimX = new JSpinner();
		spnrLimX.setModel(new SpinnerNumberModel(new Integer(250), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spnrLimX = new GridBagConstraints();
		gbc_spnrLimX.fill = GridBagConstraints.BOTH;
		gbc_spnrLimX.insets = new Insets(0, 0, 0, 5);
		gbc_spnrLimX.gridx = 1;
		gbc_spnrLimX.gridy = 0;
		pnlOpciones.add(spnrLimX, gbc_spnrLimX);
		
		JLabel lblLimY = new JLabel("Limite Y:");
		lblLimY.setAlignmentY(Component.TOP_ALIGNMENT);
		GridBagConstraints gbc_lblLimY = new GridBagConstraints();
		gbc_lblLimY.anchor = GridBagConstraints.EAST;
		gbc_lblLimY.fill = GridBagConstraints.VERTICAL;
		gbc_lblLimY.insets = new Insets(0, 0, 0, 5);
		gbc_lblLimY.gridx = 2;
		gbc_lblLimY.gridy = 0;
		pnlOpciones.add(lblLimY, gbc_lblLimY);
		
		spnrLimY = new JSpinner();
		spnrLimY.setModel(new SpinnerNumberModel(new Integer(170), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spnrLimY = new GridBagConstraints();
		gbc_spnrLimY.fill = GridBagConstraints.BOTH;
		gbc_spnrLimY.insets = new Insets(0, 0, 0, 5);
		gbc_spnrLimY.gridx = 3;
		gbc_spnrLimY.gridy = 0;
		pnlOpciones.add(spnrLimY, gbc_spnrLimY);
		
		JLabel lblFont = new JLabel("Tama\u00F1o de la Fuente");
		GridBagConstraints gbc_lblFont = new GridBagConstraints();
		gbc_lblFont.fill = GridBagConstraints.VERTICAL;
		gbc_lblFont.anchor = GridBagConstraints.EAST;
		gbc_lblFont.insets = new Insets(0, 0, 0, 5);
		gbc_lblFont.gridx = 4;
		gbc_lblFont.gridy = 0;
		pnlOpciones.add(lblFont, gbc_lblFont);
		
		spnrFont = new JSpinner();
		spnrFont.setModel(new SpinnerNumberModel(new Integer(200), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spnrFont = new GridBagConstraints();
		gbc_spnrFont.fill = GridBagConstraints.HORIZONTAL;
		gbc_spnrFont.insets = new Insets(0, 0, 0, 5);
		gbc_spnrFont.gridx = 5;
		gbc_spnrFont.gridy = 0;
		pnlOpciones.add(spnrFont, gbc_spnrFont);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 0;
		pnlOpciones.add(label_2, gbc_label_2);
		
		JLabel lblHr = new JLabel("Horas:      ");
		GridBagConstraints gbc_lblHr = new GridBagConstraints();
		gbc_lblHr.anchor = GridBagConstraints.EAST;
		gbc_lblHr.fill = GridBagConstraints.VERTICAL;
		gbc_lblHr.insets = new Insets(0, 0, 0, 5);
		gbc_lblHr.gridx = 7;
		gbc_lblHr.gridy = 0;
		pnlOpciones.add(lblHr, gbc_lblHr);
		
		spnrHrs = new JSpinner();
		spnrHrs.setModel(new SpinnerNumberModel(new Integer(5), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spnrHrs = new GridBagConstraints();
		gbc_spnrHrs.fill = GridBagConstraints.BOTH;
		gbc_spnrHrs.insets = new Insets(0, 0, 0, 5);
		gbc_spnrHrs.gridx = 8;
		gbc_spnrHrs.gridy = 0;
		pnlOpciones.add(spnrHrs, gbc_spnrHrs);
		
		JLabel lblMin = new JLabel("Minutos:   ");
		GridBagConstraints gbc_lblMin = new GridBagConstraints();
		gbc_lblMin.anchor = GridBagConstraints.EAST;
		gbc_lblMin.fill = GridBagConstraints.VERTICAL;
		gbc_lblMin.insets = new Insets(0, 0, 0, 5);
		gbc_lblMin.gridx = 9;
		gbc_lblMin.gridy = 0;
		pnlOpciones.add(lblMin, gbc_lblMin);
		
		spnrMin = new JSpinner();
		spnrMin.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spnrMin = new GridBagConstraints();
		gbc_spnrMin.fill = GridBagConstraints.BOTH;
		gbc_spnrMin.insets = new Insets(0, 0, 0, 5);
		gbc_spnrMin.gridx = 10;
		gbc_spnrMin.gridy = 0;
		pnlOpciones.add(spnrMin, gbc_spnrMin);
		
		JLabel lblSeg = new JLabel("Segundos:");
		GridBagConstraints gbc_lblSeg = new GridBagConstraints();
		gbc_lblSeg.anchor = GridBagConstraints.EAST;
		gbc_lblSeg.fill = GridBagConstraints.VERTICAL;
		gbc_lblSeg.insets = new Insets(0, 0, 0, 5);
		gbc_lblSeg.gridx = 11;
		gbc_lblSeg.gridy = 0;
		pnlOpciones.add(lblSeg, gbc_lblSeg);
		
		spnrSeg = new JSpinner();
		spnrSeg.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spnrSeg = new GridBagConstraints();
		gbc_spnrSeg.fill = GridBagConstraints.BOTH;
		gbc_spnrSeg.insets = new Insets(0, 0, 0, 5);
		gbc_spnrSeg.gridx = 12;
		gbc_spnrSeg.gridy = 0;
		pnlOpciones.add(spnrSeg, gbc_spnrSeg);
		
		btnIniciar = new JButton("Iniciar");
		GridBagConstraints gbc_btnIniciar = new GridBagConstraints();
		gbc_btnIniciar.fill = GridBagConstraints.BOTH;
		gbc_btnIniciar.gridx = 13;
		gbc_btnIniciar.gridy = 0;
		pnlOpciones.add(btnIniciar, gbc_btnIniciar);
		
		pnlOpciones.setVisible(true);
	}
}
