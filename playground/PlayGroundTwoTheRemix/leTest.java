import java.util.ArrayList;

public class leTest {
    public static void main(String[] args) {
        ArrayList<Integer> teachers = new ArrayList<>();

        teachers.add(1);
        teachers.add(2);
        teachers.add(3);
        teachers.add(4);

        for (int index = 0; index < teachers.size(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}
