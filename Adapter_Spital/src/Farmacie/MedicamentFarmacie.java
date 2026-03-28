package Farmacie;

import Spital.MedicamentSpital;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public MedicamentFarmacie(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}

