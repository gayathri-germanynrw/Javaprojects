package de.model;

import java.util.ArrayList;
import java.util.List;

public class DatenBankTelefonBuch {
	
	private List<Kontakte> Telefonbuch = new ArrayList<Kontakte>();
	
	
	public List<Kontakte> getTelefonbuch() {

		return Telefonbuch;
	}
	
	public void setTelefonbuch(List<Kontakte> telefonbuch) {

		Telefonbuch = telefonbuch;
	}
	

	
	public List<Kontakte> viewAllContacts() {

		return Telefonbuch;
	}

}
