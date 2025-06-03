import java.util.Scanner;
//	Count the Number of Paragraphs
public class CountParagraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String para = sc.nextLine();
        System.out.println(countPara(para));
        sc.close();

    }

    static int countPara(String para) {
        int count = 0;
        boolean flag = false;
        String[] arr = para.split("\n");
        for (String line : arr) {
            if (!line.trim().isEmpty()) {
                if (!flag) {
                    count++;
                    flag = true;
                }
            } else {
                flag = false;
            }
        }
        return count;

    }
}
