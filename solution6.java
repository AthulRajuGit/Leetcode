package String;
class solution6 {
    public int mostWordsFound(String[] sentences) {
       int max=0;
       for(String curr:sentences){
           int currLen=curr.split(" ").length;
           if(max<currLen)
              max=currLen;
       }
       return max;
    }
}