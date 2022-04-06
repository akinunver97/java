public class Main {

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(100);
        simpleCalculator.setSecondNumber(50);

        simpleCalculator.getFirstNumber();
        simpleCalculator.getSecondNumber();
        double addition = simpleCalculator.getAdditionResult();
        double division =simpleCalculator.getDivisionResult();
        double multiplication = simpleCalculator.getMultiplicationResult();
        double substraction = simpleCalculator.getSubtractionResult();

        System.out.println("Addition: "+addition);
        System.out.println("Substraction: "+substraction);
        System.out.println("Multiplication: "+multiplication);
        System.out.println("Division: "+division);

    }
}
