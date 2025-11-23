package Pekan8_2511532003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAssignmentGUI_2511532003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField VarX;
	private JTextField VarY;
	
	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Eror", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAssignmentGUI_2511532003 frame = new OperatorAssignmentGUI_2511532003();
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
	public OperatorAssignmentGUI_2511532003() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(192, 15, 2, 2);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setBounds(152, 10, 199, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblVariabelX = new JLabel("variabel x");
		lblVariabelX.setBounds(10, 44, 67, 18);
		contentPane.add(lblVariabelX);
		
		JLabel lblVariabelY = new JLabel("variabel y");
		lblVariabelY.setBounds(10, 72, 67, 18);
		contentPane.add(lblVariabelY);
		
		VarX = new JTextField();
		VarX.setBounds(87, 44, 96, 18);
		contentPane.add(VarX);
		VarX.setColumns(10);
		
		VarY = new JTextField();
		VarY.setColumns(10);
		VarY.setBounds(87, 72, 96, 18);
		contentPane.add(VarY);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(10, 115, 53, 18);
		contentPane.add(lblOperator);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOperator.setBounds(71, 114, 28, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("PROSES");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (VarX.getText().trim().isEmpty()) {
					pesanPeringatan("bilangan 1 harus diisi");
				} else if (VarY.getText().trim().isEmpty()){
					pesanPeringatan("bilangan 2 harus diisi");
		}else {
			try { 
				int a = Integer.parseInt(VarX.getText());
				int b = Integer.parseInt(VarY.getText());
				int c = cbOperator.getSelectedIndex();
				if (c==0) {hasil = a+=b;}
				if (c==1) {hasil = a-=b;}
				if (c==2) {hasil = a*=b;}
				if (c==3) {hasil = a/=b;}
				if (c==4) {hasil = a%=b;}
			}catch (NumberFormatException ex) {
				pesanError("bilangan 1 dan 2 harus angka");
			}
		}
				VarX.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(126, 114, 84, 20);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("x = x (operator) y, nilai operator dari x dan y di simpan  di x");
		lblNewLabel_1.setBounds(10, 142, 389, 13);
		contentPane.add(lblNewLabel_1);

	}
}
