package sec01.exam01;

public class Bus extends Transport {
    int maxGuest = 30; //최대승객수
    int nowGuest;//현재 승객 수
    int charge = 1000; //요금
    int busNumber;
    String condition = "운행"; //운행 or 차고지 //상태

    public String race() {
        return condition; //운헹
    }

    //버스 상태 변경
    public int conditionChange(int oil) {
        int num =oiling - oil; //50
        System.out.println(num);
        if(num <oiling){
            condition = "차고지행";
        }
        return num; //주유량
    }
    //승객 탑승
    public void guestIn(int newGuest) {
        this.maxGuest = 30;
        //'최대 승객수' 이하 ,'운행' 상태
        if (nowGuest + newGuest < 30 && condition.equals("운행")) {
            nowGuest += newGuest; //탑승시 승객수 증가
            System.out.println("탑승 승객 ==" + newGuest);
            System.out.println("잔여 승객 수 ==" + (maxGuest - nowGuest));
            System.out.println("요금 확인 ==" + charge * newGuest);
        }
    }

    //속도 변경
    public void changeSpeed(int speed) {
        //주유량일 10보다 작으면 운행 ->차고지행
        if (oiling < 10) {
            if (this.condition == "운행") {
                this.condition = "차고지행";
            }
            System.out.print("주유 필요 ----" + oiling);
        }

    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();
        System.out.println(bus.race());
        bus.guestIn(2);
        bus.conditionChange(50);

    }
}
