package ch06.lecture.p7access;

public class C01AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30;
        o1.name = "son"; // package private
//        o1.address = ""; // private
    }
}

// 하나의 파일에
// 하나의 public class만 작성 가능
//public class C01My {
//
//}

class C01My {

}

