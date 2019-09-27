public class IndividuellBok extends Bok {


        protected boolean utlånad;
        protected int antalUtlån;

        public IndividuellBok(String författare, String titel, int antalsidor, String genre, String isbn){
            this.författare = författare;
            this.titel = titel;
            this.antalSidor = antalsidor;
            this.genre = genre;
            this.ISBN = isbn;
            this.utlånad = false;
        }

        @Override
        public String toString() {
            return "\nFörfattare: " + this.författare + "\nTitel: " + this.titel + "\nAntal sidor: " + this.antalSidor + "\nGenre: "
                    + this.genre + "\nISBN: " + this.ISBN;



        }
    }

