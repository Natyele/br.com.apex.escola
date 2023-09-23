package br.com.apex.escola.mvc.model;

import java.util.ArrayList;

public class Boletim {
	private int id;
	private Aluno aluno;
	private int periodo;
	private double media;
	private ArrayList<Prova> provas;
	
	// Construtor
	public Boletim(Aluno aluno, int periodo, double media, ArrayList<Prova> provas) {
		super();
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = media;
		this.provas = new ArrayList<Prova>();
	}
	
	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public ArrayList<Prova> getProvas() {
		return provas;
	}
	public void setProvas(ArrayList<Prova> provas) {
		this.provas = new ArrayList<Prova>();
	}

}
