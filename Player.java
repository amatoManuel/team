package Es;

public class Player extends Person{
    public int shirtNumber;
    public String role;

    public Player(String name, String surname, int shirtNumber, String role) {
        super(name, surname);
        this.shirtNumber = shirtNumber;
        this.role = role;
    }



    @Override
    public String toString() {
        return "Giocatore{" +
                "Nome=" + getName() +
                ", Cognome=" + getSurname() +
                ", Numero di maglia=" + shirtNumber +
                ", Ruolo='" + role + '\'' +
                '}';
    }
}
