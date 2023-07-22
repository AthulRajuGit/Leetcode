package String;
class solution7 {
    public int balancedStringSplit(String s) {
        int r=0;
        int sum=0;
        for(char l:s.toCharArray()){
            if(l=='R') sum +=1;
            else sum -=1;
            if(sum==0) r++;
        }
        return r;

    }
}