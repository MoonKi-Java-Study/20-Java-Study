# act.11

## 01 이벤트 관련 용어

### (1) 이벤트 소스 

이벤트를 발생시킨 GUI `컴포넌트`

### (2) 이벤트 객체

**발생한 이벤트에 대한 정보**

> 예) 이벤트 종류, 이벤트 소스, 화면 좌표, 마우스 버튼 종류, 눌러진 키

- 이벤트 발생 시에 해당 이벤트에 관한 정보를 가진 객체

- 이벤트 리스너에게 이 정보가 전달된다.

> 이벤트 리스너 코드에서 이벤트 발생 상황을 파악할 수 있게 한다.

- 이벤트 분배 스레드가 이벤트 객체를 생성한다.

 
#### 이벤트 객체가 포함하는 정보

- 이벤트 종류

- 이벤트 소스

- 이벤트가 발생한 화면 좌표

- 이벤트가 발생한 컴포넌트 내 좌표

- 마우스의 클릭 횟수

- 클릭된 마우스 버튼 번호

- 버튼이나 메뉴에서 클릭이 발생됐을 때 그 버튼이나 메뉴 아이템의 문자열

- 체크박스와 라디오 버튼 등과 같은 컴포넌트에서 발생한 이벤트라면 체크 상태

- 키가 눌러졌다면 키의 코드 값과 문자 값

 

#### 이벤트에 따라 약간 다른 정보 포함

- ActionEvent 객체 : 액션 문자열

- MouseEvent 객체 : 마우스의 위치 정보, 마우스 버튼, 함께 눌러진 키 정보 등

- ItemEvent 객체 : 아이템의 체크 상태(체크박스와 라디오버튼 관여)

 

#### 이벤트 소스 알아 내기

**Object EventObject.getSource()**

- 발생한 이벤트의 소스 컴포넌트 리턴

- Object 타입으로 리턴하므로 캐스팅하여 사용

- 모든 이벤트 객체에 대해 적용


#### 이벤트 객체와 이벤트 소스

![이벤트 객체와 이벤트 소스](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FpcRAl%2FbtqARxJTZTv%2FBW1ffUe2RyZ25Q2XENWKn1%2Fimg.png)

```
textfield에 입력하는 동안 keyevent가 발생하고 enter key 를 치면 action event 발생

체크 박스에 관한 모든 이벤트는 itemevent 가 처리.

```

### (3) 이벤트 리스너

**이벤트를 마지막으로 처리하는 코드로 컴포넌트에 등록되어야 작동 가능**

> 우리가 구현해야 할 부분..(e.g 계산 처리는 어떻게 할 것인지)

-실제로 이벤트를 처리하는 코드. 클래스로 작성한다.

-모든 메소드는 클래스 내에 구현

-jdk에서 리스너 작성을 위한 인터페이스를 제공한다.

> 개발자가 인터페이스를 상속 받아 추상 메소드를 구현하면 된다.


#### 이벤트 종류에 따른 이벤트 리스너와 추상 메소드

![이벤트 종류에 따른 이벤트 리스너와 추상 메소드](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcGruq2%2FbtqAThl0Mmg%2FiZr6tIGUgoogSjk8kRqJsk%2Fimg.png)


- 마우스 이벤트 처리를 위해 마우스 리스너를 구현 할 때는 리스너의 추상 메소드 5개를 모두 구현 해야 한다. 만약 딱히 하는 일이 없는 메소드가 있다면 empty body로 내부 구현을 안하면 된다.

> Ex) class MyActionListener implements ActionListener{}

- 리스너마다 클래스 만들어 줘야함

- 버튼 마다 add로 리스너 추가해주어야함.

> 예시

```Java

Class A implements ActionListener{

           public void actionPerformed(){//event가 발생하면 어떻게 처리해야할 지 재정의 해야함

           …

           }

JButton jb=new JButton;

jb.addActionListener(new A()); /버튼에 add로 리스너 추가

}

```

-컴포넌트는 다른 이벤트에 대한 리스너를 동시에 가질 수 있다.         

```
JButton.addActionListener(); // Action 리스너

JButton.addKeyListener(); // Key 리스너

JButton.addFocusListener(); // Focus 리스너

``` 

-컴포넌트는 한 이벤트에 대해 여러 개의 리스너를 동시에 가질 수 있다.

-하나하나 리스너 add 해줘야함

```Java
JButton.addActionListener(new MyButtonListener1());

JButton.addActionListener(new MyButtonListener2());

JButton.addActionListener(new MyButtonListener3());

```

> 이때, 리스너는 등록된 반대 순으로 모두 실행된다.(1→2→3 순으로 등록, 3→2à→ 순으로 실행.)



### (4) 이벤트 분배 스레드

- 동작 : 자바 가상 기계로부터 이벤트의 발생 정보를 받아와 이벤트 소스와 이벤트 종류를 결정하고, 적절한 이벤트 객체 생성한다. 그 후에 이벤트 리스너를 찾아 호출

- 무한 루프를 실행하는 스레드 : Frame 의 x버튼이 눌려질 때까지 이를 반복하며 x버튼이 눌리면 종료

