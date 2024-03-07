package ch07.lecture.p2polymorphism;

public class C02Polymorphism {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        cat.breathe();

        C02Animal animal = cat;
        animal.breathe(); // cat 인스턴스 메소드 실행됨
    }
}

class C02Animal {
    public void breathe() {
        System.out.println("호흡합니다");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("폐로 호흡합니다.");
    }
}
