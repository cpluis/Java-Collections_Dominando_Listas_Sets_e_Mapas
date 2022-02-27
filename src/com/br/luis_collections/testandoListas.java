package com.br.luis_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class testandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
	


		String primeiraAula = aulas.get(0);
		System.out.println("A peimeira aula é :  " + primeiraAula);
		for (String aula : aulas) {
			System.out.println("for each  Aula:             " + aula);
		}
		System.out.println("Tamanho do list é :  " + aulas.size());

		aulas.forEach(aula -> {
			System.out.println("Percorreno :");
			System.out.println("Aula :" + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);

		System.out.println("Depois de ordenados  "+aulas);
	}

}
