public class SwapWithoutTemp {
    public static void main(String[] args){
        int first = 5;
        int second = 3;

        System.out.println("first = " + first);
        System.out.println("second " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("first " + first);
        System.out.println("second " + second);
    }
    
}
