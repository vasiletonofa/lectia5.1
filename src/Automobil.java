public class Automobil {

   private Integer anProducere; // null

   public Automobil(int anProducere) {
        if (anProducere > 1920) { // 1950
            this.anProducere = anProducere;
        } else {
            System.out.println("Valoarea nu a fost setata");
        }
    }

    public void setAnProducere(int anProducere) { // 1900
        if (anProducere > 1920) {
            this.anProducere = anProducere;
        }
    }

    public Integer getAnProducere() {
       return anProducere;
    }

    public void execute() {
       if (2 == 2) {
           System.out.println("1");

           if( 3 < 5) {
               System.out.println("2");
           }
       }
    }

}
