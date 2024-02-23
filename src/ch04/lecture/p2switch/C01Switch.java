package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {
        System.out.println("statement 1");

        String city = "제주";
        switch (city) {
            case "서울":
                System.out.println("statement 2");
                break;

            case "제주":
                System.out.println("statement 3");
                break;

            case "부산":
                System.out.println("statement 4");
                break;
        }


    }
}
