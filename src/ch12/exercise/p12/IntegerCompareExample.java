package ch12.exercise.p12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2); // true -128~127 사이의 경우 같은 객체를 공유하기때문에 true가 나옴
        System.out.println(obj3 == obj4); // false

        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
    }
}
