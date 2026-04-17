package DP.Structurale.Composite.ex2;

public abstract class ANode {

	public abstract float getGreutate() ;
	public abstract boolean esteFragil();
	

	public abstract void adauga(ANode copil);
	public abstract void sterge(ANode copil);
	public abstract ANode getCopil(int index);
	
	
}
