package controller;
import java.util.ArrayList;

import model.Carre;
import model.Formes;
import model.Rond;
import vue.FrmFrame;

public class Controller {
	
	private FrmFrame frmformes;
	private ArrayList<Formes> lesFormes = new ArrayList<Formes>();

	public static void main(String[] args) {
		new Controller();

	}
	
	// use polymorphisme
	/*public void envoiValue(float value) {
		lesFormes.add(new Carre(value));
		lesFormes.add(new Rond(value));
		for (Formes forme : lesFormes) {
			if(forme instanceof Carre) {
				frmformes.afficheResultatCarre(forme.perimetre(),forme.surface());
			}
			else {
				frmformes.afficheResultatRond(forme.perimetre(),forme.surface());
			}
		}
	}*/
	
	public void envoiFrameFormTypeValeur(String type, Object value) {
		Formes uneforme;
		if (type == "carre") {
			uneforme = new Carre((float) value);
			frmformes.afficheResultatCarre(uneforme.perimetre(), uneforme.surface());
		}
		else {
			 uneforme = new Rond((float)value);
			frmformes.afficheResultatRond(uneforme.perimetre(), uneforme.surface());
		}
		lesFormes.add(uneforme);
		//envoie des valeur à l'affichage
		frmformes.miseAjourAffichage(lesFormes);
	}
	
	public Controller() {
		frmformes = new FrmFrame(this);
		frmformes.setVisible(true);
	}

}
