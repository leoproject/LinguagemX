package sintaxeAbstrata;

import java.util.List;

public class ConsExt extends DCons {
	public List<Exp> expList;
	
	public ConsExt(Tipo tipo, String id, List<Exp> expList) {
		super(tipo, id);
		this.expList = expList;
	}
	public Object accept(XVisitor visitor){
		return visitor.visitConsExt(this);
	}

}
