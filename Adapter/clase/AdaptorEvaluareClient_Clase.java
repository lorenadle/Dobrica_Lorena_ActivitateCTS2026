package DP.Structurale.Adapter.clase;

import DP.Structurale.Adapter.RestaurantA.EvaluareClientFirmaA;
import DP.Structurale.Adapter.RestaurantB.Client;
import DP.Structurale.Adapter.RestaurantB.IEvaluareClientFirmaB;


public class AdaptorEvaluareClient_Clase extends EvaluareClientFirmaA implements IEvaluareClientFirmaB {
	private int costTotalEvenimente(Client client){
		System.out.println("Transformare input din client in float(total)");
		int costTotalEvenimente = 0;
		for(int i=0; i<client.getNrEvenimente(); i++)
			costTotalEvenimente += client.getCostEvenimente()[i];
		return costTotalEvenimente;
	}

	@Override
	public void analizaClientFirmaB(Client client) {
		System.out.println("Pare ca ar face B-ul analiza clientului dar...");
		this.analizaClientFirmaA(costTotalEvenimente(client));
	}
}
