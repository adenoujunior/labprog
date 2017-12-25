
/*Aluno 1: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/

package projeto;

/**
 * @author Adenou e Joyce
 **/


/**
 * Classe de testes (TDD).
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class TestesDoSistemaNaMosca {
    
Produto p = null;

	@Test
	public void testaCriacao() {
		//passando o valor 'null' como argumento para o parâmetro 'descricao'
		try {
			p = new Produto(null, 1);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("O produto tem que ter uma descrição.", e.getMessage());
		}
		//passando um Stringo em branco como argumento para o parâmetro 'descricao'
		try {
			p = new Produto("  ", 1);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("O produto tem que ter uma descrição.", e.getMessage());
		}
		//passando um valor negativo como argumento para o parâmetro 'preço'
		try {
			p = new Produto("Sapato", -1);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("O produto tem que ter um valor de venda maior que zero.", e.getMessage());
		}
		//passando o valor zero como argumento para o parâmetro 'preço'
		try {
			p = new Produto("Sapato", 0);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("O produto tem que ter um valor de venda maior que zero.", e.getMessage());
		}
		//criação do objeto passando valores válidos
		try {
			p = new Produto("Sapato", 199.00);
		}catch(Exception e) {
			fail("Não pode entrar aqui.");
		}
	}
	
	@Test
	public void enviarComentarios(){
		//instanciando a referência a ser usada nos testes
		try {
			p = new Produto("AIRBUS A320", 69000);
		}catch(Exception e) {
			fail("Não pode entrar aqui.");
		}
		//passando o valor 'null' como argumento para o parâmetro 'comentario'
		try {
			p.enviarComentarios("Joyce", null, 2);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("Para avaliar o produto é necessário fornecer um comentario.", e.getMessage());
		}
		//passando uma String vazia como argumento para o parâmetro 'comentario'
		try {
			p.enviarComentarios("Joyce", "", 2);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("Para avaliar o produto é necessário fornecer um comentario.", e.getMessage());
		}
		//passando uma String em branco como argumento para o parâmetro 'comentario'
		try {
			p.enviarComentarios("Joyce", "    ", 2);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("Para avaliar o produto é necessário fornecer um comentario.", e.getMessage());
		}
		//passando uma String em branco como argumento para o parâmetro 'comentario'
		String comentario141caracteres = "qwertyuiopa45687fghftyhfttyuiopasdfghjklçz";
		try {
			p.enviarComentarios("Joyce", comentario141caracteres, 2);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("Seu comentario deve conter no máximo 140 caracteres.", e.getMessage());
		}
		//envio do comentario fornecendo notas fora do intervalo permitido -2 <= n <= 2
		try {
			p.enviarComentarios("Joyce", "O produto é maravilhoso!", -3);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("A nota atribuída ao produto é inválida.", e.getMessage());
		}
		try {
			p.enviarComentarios("Joyce", "O produto é maravilhoso!", 3);
			fail("Não pode entrar aqui.");
		}catch(Exception e) {
			assertEquals("A nota atribuída ao produto é inválida.", e.getMessage());
		}
		//envio do comentario fornecendo valores válidos
		try {
			p.enviarComentarios("Joyce", "O produto é maravilhoso!", 2);
		}catch(Exception e) {
			fail("Não pode entrar aqui.");
		}
	}    
    
    
}
