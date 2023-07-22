package String;
class solution4 {
    public int numJewelsInStones(String jewels, String stones) {
      Set set=new HashSet<>();
      int res=0;

      for(char i:jewels.toCharArray())
           set.add(i);
      for(char s:stones.toCharArray())
          if(set.contains(s)) res++;
      return res;          
    }
}