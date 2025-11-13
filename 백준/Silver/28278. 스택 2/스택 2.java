import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack <Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(input);
        
        for(int i = 0; i<N; i++) {
        	input = br.readLine();
        	
        	switch(input.charAt(0)) {
        	case '1' :
        		String[] num = input.split(" "); 		
        		stack.push(Integer.parseInt(num[1]));
        		break;
        	case '2' :
        		if(stack.isEmpty())
        			System.out.println(-1);
        		else
        			System.out.println(stack.pop());
        		break;
        	case '3' :
        		System.out.println(stack.size());
        		break;
        	case '4' :
        		if(stack.isEmpty())
        			System.out.println(1);
        		else
        			System.out.println(0);
        		break;
        	case '5' :
        		if(stack.isEmpty())
        			System.out.println(-1);
        		else
        			System.out.println(stack.peek());
        		break;
        	}
        }
        
	}
}