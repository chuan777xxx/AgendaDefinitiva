package Formulario;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {
	ArrayList agenda= new ArrayList();
	
	private JPanel contentPane;
	private JTextField textonombre;
	private JTextField textoapellido;
	private JTextField textotelefono;
	private JTextField textoemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agenda");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblNewLabel.setBounds(28, 21, 185, 57);
		contentPane.add(lblNewLabel);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		nombre.setBounds(21, 115, 113, 27);
		contentPane.add(nombre);
		
		JLabel apellido = new JLabel("Apellidos:");
		apellido.setFont(new Font("Tahoma", Font.PLAIN, 19));
		apellido.setBounds(21, 165, 113, 20);
		contentPane.add(apellido);
		
		JLabel telefono = new JLabel("Telefono:");
		telefono.setFont(new Font("Tahoma", Font.PLAIN, 19));
		telefono.setBounds(21, 205, 113, 27);
		contentPane.add(telefono);
		
		JLabel email = new JLabel("Email:");
		email.setFont(new Font("Tahoma", Font.PLAIN, 19));
		email.setBounds(21, 243, 113, 27);
		contentPane.add(email);
		
		textonombre = new JTextField();
		textonombre.setBounds(114, 122, 140, 20);
		contentPane.add(textonombre);
		textonombre.setColumns(10);
		
		textoapellido = new JTextField();
		textoapellido.setBounds(114, 169, 140, 20);
		contentPane.add(textoapellido);
		textoapellido.setColumns(10);
		
		textotelefono = new JTextField();
		textotelefono.setBounds(114, 212, 140, 20);
		contentPane.add(textotelefono);
		textotelefono.setColumns(10);
		
		textoemail = new JTextField();
		textoemail.setBounds(114, 250, 140, 20);
		contentPane.add(textoemail);
		textoemail.setColumns(10);
		
		JButton guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textonombre.getText();
				String a = textoapellido.getText();
				String t = textotelefono.getText();
				String m = textoemail.getText();
				
				if(n.isEmpty()) {
					if(a.isEmpty()) {
						if(t.isEmpty()) {
							if(m.isEmpty()) {
								
								clase clas = new clase(n,a,Integer.parseInt(t),m);
								agenda.add(clas);
								
								JOptionPane.showMessageDialog(null,"Contacto Guardado");
							}else {
								JOptionPane.showMessageDialog(null,"El campo email esta vacio");
							}
						}else {
							JOptionPane.showMessageDialog(null,"El campo telefono esta vacio");
						}
						
					}else {
						JOptionPane.showMessageDialog(null,"El campo apellido esta vacio");
					}
				}else {
					JOptionPane.showMessageDialog(null,"El campo nombre esta vacio");
				}
			}
		});
		guardar.setBounds(114, 309, 140, 23);
		contentPane.add(guardar);
	}
}
