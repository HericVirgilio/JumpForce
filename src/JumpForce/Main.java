package JumpForce;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Monkey D. Luffy","Brasil", 19,1.74,89.00,7,
                4,0);
        l[1] = new Lutador("Roronoa Zoro","Japones",21,1.81,95.00,5,2,
                0);
        l[2] = new Lutador("Trafalgar D. Water Law","North Blue",25,1.91, 99.00,
                2,1,0);
        l[3] = new Lutador("Donquixote Doflamingo", "Mary Geoise",41,3.05,100.00,
                2,1,0);
        l[4] = new Lutador("Sakazuki Akainu", "Continente Pequeno", 55,3.06,100.00
        ,3,0,0);
        l[5] = new Lutador("Dracule Mihawk", "Ilha Kuraigana",43,1.98,99.00,
                3,0,10);
        Luta marineford = new Luta();

        marineford.marcarLuta(l[3] , l[2]);

        marineford.lutar();

        l[2].status();
        l[3].status();

    }
}
