package AbstractSyntaxTree;

public class Cons extends DCons {
	public Exp cons;
	
	public Cons(Tipo tipo, String id, Exp cons) {
		super(tipo, id);
		this.cons = cons;
	}
}
