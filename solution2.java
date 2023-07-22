package String;

public class solution2 {
	
	    public String restoreString(String s, int[] indices) {
	        char[] c=s.toCharArray();
	        for(int i=0;i<c.length;i++){
	            while(i!=indices[i]){
	                swapchar(c,i,indices[i]);
	                swapint(indices,i,indices[i]);
	            }
	        }
	        return String.valueOf(c);
	    }

	    public static void swapint(int[] indices,int x,int y){
	        int temp=indices[x];
	        indices[x]=indices[y];
	        indices[y]=temp;
	    }
	    public static void swapchar(char[] c,int x,int y){
	        char temp=c[x];
	        c[x]=c[y];
	        c[y]=temp;
	    }

	}

