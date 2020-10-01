package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Scanner;


public class solution {
	    public String solution(String new_id) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("가입하려는 아이디를 입력해주세요.");    
	    new_id=s.nextLine();
	    
	    
	    if(new_id.equals(new_id.toUpperCase())){//뉴아이디 대문자면
	        System.out.println(new_id.toLowerCase());//소문자 변환
	    }
		return new_id;
	    }

	        String answer = "";
	        return answer;
	    }
	
}
