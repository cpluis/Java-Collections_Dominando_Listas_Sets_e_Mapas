# Java-Collections_Dominando_Listas_Sets_e_Mapas

um dos pontos importantes desse projeto<br>
Com esse comando consigo ordenar por uma classe dentro de outra classe</br>
Nesse exemplo tenho a Classe Aula com outra classe associada é a classe Aluno, nessa classe tenho um atributo nome</br>
e utilizei a função sort da interface Collections para ordenar por nome de aluno </br>


    System.out.println(aulas);</br>
		Collections.sort(aulas);</br>
		System.out.println(aulas);</br>


A SAIDA é essa:</br>
[aluno=Aluno [nome=Ricardo], aluno=Aluno [nome=Andreia], aluno=Aluno [nome=Yago], aluno=Aluno [nome=Marcelo Algusto], aluno=Aluno [nome=Juarez], aluno=Aluno [nome=Felipe]]</br>
[aluno=Aluno [nome=Juarez], aluno=Aluno [nome=Felipe], aluno=Aluno [nome=Marcelo Algusto], aluno=Aluno [nome=Andreia], aluno=Aluno [nome=Yago], aluno=Aluno [nome=Ricardo]]</br>
[aluno=Aluno [nome=Andreia], aluno=Aluno [nome=Felipe], aluno=Aluno [nome=Juarez], aluno=Aluno [nome=Marcelo Algusto], aluno=Aluno [nome=Ricardo], aluno=Aluno [nome=Yago]]</br>

Como é possivel observar os nomes da ultima apresentação esta por ordem alfabetica</br>
