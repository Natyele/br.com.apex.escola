package br.com.apex.escola.mvc.controller;

import java.util.ArrayList;

import br.com.apex.escola.mvc.model.Boletim;
import br.com.apex.escola.mvc.model.BoletimDAO;
import br.com.apex.escola.mvc.model.Prova;
import br.com.apex.escola.mvc.model.peristence.ArrayListPersistenceBoletim;

public class BoletimController {

	private Boletim boletim;
	private BoletimDAO boletimDAO;
	private ArrayListPersistenceBoletim dbBoletim = new ArrayListPersistenceBoletim();

	/**
	 * Classe de controle do boletim
	 * 
	 * Recebr um boletim e verifica se o boletim ja existe na persistencia. existir,
	 * cria um novo
	 * 
	 * @param boletimEntrada
	 */
	public BoletimController(Boletim boletimEntrada) {
		this.boletimDAO = new BoletimDAO(dbBoletim);
		this.boletim = boletimEntrada;
	}

	public Boletim addBoletim() {
		if (this.boletim.getId() == 0) {
			return this.boletimDAO.add(boletim);
		}
		return this.boletim;
	}

	public void avaliacaoBoletim(Prova prova) {
		ProvaController provaController = new ProvaController(prova);
		if (prova.getId() == 0) {
			provaController.addProva();
		} else {
			provaController.get(prova.getId());
		}
		boletim.getProvas().add(prova);
		this.calcularMedia();
	}

	private void calcularMedia() {
		Double total = 0.0;
		int pesos = 0;
		for (Prova prova : boletim.getProvas()) {
			total += prova.getNota() * prova.getPeso();
			pesos += prova.getPeso();
		}
		boletim.setMedia(total / pesos);

	}

	public void removeProva(int index) {
		ProvaController provaController = new ProvaController(index);
		provaController.removeProva();
		try {
			boletim.getProvas().remove(index);
			this.calcularMedia();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void removeTodasProvas() {
		ArrayList<Prova> provas = this.boletim.getProvas();

		for (Prova prova : provas) {
			ProvaController provaController = new ProvaController(prova);
			provaController.removeProva();
		}
		this.boletim.getProvas().clear();
		this.calcularMedia();
	}

	public Boletim getBoletim() {
		return this.boletim;
	}

}
