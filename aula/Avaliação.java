package aula;
/**AEP 2.2 solu��o orientada a objetos na linguagem Java do diagrama de classes apresentado.
* @author Luiz Gabriel Gavron
*/
public class Avalia��o {
	private float nota;
	private Aluno aluno;
	private Disciplina disciplina;

	public Avalia��o(Aluno aluno, Disciplina disciplina, float nota) {
		aluno = this.aluno;
		disciplina = this.disciplina;
		nota = this.nota;
	}

	public float getNota() {
		return nota;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

}
