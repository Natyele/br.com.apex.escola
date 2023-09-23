package br.com.apex.escola.mvc.model.peristence;

import java.util.ArrayList;

abstract public class ArrayListPersistence<T> {
	
	ArrayList<T> dados;
	
	abstract boolean removerAll();
	abstract boolean remove(int indexItem);
	abstract T add(T item);
	abstract T get(int index);
	abstract ArrayList<T> getAll();
	boolean remove(Integer indexItem) {
		// TODO Auto-generated method stub
		return false;
	}

}
