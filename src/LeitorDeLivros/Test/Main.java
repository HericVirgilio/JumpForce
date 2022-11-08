package LeitorDeLivros.Test;

import LeitorDeLivros.Domain.Pessoa;
import LeitorDeLivros.Domain.Livro;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Robin",30,'F',l[0]);
        p[1] = new Pessoa("Jay Jo" , 17,'M',l[1]);

        l[0] = new Livro("Arqueologia do North Blue", "Jaguar D. Saul",320,p[0]);
        l[1] = new Livro("Como pedir desculpas a uma garota","Scott Shelly",125,p[1]);
        l[2] = new Livro("kaizoku ou ni ore wa naru" , "Nico Robin",1125,p[0]);

        p[0] = new Pessoa("Robin",30,'F',l[2]);
        p[1] = new Pessoa("Jay Jo" , 17,'M',l[1]);

        l[0].abrir();
        l[0].folhear(255);
        l[0].avançarPag();

        l[0].detalhes();
        l[1].detalhes();
        l[2].detalhes();

        p[0].status();
        p[1].status();
    }
}
