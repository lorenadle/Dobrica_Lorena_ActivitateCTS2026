package ro.ase.cts;


public class DecoratorCrown extends ADecoratorPizza{

	public DecoratorCrown(APizza pizza) {
		super(pizza);
	}


	@Override
	String getComponente() {
		return super.getComponente() + ", margine cu branza";
	}

	@Override
	int getPret() {

		return super.getPret() + 10;
	}

}
