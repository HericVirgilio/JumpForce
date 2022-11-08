package JumpForce;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade,double altura,double peso,int vitorias,
    int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public void apresentar(){
        System.out.println("O lutador " + nome + " vindo da " + nacionalidade);
        System.out.println("com " + idade + " anos de idade, com " + altura + " metros e pesando " + peso + " kg");
        System.out.println("Vai concorrer  na categoria " + categoria + " com " + vitorias + " vitorias e com apenas " +
                "" + derrotas + " derrotas e " + empates + " empates");
        System.out.println("O incrivel " + nome + " ira subir ao podium esta noite");

    }
    public  void status(){
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso " +  peso + " kg");
        System.out.println("Categoria: " + categoria);
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
    }
    public void ganharLuta(){
        vitorias += 1;
    }
    public void perderLuta(){
        derrotas += 1;
    }
    public void empatarLuta(){
        empates += 1;
    }
    // SET
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
        this.setCategoria();
    }
    public void setCategoria(){
        if(peso < 52.2){
            this.categoria = "Peso Pena";
        } else if (peso <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (peso <= 83.3) {
            this.categoria = "Peso Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Peso Pesado";
        }else {
            this.categoria = "Big Mom";
        }
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    // GET
    public String getNome(){
        return nome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public int getIdade(){
        return  idade;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return  peso;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getVitorias(){
        return  vitorias;
    }
    public int getDerrotas(){
        return  derrotas;
    }
    public int getEmpates(){
        return empates;
    }
}
