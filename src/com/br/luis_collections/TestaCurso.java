package com.br.luis_collections;

import java.util.Collections;
import java.util.List;

import com.br.luis_collections.enuns.Sexo;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Trabalahndo com ArrayList", 45));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		

		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
