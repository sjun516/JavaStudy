package chap_02;
// 키가 115cm 이므로 탑승 불가능합니다
// 키가 121cm 이므로 탑승 가능합니다

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        String str = (height >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " + str + "합니다");
    }
}

//public class _Quiz_02 {
//    public static void main(String[] args) {
//        int height = 121;
//        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
//        System.out.println("키가 " + height + "cm 이므로 " + result);
//    }
//}
