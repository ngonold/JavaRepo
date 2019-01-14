public class ForEach {
    public static void main (String[] args) {
        String [] strList = {"One", "Two", "Three","Four","Five"};
        int [] intList = {1,2,3,4,5};
        for (String idx : strList){
            System.out.println(idx);
        }
        //for each auto generated + import for each
        //Arrays.stream(intList).forEach(System.out::println);
        for (int idx : intList){
            System.out.println(idx);
        }
    }
}
