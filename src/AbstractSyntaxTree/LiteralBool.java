package AbstractSyntaxTree;

public class LiteralBool extends Literal {
	public Boolean bool;
	
	public LiteralBool(String sBool) {
		this.bool = Boolean.parseBoolean(sBool); 
	}
	
	public LiteralBool(Boolean b) {
		this.bool = b; 
	}	
}
