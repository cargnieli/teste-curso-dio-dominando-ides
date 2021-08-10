package com.local.java;


import model.Gato;

public class PrimeiroPrograma {


    public static void main(String[] args) {

        Gato gato = new Gato("Jose Augusto", "vermelho", 33);
        System.out.println(gato);

        Gato gato1 = new Gato("Fred", "preto", 22);
        System.out.println(gato1);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

    }

}

    class Livro {
     private String nome;
     private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }



