package br.com.dio.model;

public class Livro {

        private String nome;
        private Integer nPaginas;

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", nPaginas=" + nPaginas +
                    '}';
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getnPaginas() {
            return nPaginas;
        }

        public void setnPaginas(Integer nPaginas) {
            this.nPaginas = nPaginas;
        }

        public Livro(String nome, Integer nPaginas) {
            this.nome = nome;
            this.nPaginas = nPaginas;
        }
    }


