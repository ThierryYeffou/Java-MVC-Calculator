package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;

public class FrmFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textCote;
	private JTextField textCoteCercle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFrame frame = new FrmFrame();
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
	public FrmFrame() {
		setFont(new Font("Dialog", Font.PLAIN, 45));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yeffo\\OneDrive\\Documents\\projet\\Projet-Java-Git\\MCV-Calculator\\Java-MVC-Calculator\\src\\media\\carre.jpg"));
		lblNewLabel.setBounds(32, 36, 100, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblCt = new JLabel("c\u00F4t\u00E9 =");
		lblCt.setBounds(145, 36, 56, 16);
		contentPane.add(lblCt);
		
		JLabel lblPerimtre = new JLabel("perim\u00E8tre =");
		lblPerimtre.setBounds(144, 78, 83, 16);
		contentPane.add(lblPerimtre);
		
		JLabel lblSurface = new JLabel("surface = ");
		lblSurface.setBounds(144, 120, 83, 16);
		contentPane.add(lblSurface);
		
		textCote = new JTextField();
		textCote.setHorizontalAlignment(SwingConstants.RIGHT);
		textCote.setBounds(212, 36, 116, 22);
		contentPane.add(textCote);
		textCote.setColumns(10);
		
		JLabel lblPerimetreCarre = new JLabel("0");
		lblPerimetreCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreCarre.setBounds(272, 78, 56, 16);
		contentPane.add(lblPerimetreCarre);
		
		JLabel lblSurfaceCarre = new JLabel("0");
		lblSurfaceCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceCarre.setBounds(272, 120, 56, 16);
		contentPane.add(lblSurfaceCarre);
		
		JButton btnButtonCarre = new JButton("button");
		btnButtonCarre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnButtonCarre.setBounds(335, 36, 97, 22);
		contentPane.add(btnButtonCarre);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\yeffo\\OneDrive\\Documents\\projet\\Projet-Java-Git\\MCV-Calculator\\Java-MVC-Calculator\\src\\media\\cercle.jpg"));
		lblNewLabel_1.setBounds(32, 153, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCt_1 = new JLabel("c\u00F4t\u00E9 = ");
		lblCt_1.setBounds(145, 170, 56, 16);
		contentPane.add(lblCt_1);
		
		JLabel lblPerimtre_1 = new JLabel("perim\u00E8tre = ");
		lblPerimtre_1.setBounds(145, 195, 82, 16);
		contentPane.add(lblPerimtre_1);
		
		JLabel lblSurface_1 = new JLabel("surface = ");
		lblSurface_1.setBounds(145, 224, 82, 16);
		contentPane.add(lblSurface_1);
		
		textCoteCercle = new JTextField();
		textCoteCercle.setBounds(212, 167, 116, 22);
		contentPane.add(textCoteCercle);
		textCoteCercle.setColumns(10);
		
		JLabel lblPerimetreCercle = new JLabel("0");
		lblPerimetreCercle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreCercle.setBounds(272, 195, 56, 16);
		contentPane.add(lblPerimetreCercle);
		
		JLabel lblSurfaceCercle = new JLabel("0");
		lblSurfaceCercle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceCercle.setBounds(272, 224, 56, 16);
		contentPane.add(lblSurfaceCercle);
		
		JButton btnButtonCercle = new JButton("button");
		btnButtonCercle.setBounds(335, 166, 97, 23);
		contentPane.add(btnButtonCercle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 282, 432, 185);
		contentPane.add(scrollPane);
		
		JList lstformes = new JList();
		scrollPane.setViewportView(lstformes);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.RED);
		btnDelete.setBounds(335, 467, 97, 25);
		contentPane.add(btnDelete);
	}
}
