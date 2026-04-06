package br.com.fiap2espa;

public class Livro {

    private String titulo;
    private String categoria;

    //Construtor vazio
    public Livro() {
    };

    //Constructo de todos os atributos
    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    //Getter e insert
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Método toString (Para não dar o endereço da memória
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}