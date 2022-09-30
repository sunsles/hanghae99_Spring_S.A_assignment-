package sec01.exam01;

public class Taxi extends Transport{
    String destination;//목적지
    int basicDistance = 1 ; //기본거리
    int distance;//목적지 까지 거리
    int taxiNumber;
    int basicCharge = 3000; //기본요금
    int roadCharge = 1000; //거리당 요금
    int nowGuest;
    String condition="일반";//일반or 운행; //상태

    //운행 시작
    public void race() {
        if (oiling < 10) {
            System.out.println("주유를 해주세요 == 주유가 10보다 작습니다");
        } else {
            System.out.println("운행을 시작합니다");
        }
        System.out.println(oiling);
        System.out.println(condition);
    }
    //승객 탑승
    public void guestIn(int newGuest) {
        if(condition == condition) {
            System.out.println("가능합니다");
        }
        else{
            System.out.println("탑승 불가");
        }
        String conditions = "운행 중";
        if(newGuest >0 && newGuest <=maxGuest){
            System.out.println(conditions);
        }
        this.maxGuest = 4;
        //'최대 승객수' 이하 ,'운행' 상태
        if (nowGuest + newGuest < 4 && condition.equals("일반")) {
            System.out.println("탑승 승객 수 ==" + newGuest);
            System.out.println("잔여 승객 수 ==" + (maxGuest - nowGuest));
            System.out.println("기본 요금 확인 =="+ basicCharge);
            System.out.println("목적지 == " +destination);
            System.out.println("목적지 까지 거리 =="+distance);
            System.out.printf("지불할 요금 =="+basicCharge +(roadCharge*distance));
            System.out.println("상태 ==" + conditions);
        }
    }
    //속도 변경
    public void changeSpeed(int nowSpeed){
        System.out.println(speed + nowSpeed); //빼거나 더하기
    }
    //거리당 요금 추가
    public void chargePlus(int roadPlus){
        //기본거리:1 , 먼곳 :5이상 ,추가요금 :5000;
    }
    //요금 결제
    public void payment(){


    }


    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Taxi taxi1 =new Taxi();
        taxi.race();
        taxi.guestIn(2);
    }

}
