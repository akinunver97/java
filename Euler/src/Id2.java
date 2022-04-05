public class Id2 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z;
        int total = 0;

        while(x<=4000000){
            z = x+y;
            x = y;
            y = z;
            if(x%2==0){
                total +=x;
            }

        }

        System.out.println(total);

    }
}
