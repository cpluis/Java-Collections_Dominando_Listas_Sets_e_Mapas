package com.br.luis_collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAulunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");

		System.out.println(alunos.size());
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		// System.out.println(alunos);
	}

}
