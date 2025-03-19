package a0314;

public class DistanceEx {
    public static void main(String[] args) {
        double rating = 8;
        String about = "어바웃타임";
        String toy = "토이스토리";
        String gozira = "고질라";
        if(rating <= 9){
            System.out.println(about + "을 추천합니다.");
        }else if(rating <= 8){
            System.out.println(about + toy + "을 추천합니다.");
        }else if(rating <= 7){
            System.out.println(about + toy + gozira +"을 추천합니다.");
        }
    }
}
// 틀림