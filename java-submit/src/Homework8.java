import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {

        StoredId storedId = new StoredId();
        Scanner scanner = new Scanner(System.in);
        System.out.println("id와 password를 입력해주세요.");
        System.out.print("id: ");
        String id = scanner.nextLine().trim();

        if (storedId.lo.containsKey(id)) {
            System.out.print("password: ");
            String pw = scanner.nextLine().trim();
            if (storedId.lo.get(id).equals(pw)) {
                System.out.println("id와 비밀번호가 일치합니다.");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        } else {
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
        }
    }
}

class StoredId {

    Map<String, String> lo = new HashMap<String, String>();

    StoredId() {
        lo.put("myId", "myPass");
        lo.put("myId2", "myPass2");
        lo.put("myId3", "myPass3");
    }
}

