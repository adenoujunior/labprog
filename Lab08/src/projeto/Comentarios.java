
/*Aluno 1: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/

package projeto;

/**
 * @author Adenou e Joyce
 **/

/**
 * Classe que representa uma avaliação de um cliente a um produto.
 *
 */
import java.util.Calendar;

public class Comentarios {
    
   private String CONSUMIDOR_ANONIMO = "Anônimo";
	private String usuario;
	private String comentario;
	private int avaliacao;
	private Calendar data;
	
	/**
	 * @param usuario O nome do consumidor que avaliou o produto.
	 * @param comentario a descriação do cliente ao produto.
	 * @param avaliacao A nota de avaliação do cliente ao produto.
	 * @throws Exception Será lançada caso alguma informação passada seja inválida.
	 */
	public Comentarios(String usuario, String comentario, int avaliacao) throws Exception {
		setUsuario(usuario);
		setComentario(comentario);
		setAvaliacao(avaliacao);
		setData(data);
	}

	/**
	 * @return O nome do consumidor que avaliou o produto.
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario O nome do consumidor que classificou o produto.
	 */
	public void setUsuario(String usuario) {
		if(usuario == null || usuario.trim().isEmpty()) {
			this.usuario = CONSUMIDOR_ANONIMO;
		}else {
			this.usuario = usuario;
		}
	}

	/**
	 * @return O comentário feito a um produto.
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario O comentário que será atribuído ao produto.
	 * @throws Exception Será lançada uma exceção caso o comentário tenha mais que 140 caracteres.
	 */
	public void setComentario(String comentario) throws Exception{
		if(comentario == null || comentario.length() == 0 || comentario.trim().isEmpty()) {
			throw new Exception("Para avaliar o produto é necessário fornecer um comentario.");
		}else if(comentario.length() > 140) {
			throw new Exception("Seu comentario deve conter no máximo 140 caracteres.");
		}else {
			this.comentario = comentario;
		}
	}

	/**
	 * @return A nota atribuída ao produto.
	 */
	public int getAvaliacao() {
		return avaliacao;
	}

	/**
	 * @param avaliacao A nota que será atribuída ao produto.
	 * @throws Exception Será lançada caso a nota/valor sejá inválido nota válida.
	 */
	public void setAvaliacao(int avaliacao) throws Exception {
		if(avaliacao >= -2 && avaliacao <= 2)
			this.avaliacao = avaliacao;
		else
			throw new Exception("A avaliação feita do produto é inválida.");
	}

	/**
	 * @return A data de avaliação do produto.
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * @param data A referência na qual será atribuída uma instância Calendar.
	 */
	private void setData(Calendar data) {
		this.data = Calendar.getInstance();
	}
	
	/**
	 * Retorna uma representação String do comentario do consumidor ao produto.
	 */
	@Override
	public String toString() {
		String string = String.format("Consumidor: %s\nNota: %d\nComentario: %s\n", getUsuario(), getAvaliacao(), getComentario());
		string = string.concat(String.format("Data da avaliação: %02d/%02d/%d - %02d:%02d:%02d", data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH),
				data.get(Calendar.YEAR), data.get(Calendar.HOUR), data.get(Calendar.MINUTE), data.get(Calendar.SECOND)));
		return string;
	} 
    
}