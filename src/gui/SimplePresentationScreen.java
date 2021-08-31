package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDateTime;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldGHURL;
	private JTextField texFieldtEmail;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldLU;
	private JLabel lblImage;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacón");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel lblLU = new JLabel("LU");
		lblLU.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblGHURL = new JLabel("GitHub URL");
		lblGHURL.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFieldGHURL = new JTextField();
		textFieldGHURL.setEditable(false);
		textFieldGHURL.setText(studentData.getGithubURL());
		textFieldGHURL.setColumns(10);
		
		texFieldtEmail = new JTextField();
		texFieldtEmail.setText(studentData.getMail());
		texFieldtEmail.setEditable(false);
		texFieldtEmail.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setText(studentData.getFirstName());
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setEditable(false);
		textFieldApellido.setText(studentData.getLastName());
		textFieldApellido.setColumns(10);
		
		textFieldLU = new JTextField();
		textFieldLU.setText(String.valueOf(studentData.getId()));
		textFieldLU.setEditable(false);
		textFieldLU.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGHURL)
								.addComponent(lblEmail)
								.addComponent(lblNombre))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblApellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(22))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblLU, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
							.addGap(22)))
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldLU, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
						.addComponent(textFieldApellido, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
						.addComponent(texFieldtEmail, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
						.addComponent(textFieldGHURL, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
						.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLU)
						.addComponent(textFieldLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido)
						.addComponent(textFieldApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(texFieldtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGHURL)
						.addComponent(textFieldGHURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/Kur.png")));
		contentPane.add(lblImage, BorderLayout.EAST);
		
		JLabel lblTime = new JLabel("Esta ventana fue generada el " + java.time.LocalDate.now() + " a las: " + java.time.LocalTime.now());
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(lblTime, BorderLayout.SOUTH);
	}
}
