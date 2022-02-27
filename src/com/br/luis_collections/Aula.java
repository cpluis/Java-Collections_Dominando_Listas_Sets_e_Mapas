package com.br.luis_collections;

public class Aula implements Comparable<Aula>{

	private String titulo;
	private int tempo;
	private Aluno aluno;
	
	public Aula(String titulo, int tempo /*, Aluno aluno */) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
		//this.aluno = aluno;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Aula [titulo=" + this.titulo + ", tempo=" 
	+ this.tempo + /*"aluno=" +this.aluno+*/"]";
	}

	@Override
	public int compareTo(Aula outraAula) {		
		return this.titulo.compareTo(outraAula.titulo);
	}

	
}
