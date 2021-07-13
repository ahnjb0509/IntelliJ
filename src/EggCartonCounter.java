import java.util.Scanner;

public class EggCartonCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("총 달걀의 수를 입력하세요 ");

        int eggCartonSize = 30;
        int totalEggs = 0;
        int egg = 30;
        String input = scanner.nextLine();

        try {
            totalEggs  = Integer.parseInt(input);

            if (totalEggs < 30){
                System.out.println("계란판이 필요하지 않습니다.");
            }else{
                int totalEggCartons = totalEggs / eggCartonSize;
                System.out.println("총" + totalEggCartons + "개의 계란판이 필요합니다.");

                int ahn = totalEggs - 30;

            if (ahn < egg){
                System.out.println("그리고 " + ahn + "개 남았습니다.");
            }

            }
        }catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
