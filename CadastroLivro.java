
package Livro;

public class CadastroLivro {
    public static void main (String [] args) {
    
        Livro livro = new Livro ();
        livro.nome = "Programacao Java 8";
        livro.derscricao = " Uma Introducao a Logica De Programacao E Estrutura de Dados ";
        livro.valor = 8.500;
        livro.isbn = "978-85-66250-46-6";
        
        System.out.println("Nome do Livro " + livro.nome);
        System.out.println ("Descricao do Livro: " + livro.derscricao);
        System.out.println ("Preco do Livro: " + livro.valor);
        System.out.println ("ISBN: " + livro.isbn);
        
        Livro novolivro = new Livro ();
        novolivro.nome = "Rede De Computadores";
        novolivro.derscricao = "Uma Introducao ao Conceito de Rede e Internet";
        novolivro.valor = 10000;
        novolivro.isbn = "978-85-83740-46-6"; 
        
        System.out.println ("Nome do Livro: " + novolivro.nome);
        System.out.println ("Descricao do Livro: " + novolivro.derscricao);
        System.out.println ("Preco do Livro: " + novolivro.valor);
        System.out.println ("ISBN: " + novolivro.isbn);                
    }
}
