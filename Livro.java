
package Livro;

public class Livro {
    String nome;
    String descricao;
    String isbn;
    double valor;
    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println (mensagem);
        System.out.println (nome);
        System.out.println(descricao);
        System.out.println(valor);
        System.out.println(isbn);
    }
}
