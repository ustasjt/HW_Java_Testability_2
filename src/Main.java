public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75; // килограмм(ов)
        double height = 1.7; // метра(ов)
        int index = service.calculate(weight, height);
        System.out.println(" bmi-индекс = " + index);

    }

}