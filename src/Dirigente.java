public class Dirigente extends Dipendente {
    private int ferrariNelGarage;

    public Dirigente(String matricola, Dipartimento dipartimento, int ferrariNelGarage) {
        super(matricola, dipartimento);
        this.ferrariNelGarage = ferrariNelGarage;
        this.stipendio = calculateSalary();
    }

    public int getFerrariNelGarage() {
        return ferrariNelGarage;
    }

    public void setFerrariNelGarage(int ferrariNelGarage) {
        this.ferrariNelGarage = ferrariNelGarage;
    }

    public double calculateSalary() {
        return 1000000.00 - (ferrariNelGarage * 2000);
    }
}
