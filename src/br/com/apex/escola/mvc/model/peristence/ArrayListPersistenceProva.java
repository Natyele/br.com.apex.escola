package br.com.apex.escola.mvc.model.peristence;

import java.util.ArrayList;

import br.com.apex.escola.mvc.model.Prova;

public class ArrayListPersistenceProva extends ArrayListPersistence<Prova> {
	
	public ArrayList<Prova> dados = new ArrayList<Prova>();

	@Override
	public boolean removerAll() {
		try {
			dados.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public boolean remove(int indexItem) {
		try {
			dados.remove((int) indexItem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
public Prova add(Prova item) {
		try {
			Integer id = dados.size();
			item.setId(id);
			dados.add(item);
			return item;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Prova get(int index) {
		try {
			return dados.get(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	ArrayList<Prova> getAll() {
		try {
			return dados;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}