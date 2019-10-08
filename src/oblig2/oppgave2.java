package oblig2;

import static javax.swing.JOptionPane.*;

class Tallspill
{
    public int tall;
    public String melding;
    public int antall;
    public int gjetning;


    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        int rand = (int) (Math.random() * 201);
        return rand;
    }

    public int visMelding(){
        // Viser parameterens innhold i en meldingsboks.
        int ut = Integer.parseInt(showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n" + "Prøv å gjette tallet:"));
        return ut;
    }

    public int forLite(int tall){
       /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
       if (visMelding() <= nyttTall()) {
            String melding = ""
       }
       return 1;
    }


    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
    }


}

public class oppgave2 {
    public static void main (String [] args) {
        Tallspill nyTall = new Tallspill();
        int ut = nyTall.visMelding()
        int test = + nyTall.forLite(1);
        showMessageDialog(null,test);
    }
}
