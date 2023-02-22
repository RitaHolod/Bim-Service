public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();
        double weight = 54.8;
        double height = 172.5;
        double bim = service.calculate(weight,height);
        System.out.println("Ваш индекс массы тела: " +bim);
    }
}
