package com.br.luis_collections;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

	
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Trabalahndo com ArrayList", 45));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Antonio Silva", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println("Quem é o alnuno com matricula 5617 ?");
		
		Aluno aluno = javaColecoes.buscaMatriculado(34672);
		System.out.println("aluno: "+aluno);

	}

}
