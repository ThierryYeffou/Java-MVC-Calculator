package controller;
import model.Carre;
import model.Rond;
import vue.FrmFrame;

public class Controller {
	
	FrmFrame frmformes;

	public static void main(String[] args) {
		new Controller();

	}
	
	public void envoiFrameFormTypeValeur(String type, Object value) {
		if (type == "carre") {
			Carre lecarre = new Carre((float) value);
			frmformes.afficheResultatCarre(lecarre.perimetre(), lecarre.surface());
		}
		else {
			Rond lerond = new Rond((float)value);
			frmformes.afficheResultatRond(lerond.perimetre(), lerond.surface());
		}
	}
	
	public Controller() {
		frmformes = new FrmFrame(this);
		frmformes.setVisible(true);
	}

}
