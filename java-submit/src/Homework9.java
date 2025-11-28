import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class Homework9 {
    public static void main(String[] args) {

        Scanner sc = null;
        HashMap<String, String> map = new HashMap<>();

        try {
            sc = new Scanner(new FileInputStream("db.txt"));

            while (sc.hasNext()) {
                String id = sc.next().trim();
                if (!sc.hasNext()) break;
                String pw = sc.next().trim();
                map.put(id, pw);
            }

        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;

        } finally {
            if (sc != null) sc.close();
        }

        Scanner in = new Scanner(System.in);

        System.out.println("id와 password를 입력해주세요.");
        System.out.print("id : ");
        String inputId = in.nextLine().trim();

        if (!map.containsKey(inputId)) {
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            in.close();
            return;
        }

        System.out.print("password : ");
        String inputPw = in.nextLine().trim();

        if (map.get(inputId).equals(inputPw)) {
            System.out.println("id와 비밀번호가 일치합니다.");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
        }

        in.close();
    }
}
