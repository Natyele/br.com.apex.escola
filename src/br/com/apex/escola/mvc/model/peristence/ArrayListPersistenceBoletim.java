package br.com.apex.escola.mvc.model.peristence;

import java.util.ArrayList;

import br.com.apex.escola.mvc.model.Boletim;

public class ArrayListPersistenceBoletim extends ArrayListPersistence<Boletim> {

	public ArrayList<Boletim> dados = new ArrayList<Boletim>();

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
	public Boletim add(Boletim item) {
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
	public Boletim get(int index) {
		try {
			return dados.get(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public ArrayList<Boletim> getAll() {
		try {
			return dados;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}