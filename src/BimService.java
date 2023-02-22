public class BimService {
    public double calculate (double weight, double height){
        int i = 2;
        double bim = weight / Math.pow(height, i) * 10000; // умножаем на 10000 потому что ответ выдается с квадратными метрами, а на вход получаем сантиметры

        return bim;
    }
}
