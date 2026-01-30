
package Livro;

public class CadastroLivro {
    public static void main (String [] args) {
    
        Livro livro = new Livro ();
        livro.nome = "Programacao Java 8";
        livro.descricao = " Uma Introducao a Logica De Programacao E Estrutura de Dados ";
        livro.valor = 8.500;
        livro.isbn = "978-85-66250-46-6";
        livro.mostrarDetalhes();
        Livro novolivro = new Livro ();
        novolivro.nome = "Rede De Computadores";
        novolivro.descricao = "Uma Introducao ao Conceito de Rede e Internet";
        novolivro.valor = 10000;
        novolivro.isbn = "978-85-83740-46-6"; 
        livro.mostrarDetalhes();
        Autor autor = new Autor();
        autor.nome = " Bernardo Gimbi";
        autor.email = "bergimbi23@gmail.com";
        autor.cpf = "123.456.789.10";
    }
}
