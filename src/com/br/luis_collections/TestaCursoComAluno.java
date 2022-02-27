package com.br.luis_collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.br.luis_collections.enuns.Sexo;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Trabalahndo com ArrayList", 45));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
	System.out.println("Todos os alunos matriculados : ");
	Set<Aluno> alunos = javaColecoes.getAlunos();
	Iterator<Aluno> iterador = alunos.iterator();
	while(iterador.hasNext()) {
		Aluno proximo = iterador.next();
		System.out.println(proximo);
	}
	
	Aluno depos = iterador.next();
	
	javaColecoes.getAlunos().forEach(aluno ->{
		System.out.println(aluno);
		
	});
	
	
	System.out.println("O aluno: "+a1+" está matriculado?");
	System.out.println(javaColecoes.estaMatriculado(a1));
	System.out.println("");
	Aluno turini = new Aluno("Rodrigo Turini", 34672);
	System.out.println("E esse Turini, está matriculado?");
	System.out.println(javaColecoes.estaMatriculado(turini));
	
	System.out.println("O a1 é == ao Turini?");
	System.out.println(a1.equals(turini));
	}
	
	
}
