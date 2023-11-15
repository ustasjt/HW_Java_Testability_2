public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 91; // килограмм(ов)
        int height = 173; // сантиметра(ов)
        int index = service.calculate(weight, height);
        System.out.println(" bmi-индекс = " + index);

    }

}