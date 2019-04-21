package aula;
/**AEP 2.2 solução orientada a objetos na linguagem Java do diagrama de classes apresentado.
* @author Luiz Gabriel Gavron
*/
public class Aluno {
	private String nome;
	private int ra;

	public Aluno(int ra, String nome) {
		ra = this.ra;
		nome = this.nome;
	}

	public String getNome() {
		return nome;
	}

	public int getRA() {
		return ra;
	}
}
