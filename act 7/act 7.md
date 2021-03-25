# act 7

## abstract

### 추상 클래스(abstract class)

클래스를 설계도에 비유한다면, 추상클래스는 **미완성 설계도**라고 할 수 있다. 미완성 메소드(추상메소드)를 포함하고 있다는 의미이다.

추상메소드를 포함하고 있다는 것 외에는 일반 클래스와 전혀 다르지 않다.

추상클래스는 그 자체로는 클래스 역할을 다 하지 못하지만, 새로운 클래스를 작성하는 데 있어 바탕이 되는 조상 클래스로서의 중요한 역할을 한다.

### 추상 메소드(abstract method)

메소드는 선언부와 구현부로 구성되어 있다.

추상 메소드란 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨 둔 것이 추상메소드이다.(실제 내용은 상속받는 클래스에서 구현하도록 비워둔 것)

추상메소드 역시 키워드 ```abstract```를 앞에 붙여주고, 구현부가 위치할 ```{}```대신 마침을 의미하는 ```;```을 작성한다.
> 만일 조상으로부터 상속받은 추상메소드 중 하나라도 구현하지 않았다면 추상클래스로 지정해주어야 한다.

### 추상클래스를 사용하는 이유

자손 클래스에서 추상메소드를 반드시 구현하도록 강요하기 위해서이다.

상속받는 자손클래스에서는 메소드들이 완전히 구현된 것으로 인식하고 오버라이딩을 하지 않을 수 있기 때문이다.

```java
abstract class Animal {
    int age;

    abstract void move(int x, int y);

    abstract void speak();

    void stop() {

    }
}
```

Animal이라는 추상클래스를 정의하고, 추상메소드 2개를 정의했다.

```java
class Person extends Animal {
    void move(int x, int y) {
        // move on foot 2
    }

    void speak() {
        // speak lang.
    }
}
```

```java
class Dog extends Animal {
    void move(int x, int y) {
        // move on foot 4
    }

    void speak() {
        // bark.
    }
}
```

```java
abstract class Cat extends Animal {
    void move(int x, int y) {
        // move on foot 4
    }
}
```

Cat class에서는 speak() 메소드를 구현하지 않았으므로, abstract 키워드를 붙여줘야 한다.
<br>
<br>

- 사실 순서상 메소드의 추상화가 먼저다.

추상화된 메소드를 설정하기 위해서는 그 메소드를 담고 있는 클래스는 abstract 해줘야 한다.

하나라도 추상 메소드를 포함해야 한다면 클래스는 추상 클래스이어야 한다.
물론 이 의미에서 추상 클래스는 추상 메소드가 아닌 메소드를 포함할 수 있다.


- 맥락에 따라서 달라질 수 있는 기능들이 있을 때, 추상 메소드로 만든다.

추상 클래스로 정의한 다음, 달라질 가능성이 없는 부분에 대해서는 일반 메소드로 작성하고 달라질 가능성이 있는 메소드에 대해서 추상 메소드로 정의해준다.

이렇게 되면 사용자의 입장에서 추상메소드에 대한 부분을 직접 정의하여 상황에 맞게 클래스를 사용할 수 있다.

그리고 이 또한 코드의 중복을 막기 위한 일환이라고 볼 수 있다.

## 인터페이스

### 인터페이스의 개념, 역할
- 동일한 목적 하에 동일한 기능을 수행하게끔 강제하는 것
- 자바의 다형성을 극대화하여 개발 코드 수정을 줄이고 프로그램 유지보수성을 높이기 위해 사용

### 인터페이스 문법과 다형성 이해
인터페이스는 ```interface```키워드를 통해 선언할 수 있으며 ```implements```키워드를 통해 일반 클래스에서 인터페이스를 구현할 수 있다.

java8 이전까지는 상수와 추상메소드만 선언이 가능했지만 java8부터는 디폴트 메소드, 정적 메소드도 선언할 수 있다.

```java
public interface Interface {
    // constance
    static final datatype constance = value;
    
    // abstract method
    datatype methodName(parameter){
        
    } 
    
    // default method
    default datatype methodName(parameter){
        
    }
    
    // static method
    static datatype methodName(parameter){
        
    }
}
```

- 상수: 인터페이스에서 값을 정해줄 테니 함부로 바꾸지 말고 제공해주는 값만 참조해라(절대적)
- 추상메소드: 가이드만 줄 테니 추상 메소드를 오버라이딩해서 재구현해라(강제적)
- 디폴트메소드: 인터페이스에서 기본적으로 제공해주지만, 맘에 안 들면 각자 구현해서 써라.(선택적)
- 정적메소드: 인터페이스에서 제공해주는 것으로 무조건 사용(절대적)

절대적이란 아무것도 손댈 수 없음을 의미한다. 강제적이란 인터페이스를 implements하지 않으면 피할 수 있음을 나타낸다.

- 예시
```java

```







# todo

- 추상 메소드
- 추상 클래스
- 인터페이스
- 추상 클래스와 인터페이스 비교
- 예제 5-7
- 추가 1, 2

# Reference
- [Velog. java 7. 추상클래스와 추상메소드](https://asfirstalways.tistory.com/165)
- [티스토리. java 자바 인터페이스란? 이 글 하나로 박살내자](https://limkydev.tistory.com/197)