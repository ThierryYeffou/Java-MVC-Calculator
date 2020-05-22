package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import model.Carre;
import model.Rond;
import model.Formes;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;

public class FrmFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textCarre;
	private JTextField textRond;
	private JLabel lblSurfaceRondField;
	private JLabel lblPerimtreRondField;
	private JLabel lblSurfaceCarreField;
	private JLabel lblPerimetreCarre;
	private JLabel lblSurfaceCarre;
	private JLabel lblPerimtreRond;
	private JLabel lblSurfaceRond;
	private JList lstformes;
	private DefaultListModel defautListeModel = new DefaultListModel();
	
	private Controller controller;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/
	
	public void calculCarre() {
		controller.envoiFrameFormTypeValeur("carre",Float.parseFloat(textCarre.getText()));
	}
	
	public void calculRond() {
		controller.envoiFrameFormTypeValeur("rond",Float.parseFloat(textRond.getText()));
	}
	
	public void delete() {
		 int index = lstformes.getSelectedIndex();
		 defautListeModel.getElementAt(index);
	}
	public void miseAjourAffichage(ArrayList<Formes> formes){
		String ligne;
		//test du type de forme
		defautListeModel.clear();
		for(Formes forme : formes) {
			if(forme instanceof Carre) {
				//affichage message de la forme detectée dans la chaine
				ligne = "Le CARRE de coté : " + ((Carre) forme).getCote(); //transtipage car forme n'a pas l'attribut cote
			}
			else {
				ligne = "Le ROND de rayon : " + ((Rond) forme).getRayon();
			}
			
			//recupération et affichage des valeurs perimetres et aires en utilisant le polymorphiste
			ligne += " à pour perimetre: "+ forme.perimetre()+ " et pour surface : "+ forme.surface();
			//affichage dans la jlist
			defautListeModel.addElement(ligne);
		}
		
	}
	
	public void afficheResultatCarre(float perimetre, float surface) {
		lblPerimetreCarre.setText("" + perimetre);
		lblSurfaceCarre.setText(""+ surface);
	}
	
	public void afficheResultatRond(float perimetre, float surface) {
		lblPerimtreRond.setText("" + perimetre);
		lblSurfaceRond.setText(""+ surface);
	}

	/**
	 * Create the frame.
	 * @param controller 
	 */
	public FrmFrame(Controller controller) {
		
		this.controller = controller;
		
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
		
		JLabel lblPerimtreCarre = new JLabel("perim\u00E8tre =");
		lblPerimtreCarre.setBounds(144, 78, 83, 16);
		contentPane.add(lblPerimtreCarre);
		
		lblSurfaceCarreField = new JLabel("surface = ");
		lblSurfaceCarreField.setBounds(144, 120, 83, 16);
		contentPane.add(lblSurfaceCarreField);
		
		textCarre = new JTextField();
		textCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		textCarre.setBounds(212, 36, 116, 22);
		contentPane.add(textCarre);
		textCarre.setColumns(10);
		
		lblPerimetreCarre = new JLabel("0");
		lblPerimetreCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreCarre.setBounds(272, 78, 56, 16);
		contentPane.add(lblPerimetreCarre);
		
		
		JButton btnButtonCarre = new JButton("calcul");
		btnButtonCarre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculCarre();
			}
		});
		btnButtonCarre.setBounds(335, 36, 97, 22);
		contentPane.add(btnButtonCarre);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\yeffo\\OneDrive\\Documents\\projet\\Projet-Java-Git\\MCV-Calculator\\Java-MVC-Calculator\\src\\media\\cercle.jpg"));
		lblNewLabel_1.setBounds(32, 153, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		lblPerimtreRondField = new JLabel("perim\u00E8tre = ");
		lblPerimtreRondField.setBounds(145, 195, 82, 16);
		contentPane.add(lblPerimtreRondField);
		
		lblSurfaceRondField = new JLabel("surface = ");
		lblSurfaceRondField.setBounds(145, 224, 82, 16);
		contentPane.add(lblSurfaceRondField);
		
		textRond = new JTextField();
		textRond.setHorizontalAlignment(SwingConstants.RIGHT);
		textRond.setBounds(212, 167, 116, 22);
		contentPane.add(textRond);
		textRond.setColumns(10);

		
		JButton btnButtonCercle = new JButton("calcul");
		btnButtonCercle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculRond();
			}
		});
		btnButtonCercle.setBounds(335, 166, 97, 23);
		contentPane.add(btnButtonCercle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 282, 432, 185);
		contentPane.add(scrollPane);
		
	    lstformes = new JList(defautListeModel);
		lstformes.setLayoutOrientation(JList.VERTICAL_WRAP);
		scrollPane.setViewportView(lstformes);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete();
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setBounds(335, 467, 97, 25);
		contentPane.add(btnDelete);
		
		JLabel lblRayon = new JLabel("rayon");
		lblRayon.setBounds(145, 170, 56, 16);
		contentPane.add(lblRayon);
		
		lblSurfaceCarre = new JLabel("0");
		lblSurfaceCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceCarre.setBounds(272, 120, 56, 16);
		contentPane.add(lblSurfaceCarre);
		
		lblPerimtreRond = new JLabel("0");
		lblPerimtreRond.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimtreRond.setBounds(272, 195, 56, 16);
		contentPane.add(lblPerimtreRond);
		
		lblSurfaceRond = new JLabel("0");
		lblSurfaceRond.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceRond.setBounds(272, 224, 56, 16);
		contentPane.add(lblSurfaceRond);
	}
}
