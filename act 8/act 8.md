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









# todo
- 패키지 개념 및 특징과 필요성
- wrapper 클래스
- String 특징과 객체 생성


# Reference
- [TCP school.com. Wrapper 클래스](http://www.tcpschool.com/java/java_api_wrapper)