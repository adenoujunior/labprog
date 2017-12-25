
/*Aluno 1: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/

package projeto;

/**
 * @author Adenou e Joyce
 **/

/**
 * Classe de testes extras.
 *
 */

public class TestesExtra {
    
    	public static void main(String[] args) throws Exception {
		Produto p = new Produto("Bolo de Cenoura", 29.99);
		p.enviarComentarios("Cleber", "Excelente", 1);
		p.enviarComentarios("Sylvana", "Bom", 2);
		p.enviarComentarios("Júnior", "Normal", 1);
		p.enviarComentarios("Harry", "Muito bom", 1);
		p.enviarComentarios("Hermione", "Rasoavel", 2);
		p.enviarComentarios("Rony", "Na média, muito pequeno", -2);
		p.verComentariosEstrategiaSimples();
		p.verComentariosEstrategiaSazional();
	}
    
}