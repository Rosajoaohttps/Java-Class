// Classe base
class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Preço: " + preco);
    }
}

// Subclasse Livro
class Livro extends Produto {
    String autor;
    int numeroPaginas;

    public Livro(String nome, double preco, String autor, int numeroPaginas) {
        super(nome, preco);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor + ", Número de Páginas: " + numeroPaginas);
    }
}

// Subclasse Camisa
class Camisa extends Produto {
    String cor;
    String tamanho;

    public Camisa(String nome, double preco, String cor, String tamanho) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor: " + cor + ", Tamanho: " + tamanho);
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("Java Programming", 59.90, "Autor A", 300);
        Produto camisa = new Camisa("Camisa Polo", 39.90, "Azul", "M");

        livro.exibirInfo();
        camisa.exibirInfo();
    }
}