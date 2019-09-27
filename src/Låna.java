import java.util.LinkedList;
import java.util.List;
public class Låna extends Person {
    protected List<Bok> lånaLista = new LinkedList<>();
    public Låna(){};

    public Låna(String namn, String personNr){
        this.namn = namn;
        this.personNr = personNr;
        lånaLista = new LinkedList<>();
    }

    @Override
    public String toString() {
        return ""+this.namn;
    }
}
