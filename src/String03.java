public class String03 {
    public static void main(String[] args) {
        String me = "살은 내가 쩌요.";
        String repiaced = me.replaceAll("내가", "네가");
        System.out.println(repiaced);
    }
}
