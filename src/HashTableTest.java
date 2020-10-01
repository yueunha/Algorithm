import java.util.Hashtable;
public class HashTableTest {
 
	public static void main(String[] args) {
		
		Hashtable<String, String> ht= new Hashtable<String, String>();
		ht.put("이홍로","010-2344-4758");
		System.out.println(ht.get("이홍로"));
	}
}

