package String;
class solution3 {
    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations,0,operations.length).mapToInt(operation->operation.charAt(1)=='+'?1:-1).sum();
    }
}