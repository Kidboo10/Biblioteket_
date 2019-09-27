import java.util.List;

public class MainBibliotek {
    public static void main(String[] args) {
        Biblioteket biblioteket = new Biblioteket();
        IndividuellBok b1 = new IndividuellBok("Jan skog","Java steg för steg",550,"Kurslitaratur","99-999999-9");
        IndividuellBok b2 = new IndividuellBok("gustav balkan","Jugge skoj",420,"humor","12-3242424-4");
        IndividuellBok b3 = new IndividuellBok("Dr Minister","Jockes ansikte",666,"skräck","12-45345345-7");
        biblioteket.addBok(b1);
        biblioteket.addBok(b2);
        biblioteket.addBok(b3);
        System.out.println(biblioteket.bibliotektsLista);
        Låna atef = new Låna("atef","ååmmdd-nnnn");
        Låna eli = new Låna("eli","ååmmdd-nnnn");
        Låna jocke = new Låna("jocke","ååmmdd-nnnn");
        biblioteket.lånaBok(atef,b3);
        biblioteket.lånaBok(eli,b2);
        biblioteket.lånaBok(jocke,b2);
        System.out.println(biblioteket.bibliotektsLista);
        System.out.println(biblioteket.lånadeBöcker);
    }

}
