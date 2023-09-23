package br.com.apex.escola.mvc.model;

import br.com.apex.escola.mvc.model.peristence.ArrayListPersistenceProva;

public class ProvaDAO {
	
	ArrayListPersistenceProva db;
	
	public ProvaDAO(ArrayListPersistenceProva db) {
		this.db = db;
	}
	
	public void removeAll() {
		db.removerAll();
	}
	
	public void remove(Integer index) {
		db.remove(index);
	}
	
	public Prova add(Prova prova) {
		return db.add(prova);
	}
	
	public Prova get(Integer index) {
		return db.get(index);
	}
}	
	
	
	
