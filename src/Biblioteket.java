import java.util.LinkedList;
import java.util.List;

public class Biblioteket extends Låna {
    protected List<Bok> bibliotektsLista = new LinkedList<>();
    List<Bok> lånadeBöcker=new LinkedList<>();
    public void addBok(Bok bok){
        bibliotektsLista.add(bok);
    }

    public void visaBok(){
        System.out.println("-------------------------");
        System.out.println(bibliotektsLista);
        System.out.println("-------------------------");
    }
    public void lånaBok(Låna namn, IndividuellBok bok){

        if(!bok.utlånad){

            lånadeBöcker.add(bok);
            namn.lånaLista.add(bok);
            bok.utlånad = true;
            System.out.println(namn + " utlånad "+ bok +".");

        }
        else
            System.out.println(bok + " är utlånad.");

    }
}
