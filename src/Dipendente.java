public abstract class Dipendente implements Controllo {
    protected String matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    public void checkIn() {
        System.out.println("Il dipendente ha iniziato il suo servizio alle 10.30 ");
    }
}
