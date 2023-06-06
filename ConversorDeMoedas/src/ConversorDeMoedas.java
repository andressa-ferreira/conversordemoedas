import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ConversorDeMoedas extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Conversor de Moedas");
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtValor;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton Converte;
	private JComboBox txtDe;
	private JComboBox txtPara;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeMoedas frame = new ConversorDeMoedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorDeMoedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 517);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{172, 185, 1, 105, 0};
		gbl_contentPane.rowHeights = new int[]{76, 0, 0, 0, 56, 87, 87, 94, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		btnNewButton.setBorder(new EmptyBorder(10, 17, 10, 17));
		btnNewButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnNewButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		lblNewLabel = new JLabel("Valor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		txtValor = new JTextField();
		GridBagConstraints gbc_txtValor = new GridBagConstraints();
		gbc_txtValor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtValor.gridheight = 3;
		gbc_txtValor.insets = new Insets(0, 0, 5, 5);
		gbc_txtValor.gridx = 1;
		gbc_txtValor.gridy = 2;
		contentPane.add(txtValor, gbc_txtValor);
		txtValor.setColumns(10);
		
		lblNewLabel_1 = new JLabel("De");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 5;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtDe = new JComboBox();
		txtDe.setModel(new DefaultComboBoxModel(new String[] {"BRL"}));
		GridBagConstraints gbc_txtDe = new GridBagConstraints();
		gbc_txtDe.insets = new Insets(0, 0, 5, 5);
		gbc_txtDe.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDe.gridx = 1;
		gbc_txtDe.gridy = 5;
		contentPane.add(txtDe, gbc_txtDe);
		
		lblNewLabel_2 = new JLabel("Para");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtPara = new JComboBox();
		txtPara.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR"}));
		GridBagConstraints gbc_txtPara = new GridBagConstraints();
		gbc_txtPara.insets = new Insets(0, 0, 5, 5);
		gbc_txtPara.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPara.gridx = 1;
		gbc_txtPara.gridy = 6;
		contentPane.add(txtPara, gbc_txtPara);
		
		Converte = new JButton("Converter");
		Converte.setForeground(new Color(255, 0, 128));
		Converte.setBackground(new Color(243, 209, 242));
		Converte.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_Converte = new GridBagConstraints();
		gbc_Converte.insets = new Insets(0, 0, 0, 5);
		gbc_Converte.gridx = 1;
		gbc_Converte.gridy = 7;
		contentPane.add(Converte, gbc_Converte);
	}

}
