import java.util.Scanner;

public class input4 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner =new Scanner(System.in);
        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        System.out.println(intValue + 1);
    }
}
