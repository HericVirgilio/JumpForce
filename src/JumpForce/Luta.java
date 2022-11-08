package JumpForce;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() .equals(l2.getCategoria()) && l1 != l2){
                aprovado = true;
                desafiado = l1;
                desafiante = l2;
        }else {
            aprovado = false;
            desafiado = null;
            desafiante = null;
        }
    }
    public void lutar(){
            if(this.aprovado){
                System.out.println("============= Desafiante ==============");
                System.out.println(desafiante.getNome());
                System.out.println("============= Desafiado ===============");
                System.out.println(desafiado.getNome());
                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);
                switch (vencedor){
                    case 0:
                        System.out.println("A luta empatou");
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("O campeão foi " + desafiante.getNome() + " congratulations");
                        System.out.println("O perdedor foi " + desafiado.getNome() + " Volte para casa lhe falta odio");
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        break;
                    case 2:
                        System.out.println("O campeão foi " + desafiado.getNome() + " congratulations");
                        System.out.println("O perdedor foi " + desafiante.getNome() + " Volte para casa lhe falta odio");
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        break;
                }
            }else {
                System.out.println("A luta não foi aprvada por tanto n pode acontecer");
            }
    }
    // Set
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    // GET
    public Lutador getDesafiado(){
        return desafiado;
    }
    public Lutador getDesafiante(){
        return  desafiante;
    }
}
