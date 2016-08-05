package AbstractSyntaxTree;


public class BinExp extends Exp {
	public Exp esqExp, dirExp;
	public BinOp op;
	
	public BinExp(BinOp op, Exp esq, Exp dir) {
		this.esqExp  = esq;
		this.dirExp  = dir;
		this.op      = op;
	}
}
