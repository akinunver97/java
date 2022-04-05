public class Id3 {

    public static void main(String[] args) {

        long number = 600851475143L;
        long counter = 2L;
        while (counter*counter<number){
            while (number%counter==0){
                number/=counter;
            }
            counter++;
        }
        System.out.println(number);

    }
}
