package LeitorDeLivros.Domain;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor,int totPaginas,Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto  = false;
        this.leitor = leitor;
    }
    public void detalhes(){
        System.out.println("================ DETALHES ================");
        System.out.println("Livro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de paginas: " + totPaginas);
        System.out.println("Pagina Atual: " + pagAtual);
        System.out.println("Aberto: " + aberto);
        System.out.println("Leitor: " + leitor.getNome());
    }
    // SET
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    // GET
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return  this.autor;
    }
    public int getTotPaginas(int totPaginas){
        return  this.totPaginas;
    }
    public int getPagAtual(int pagAtual){
        return  this.pagAtual;
    }
    public boolean getAberto(){
        return this.aberto;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p <= totPaginas){
            this.setPagAtual(p);
        }else {
            this.setPagAtual(0);
        }

    }

    @Override
    public void avançarPag() {
        this.setPagAtual(pagAtual + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(pagAtual - 1);
    }
}
