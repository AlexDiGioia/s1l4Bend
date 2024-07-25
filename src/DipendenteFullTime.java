public class DipendenteFullTime extends Dipendente {

    private int lvStipendio;

    public DipendenteFullTime(String matricola, Dipartimento dipartimento, int lvStipendio) {
        super(matricola, dipartimento);
        this.lvStipendio = lvStipendio;
        this.stipendio = calculateSalary();

    }

    public int getLvStipendio() {
        return lvStipendio;
    }

    public void setLvStipendio(int lvStipendio) {
        this.lvStipendio = lvStipendio;
    }

    public double calculateSalary() {
        return 1500 + (100 * this.lvStipendio);
    }
}
