public class DipendentePartTime extends Dipendente {

    private int oreLavoro;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, int oreLavoro) {
        super(matricola, dipartimento);
        this.oreLavoro = oreLavoro;
        this.stipendio = calculateSalary();

    }

    public int getOreLavoro() {
        return oreLavoro;
    }

    public void setOreLavoro(int oreLavoro) {
        this.oreLavoro = oreLavoro;
    }

    public double calculateSalary() {
        return 11 * this.oreLavoro;
    }
}
