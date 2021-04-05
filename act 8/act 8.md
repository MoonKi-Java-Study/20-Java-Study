# act 8

## 자바 패키지
### 패키지 단순 정리
자바의 패키지(package)는 클래스(interface, enum, ...)의 묶음으로서 하나의 디렉토리(폴더)이다. 패키지의 이름과 같은 디렉토리 내에 클래스 파일들을 포함하며 하위 패키지도 포함하는 중첩된 구조도 가능하다. (C/C++에 비해 무척 단순한 편이다.)

퍼블릭 클래스(public interface, public enum)가 물리적으로 하나의 파일인 것과 유사하게 패키지는 물리적으로 하나의 디렉토리이다. 즉, 같은 폴더 내의 이러한 파일들이 패키지를 구성한다. 예를 들어서 java.lang.System 클래스는 java 패키지의 하위 패키지인 lang에 속한다. 따라서 물리적으로 java 디렉토리 밑의 alng 디렉토리 밑의 System.class 파일이다.

예를 들어 netnean에서 tut01 이라는 프로젝트를 생성하면 처음에 다음과 같은 구조를 가진다.

![tut01 프로젝트 생성](https://lh5.googleusercontent.com/YZ3TqdhepqBbpLO2Xv7XkxSHWYZfWOiQzPh28kkJRtgK2AmV3VPbd2BMggyIsV369ZDAhuhu44QJsFTavj8M5xNBr5zQeves3SuK8Rp0Fpk925-sbc02TUUTFRtIYDfZ667I9Io)

tut01이라는 프로젝트 폴더 밑에 src/tut01 폴더가 tut01 패키지가 된다. 그리고 그 안에 Tut01.java 파일이 자동으로 생성되며 맨 첫 줄에 패키지가 명시되어 있다.

클래스 파일의 (주석과 공백을 제외한) 맨 처음에는 소속 패키지를 선언하는 단일문이 위치해야 한다.

**하나의 프로젝트는 일반적으로 하나 이상의 패키지를 포함한다.**

### 패키지(정의, 장점)
패키지란 서로 관련이 있는 클래스 또는 인터페이스들을 묶어 놓은 묶음이다. 

패키지를 사용함으로써 클래스들이 필요할 때만 사용될 수 있도록 하고, 클래스를 패키지 이름과 함께 계층적인 형태로 사용함으로써 다른 그룹에 속한 클래스와 발생할 수 있는 클래스 이름 간의 충돌을 막아줌으로 클래스의 관리를 편하게 해준다.

## wrapper class
프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있다.

예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수 없다. 이때에는 기본 타입의 데이터를 객체로 변환한 후 작업을 수행해야 한다.

8개의 primitive type에 해당하는 데이터를 Object로 포장해주는 클래스를 래퍼 클래스라고 한다.

래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달 받아, 해당 값을 가지는 객체로 만들어 준다.

이런 래퍼 클래스는 모두 java.lang 패키지에 포함되어 제공된다.

- 자바 Primitive types에 대응해 제공하는 있는 Wrapper class
| 기본 타입 | 래퍼 클래스 |
|:---:|:---:|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char| Charator |
| boolean | Boolean |

여기서 Integer class와 Character class 의 이름에 주의하자

### 박싱(Boxing)과 언박싱(UnBoxing)
래퍼 클래스는 산술 연산을 위해 정의된 클래스가 아니므로, 인스턴스에 저장된 값을 변경할 수 없다.

다만, 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만을 참조할 수 있습니다.

![박싱, 언박싱](http://www.tcpschool.com/lectures/img_java_boxing_unboxing.png)

위의 그림과 같이 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정을 박싱이라고 한다. 반면 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정을 언박싱이라고 한다.

### 오토 박싱과 오토 언박싱
JDK 1.5 부터는 박싱과 언박싱이 필요한 상화에서 자바 컴파일러가 이를 자동으로 처리해 준다. 이렇게 자동화된 박싱과 언박싱을 오토 박싱과 오토 언박싱이라고 부른다.

- 박싱, 언박싱 그리고 오토 박싱, 오토 언박싱의 차이
```java
Integer num = new Integer(17); // boxing
int n = num.intValue(); // unboxing
System.out.println(n);

Character ch = 'X' // Character ch = new Character('X'); // auto boxing
char c = ch; // char c = ch.charValue(); // auto unboxing
System.out.println(c);
```

```
실행결과
17
X
```

위의 예제에서 볼 수 있듯 래퍼 클래스인 Integer 클래스와 Character 클래스에는 각각 언박싱을 위한 intValue() 메소드와 charValue() 메소드가 포함되어 있다.

오토 박싱을 이용하면 new 키워드를 사용하지 않고도 자동으로 Character 인스턴스를 생성할 수 있다.

반대로 charValue() 메소드를 사용하지 않고도, 오토 언박싱을 이용하여 인스턴스에 저장된 값을 바로 참조할 수 있습니다.

따라서 아래의 예처럼 오토 박싱과 오토 언박싱을 통해 기본 타입과 래퍼 클래스 간의 다양한 연산도 가능해진다.

```java
public class Wrapper02{
    public static void main(String[] args){
        Integer num1 = new Integer(7); // boxing
        Integer num2 = new Integer(3); // boxing

        int int1 = num1.intValue(); // unboxing
        int int2 = num2.intvalue(); // unboxing

        Integer result1 = num1 + num2; // 10
        Integer result2 = int1 - int2; // 4
        int result3 = num1 * int2; // 21
    }
}
```

위의 세 연산은 내부적으로 래퍼 클래스인 피연산자를 오토 언박싱하여 기본 타입끼리의 연산을 수행하고 있다.

- 래퍼 클래스의 비교 연산
```java
public class Wrapper03{
    public static void main(String[] agrs){
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);
        Integer num3 = new Integer(10;

        System.out.println(num1 < num2); // true
        System.out.println(num1 == num3); // false
        System.out.println(num1.equals(num3)); // true
    }
}
```

래퍼 클래스의 비교 연산도 오토 언박싱을 통해 가능해지지만, 인스턴스에 저장된 값의 등등 여부 판단은 ```num1 == num3```처럼 비교 연산자인 동등 연산자(==)를 사용해서는 안 되며, ```num1.equals(num3)```처럼 equals() 메소드를 사용해야만 한다.

래퍼 클래스도 객체이므로 (==) 연산자를 사용하게 되면, 두 인스턴스의 값을 비교하는 것이 아니라 두 인스턴스의 주소값을 비교하게 된다.

서로 다른 두 인스턴스를 (==) 연산자로 비교하게 되면, 언제나 false 값을 반환한다.

## java string

### String, new String()
자바에서는 두 가지 방법으로 String을 선언할 수 있다.
```java
String a = "hello";
Stirng b = "new String("hello");
```

- String literal
- new keyword

이 둘의 차이점은 메모리 구조이다.
둘 다 Heap area에 저장되지만 literal의 경우에는 heap 영역 안의 string constant pool 에 저장된다.

```
String a = new String("String");
String b = ("String");
System.out.println(a==b);
```

```
실행 결과
false
```

```==```연산자는 레퍼런스를 가르킨다. 따라서 equals()를 사용해 값을 비교해야한다.

```
String b = "String";
String c = "String";
System.out.println(b == c);
```

```
실행결과
true
```

둘 다 literal을 이용해 초기화한 경우에는 ```==``` 연산자를 통해 비교했을 경우에는 ```true```를 반환한다. 두 개는 동일한 레퍼런스를 가리키고 있기 때문이다. String Constant Pool에 저장된 것이다. 

자바의 컴파일러는 최적화를 위해 동일한 String 문자열이 존재한다면 재사용한다. String Constant Pool에 String 을 만든 후 같을 경우 같은 주소를 가지고 사용하는 것이다.

```java
String b = "String";
System.out.println(b == "String");
```
위와 같은 경우에도 ```true```를 반환한다.

```java
String a = new String("String");
String c = "String";
System.out.println(a.intern() == c);
```
위와 같은 경우에도 ```true```를 반환한다.
```intern()```메소드는 객체형 String을 literal로 변환해준다.

**주의사항**

객체형 String은 되도록이면 사용하지 않는 것이 좋다. String은 literal로 선언하는 것이 좋다. String은 굳이 객체화할 필요가 없어 웬만하면 하지 않는 것이 좋으며, 자주 수행될 경우에는 성능에 문제가 생길 수 있다.

String의 ```String.valueOf(Object obj)``` 메소드는 null safe 하다. 하지만 null일 경우에는 실제 문자열```"null"```을 리턴한다. 실제 null을 반환하는 것이 아니기 때문에 문제가 발생할 수 있다.

되도록 매직 String을 사용하지 말자. (String뿐만 아니라 Number들도 그렇다) 유지보수에도 좋지 않고 실수할 여지가 많다.



# Reference
- [TCP school.com. Wrapper 클래스](http://www.tcpschool.com/java/java_api_wrapper)
- [머루의 개발 블로그. java의 String 얼마나 알고 쓰나요](http://wonwoo.ml/index.php/post/1666)
- [String Constant Pool](https://starkying.tistory.com/entry/what-is-java-string-pool)