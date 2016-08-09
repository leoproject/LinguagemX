package sintaxeAbstrata;

import java.util.List;

public class ComandoChamada extends Comando {
	public String id;
	public List<Exp> expLst;
	
	public ComandoChamada(String id, List<Exp> expLst){
		this.id = id;
		this.expLst = expLst;
	}
	public Object accept(XVisitor visitor) {
		return visitor.visitComandoChamada(this);
	}
}