package com.br.luis_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos= new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAlunoMap = new HashMap<Integer, Aluno>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
	
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "Curso "+nome+ "tempo total : "+this.getTempoTotal()+" ,"
				+"aulas: "+this.aulas;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);		
		this.matriculaParaAlunoMap.put(aluno.getMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);		
	}

	public boolean estaMatriculado(Aluno aluno) {		
		return this.alunos.contains(alunos);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAlunoMap.containsKey(numero))
			throw new NoSuchElementException("Matricula não encontrada!!");
		return matriculaParaAlunoMap.get(numero);
	}

}
