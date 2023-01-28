import ru.netology.javaqa.Java6.SQRService;

public class main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int slideStart = 200;
        int slideEnd = 300;
        int count = service.calcSQR(slideStart, slideEnd);
        System.out.println("Количество квадратов в диапазоне от " + slideStart + " до " + slideEnd + " равно: " + count);
    }
}
