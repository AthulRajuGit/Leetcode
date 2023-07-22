package String;
class solution1 {
    public String defangIPaddr(String address) {
       String str= address.replaceAll("\\.","[.]");
       return str;
    }
}