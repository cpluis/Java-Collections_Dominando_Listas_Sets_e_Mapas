package com.br.luis_collections;

import com.br.luis_collections.enuns.Sexo;

public class Aluno implements Comparable<Aluno>{

	
	private String nome;
	private int matricula;
	private String cpf;
	private Sexo sexo;
	
	public Aluno(String nome, int matricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.matricula = matricula;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return matricula;
	}
	public void setIdade(int idade) {
		this.matricula = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + this.nome+ " matricula: "+this.matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nome.hashCode();
	}
	
	@Override
	public int compareTo(Aluno outroAluno) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outroAluno.nome);
	}
	
}
