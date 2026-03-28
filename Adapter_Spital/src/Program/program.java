package Program;

import Farmacie.IMedicamentFarmacie;
import Farmacie.MedicamentFarmacie;
import Spital.MedicamentSpital;

public class program {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        IMedicamentFarmacie medicamentFarmacie =
                new MedicamentFarmacie(medicamentSpital);

        medicamentFarmacie.cumparaMedicament();
    }
}
