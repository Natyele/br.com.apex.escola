package br.com.apex.escola.mvc.model;

public class Prova {
	private int id;
	private int periodo;
	private Aluno aluno;
	private Materia materia;
	private double nota = 0.0;
	private int peso = 1;
	
	// Construtor
	public Prova(int periodo, Aluno aluno, Materia materia) {
		super();
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	

}
