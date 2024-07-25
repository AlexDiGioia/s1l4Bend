public class Main {
    public static void main(String[] args) {

        DipendenteFullTime dipendenteFullTime1 = new DipendenteFullTime("FT123", Dipartimento.PRODUZIONE, 5);
        DipendenteFullTime dipendenteFullTime2 = new DipendenteFullTime("FT456", Dipartimento.AMMINISTRAZIONE, 3);

        DipendentePartTime dipendentePartTime1 = new DipendentePartTime("PT789", Dipartimento.VENDITE, 20);
        DipendentePartTime dipendentePartTime2 = new DipendentePartTime("PT012", Dipartimento.PRODUZIONE, 15);

        Dirigente dirigente1 = new Dirigente("DG001", Dipartimento.AMMINISTRAZIONE, 2);
        Dirigente dirigente2 = new Dirigente("DG002", Dipartimento.VENDITE, 1);

        Volontario volontario1 = new Volontario("Mario Rossi", 30, "CV di Mario");
        Volontario volontario2 = new Volontario("Anna Bianchi", 25, "CV di Anna");

        Controllo[] persone = new Controllo[8];
        persone[0] = dipendenteFullTime1;
        persone[1] = dipendenteFullTime2;
        persone[2] = dipendentePartTime1;
        persone[3] = dipendentePartTime2;
        persone[4] = dirigente1;
        persone[5] = dirigente2;
        persone[6] = volontario1;
        persone[7] = volontario2;


        for (Controllo persona : persone) {
            persona.checkIn();
        }
    }
}