package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost(); // 로컬컴퓨터의 InetAddress 객체 리턴
            System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress()); // local 변수의 IP주소 출력

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com"); // 도메인 이름으로 등록된 InetAddress 객체 리턴
            for (InetAddress remote : iaArr) { // 배열에 등록된 객체들의 IP주소 리턴하기
                System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
