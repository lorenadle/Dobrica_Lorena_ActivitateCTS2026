package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {
    List<Optiune> lista;
    String nume;

    public Categorie(String nume) {
        lista = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {

    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {

    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + nume);
        for (Optiune optiune : lista) {
            optiune.descriere();

        }
    }
}
