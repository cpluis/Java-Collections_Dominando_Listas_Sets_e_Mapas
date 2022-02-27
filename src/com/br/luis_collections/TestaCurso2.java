package com.br.luis_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.br.luis_collections.enuns.Sexo;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 19));
		javaColecoes.adiciona(new Aula("Trabalahndo com ArrayList", 45));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Kotlin testan API ", 65));
		javaColecoes.adiciona(new Aula("Aprendendo sistemas ", 13));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
// usando uma coleção pra ordenar  
		Collections.sort(aulas);
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}
}
