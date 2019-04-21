package aula;
/**AEP 2.2 solução orientada a objetos na linguagem Java do diagrama de classes apresentado.
* @author Luiz Gabriel Gavron
*/
import java.util.ArrayList;
import java.util.List;


public class RepositórioDeAvaliações {

	private java.util.List<Avaliação> avaliações = new ArrayList<Avaliação>();

	public void adicionar(Avaliação avaliação) {
		avaliações.add(avaliação);
	}

	 public Aluno[] obterAprovados(Disciplina disciplina) {
	       return 0;
	    }
}
