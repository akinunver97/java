public class Id1 {
    public static void main(String[] args) {
        //	Multiples of 3 or 5

        int total = 0;

        for(int i = 1; i<1000; i++){
            if((i%3==0) || (i%5==0)) {
                total+=i;
            }
        }

        System.out.println(total);
    }
}
