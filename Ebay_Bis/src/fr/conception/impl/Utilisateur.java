/**
 * 
 */
package fr.conception.impl;

import fr.conception.beans.UtilisateurBean;
import fr.conception.enumeration.Etat_PrixReserve;
import fr.conception.interfaces.Acheteur;
import fr.conception.interfaces.Vendeur;

/**
 * @author 'Nes
 *
 */
public class Utilisateur extends UtilisateurBean implements Vendeur,Acheteur {
	
	@Override
	public void emettreOffre() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void publierEnchere() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Etat_PrixReserve prixReserveEstAtteint(Enchere enchere) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void creerEnchere(String desc, String dl) {
		// TODO Auto-generated method stub
		
	}

}
