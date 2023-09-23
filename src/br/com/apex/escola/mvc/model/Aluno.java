package br.com.apex.escola.mvc.model;

public class Aluno {
	
	// Atributos
	private String nome;
	private String sobreNome;
	private int idade;
	public String getNome() {
		return nome;
	}
	
	// Getters and Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
