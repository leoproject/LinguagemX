package sintaxeAbstrata;

public class ParBaseRef extends Parametro {
	public ParBaseRef(Tipo tipo, String id) {
		super(tipo, id);
	}
	
	public Object accept(XVisitor visitor) {
		return visitor.visitParBaseRef(this);
	}
}