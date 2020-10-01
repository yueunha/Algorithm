

public class BinarySearchTree {
	 public DNode root;
	 
	
     public BinarySearchTree() {
    	 this.root=null;
     }
     
     public void insert(int data) {
    	 if(isEmpty()) {
    		 DNode node=new DNode();
    		 node.value=data;
    		 root=node;
    	 }else {
    	    insert(data,root);//재귀함수 사용//
    	
    	 }    		
     }
     
     public void insert(int data,DNode node) {
    	 if(data<node.value) {
    		 if(node.leftlink==null) {
    		 DNode newNode=new DNode();
    		 newNode.value=data;
    		 node.leftlink=newNode;
    		 }else {
    			 insert(data,node.leftlink);
    		 }
    		 
    	 }else if(data>node.value){
    		 if(node.rightlink==null) {
    		 DNode newNode=new DNode();
    		 newNode.value=data;
    		 node.rightlink=newNode;
    		 }else {
    			 insert(data,node.rightlink);
    		 }
    	 }else
    		 System.out.println("이미 데이터가 있습니다.");
    	   
     }
     
     public void delete(int data){
    	 if(root!=null) {
    	 root=delete(root,data);//재귀함수 사용//
     }else
    	 System.out.println("트리에 데이터가 없습니다.");
     }
     
     public DNode delete(DNode node,int data) {
    	 if(data<node.value) {
    		 node.leftlink=delete(node.leftlink,data);	 
    	 }else if(data>node.value) {
    		 node.rightlink=delete(node.rightlink,data);
    	 }else {
    		 if(node.leftlink==null && node.rightlink ==null) { //자식 하나도 없는 경우//
    			return null;
    		 }else if(node.leftlink!= null &&node.rightlink ==null){      //자식 하나만 있는 경우(왼쪽에만 있음)//
    			 DNode tempNode=node.leftlink;
    			 node=null;            // 삭제하려는 원소 삭제//
    			 return tempNode;      //삭제하려는 원소 왼쪽에 있던 노드 왼쪽링크 연결시켜줌.//
    		 }else if(node.leftlink == null &&node.rightlink !=null) {     //자식 하나만 있는 경우(오른쪽에만 있음)//
    			 DNode tempNode=node.rightlink;
    			 node =null;          //삭제하려는 원소 삭제//
    			 return tempNode;      //삭제하려는 원소 오른쪽에 있던 노드 오른쪽링크 연결시켜줌.//
    		 }else if(node.leftlink != null &&node.rightlink !=null) {     //자식 둘 다 있는 경우
    		         int min= findmin(node.rightlink); //최소값 찾아함.//-> 왜 최소값구하냐?
    		         node.rightlink= delete(node.rightlink,min);
    		         
    		 }
    		 
    	 }
    	 return node;
     }
     
     
     public void inOrder(DNode node) {
    	 if(node!=null) {
    		 inOrder(node.leftlink);
    		 System.out.print(node.value+"=>");
    		 inOrder(node.rightlink);
    	 }
    	 
     }
     
     public boolean isEmpty() {
    	 return root==null;
     }
     
     public int findmin(DNode node) {
    	 if(node.leftlink==null) {
    		 return  node.value;
    	 }else {
    		 return findmin(node.leftlink);
    	 }
     }
     public int findmax(DNode node) {
    	 if(node.rightlink==null) {
    		 return  node.value;
    	 }else {
    		 return findmin(node.rightlink);
    	 }
     }
}
