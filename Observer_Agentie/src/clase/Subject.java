package clase;

import clienti.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
}
