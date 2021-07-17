# Generic

## What is generic
jdk 1.5에 도입

> Generics add stability to your code by making more of your bugs detectable at compile time
> 제네릭은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다.
> 제네릭은 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능이다.

## problems without generics
ArrayList를 예로 들어 설명하자면 이렇다.

- ArrayList를 흉내내어 매개변수로 Object 타입을 받는 List를 구현했다고 하자.
- 컴파일 시 문제가 없다.
- 대부분의 기능들이 정상적으로 작동한다.
- 하지만 런타임에 잘못된 타입 캐스팅이 일어난 다는 등의 잠재적인 문제가 드러나게 된다.

> 컴파일 시점에서는 어떤 오류도 발생하지 않는다는 것이 문제다.

제네릭을 사용하지 않는 경우 어떤 타입으로 형변환할 수 있는지 조차 모호한 경우도 많기 때문에 잠재적인 오류를 가지고 있는 안 좋은 방식이다.

이를 <T>를 통해 리스트를 만들고, 이 객체를 생성할 때 제네릭을 통해 타입을 지정하면 생성되는 객체 안에서는 T의 위치에 지정한 타입이 대체 되어 들어가는 것처럼 컴파일러가 인식한다.

제네릭을 사용함으로써 중요한 점은 아래와 같다.
- 형변환이 필요 없다.
- 지정한 타입과 다른 타입의 참조변수를 선언하면 컴파일 타임에 에러가 발생한다.

## bounded type parameter(한정적 타입 매개변수)
제네릭으로 사용될 타입 파라미터의 범위를 제한할 수 있는 방법도 있다.

GenericArrayList 라는 클래스가 Number의 서브 클래스만 타입으로 가지도록 하고 싶은 경우 아래와 같이 제네릭의 타입을 제한할 수 있다.
```java
public class GeneriArrayList<T extends Numebr>
```
위와 같이 정의했다면 GenericArrayList에는 String을 담을 수 없다.

Number의 상위 클래스만 타입으로 가지도록 하고 싶은 경우에는 적절한 예시는 아니지만 아래와 같이 제네릭의 타입을 제한할 수 있다.
```java
public class GenericArrayList<T super Number>
```
bounded type parameter가 사용되는 가장 흔한 예시는 Comparable을 적용하느 경우다. T extends Comparable<T> 와 같이 정의하면 Comparable 인터페이스의 서브클래스들만 타입으로 사용하겠다는 것이다. Comparable 인터페이스를 구현하기 위해서는 compareTo() 메소드를 반드시 정의해야 하기 때문에 Comparable 인터페이스를 구현한 클래스들은 비교가 가능한 타입이 된다.

비교하는 로직이  들어간 클래스에는 비교가 가능한 타입들을 다루는 것이 맞을 것이다. 이를 강제하도록 할 수 있는 것이 bounded type parameter다.





# Reference
- [자바 제네릭 이해하기 part 1. github.io](https://yaboong.github.io/java/2019/01/19/java-generics-1/)