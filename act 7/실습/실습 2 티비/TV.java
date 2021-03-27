public class TV implements Device {
    public void on() {
        System.out.println("켜졌습니다.");
    }

    public void off() {
        System.out.println("종료합니다.");
    }

    // 새로 구현한 메소드
    public void watch() {
        System.out.println("방송중입니다.");
    }

    public static void main(String[] args) {
        TV tv = new TV();

        tv.on();
        tv.watch();
        tv.off();
    }
}

interface Device {
    void on();

    void off();
}
