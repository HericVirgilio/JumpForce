package LeitorDeLivros.Domain;

public class Pessoa {
        private String nome;
        private int idade;
        private char sexo;

        private Livro leituraAtual;

        public Pessoa(String nome, int diade, char sexo,Livro leituraAtual){
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
            this.leituraAtual = leituraAtual;
        }
        public void FazerAniversario(){
            this.setIdade(getIdade() + 1);
        }
        public void status(){
            System.out.println("============== Leitor ===============");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Sexo: " + sexo);
            System.out.println("Leitura Atual: " + leituraAtual.getTitulo());
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public void setSexo(char sexo){
            this.sexo = sexo;
        }
        public String getNome(){
            return  this.nome;
        }
        public int getIdade(){
            return  this.idade;
        }
        public char getSexo(){
            return this.sexo;
        }
}
