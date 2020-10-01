

public class DNode {
 public DNode leftlink;
 public int value;
 public DNode rightlink;
 
 
 public DNode() {
	 this.leftlink=null;
	 this.value=0;
	 this.rightlink=null;
	 
 }


public DNode getLeftlink() {
	return leftlink;
}


public void setLeftlink(DNode leftlink) {
	this.leftlink = leftlink;
}


public int getValue() {
	return value;
}


public void setValue(int value) {
	this.value = value;
}


public DNode getRightlink() {
	return rightlink;
}


public void setRightlink(DNode rightlink) {
	this.rightlink = rightlink;
}


} 
