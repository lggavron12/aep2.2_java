package aula;
/**AEP 2.2 solu��o orientada a objetos na linguagem Java do diagrama de classes apresentado.
* @author Luiz Gabriel Gavron
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	private static void adiconarAvaliacoes(Reposit�rioDeAvalia��es reposit�rio, Aluno aluno, Disciplina disciplina,
			float... notas) {

		for (float nota : notas) {
			reposit�rio.adicionar(new Avalia��o(aluno, disciplina, nota));
		}

	}

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(1, "a");
		Aluno aluno2 = new Aluno(2, "b");
		Aluno aluno3 = new Aluno(3, "c");
		Aluno aluno4 = new Aluno(4, "d");
		Aluno aluno5 = new Aluno(5, "e");
		Aluno aluno6 = new Aluno(6, "f");
		Aluno aluno7 = new Aluno(7, "g");
		Aluno aluno8 = new Aluno(8, "h");
		Aluno aluno9 = new Aluno(9, "i");
		Aluno aluno10 = new Aluno(10, "j");

		Disciplina Radioastronomia = new Disciplina("Radioastronomia");
		Disciplina Conjuntos = new Disciplina("Conjuntos");
		Disciplina Hardware = new Disciplina("Hardware");
		Disciplina Cosmologia = new Disciplina("Cosmologia");
		Disciplina Quasares = new Disciplina("Quasares");

		List<Disciplina> disciplinas = new ArrayList<>();

		disciplinas.add(Radioastronomia);
		disciplinas.add(Conjuntos);
		disciplinas.add(Hardware);
		disciplinas.add(Cosmologia);
		disciplinas.add(Quasares);

		Reposit�rioDeAvalia��es reposit�rioDeAvalia��es = new Reposit�rioDeAvalia��es();

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno1, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno1, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno1, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno1, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno1, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno2, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno2, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno2, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno2, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno2, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno3, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno3, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno3, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno3, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno3, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno4, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno4, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno4, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno4, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno4, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno5, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno5, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno5, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno5, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno5, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno6, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno6, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno6, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno6, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno6, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno7, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno7, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno7, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno7, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno7, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno8, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno8, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno8, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno8, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno8, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno9, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno9, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno9, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno9, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno9, Quasares, 7, 6, 6, 8);

		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno10, Radioastronomia, 5, 6, 7, 6);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno10, Conjuntos, 8, 1, 2, 8);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno10, Hardware, 8, 8, 8, 1);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno10, Cosmologia, 9, 1, 9, 9);
		adiconarAvaliacoes(reposit�rioDeAvalia��es, aluno10, Quasares, 7, 6, 6, 8);
	}

}