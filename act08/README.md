# act.08

## 01 패키지 (Package)

여러분은 아마도 폴더를 이용하여 파일을 정리해 본 경험이 있을것이다. 파일 여러개가 한 폴더에 뒤죽박죽 섞여 있을 때 파일들을 성격에 맞게 분류한 다음 새 폴더에 저장시키는 식으로 말이다.

자바의 패키지도 이것과 완전히 동일한 개념이다. 패키지는 비슷한 성격의 자바 클래스들을 모아 넣는 자바의 디렉토리이다.

예를 들어 HousePark, HouseKim 등의 클래스들이 있다면 이것을 house라는 패키지로 분류하면 편리할 것이다.

HouseKim.java

```Java
package jump2java.house;

public class HouseKim {
}
```

HousePark.java

```Java
package jump2java.house;

public class HousePark {
}
```

패키지를 만들때는 위 예제와 같이 package라는 키워드를 사용한다.

위 두개의 클래스를 이클립스에서 작성하고 저장하면 이클립스의 파일이 저장되는 디렉토리에 다음과 같은 구조의 파일들이 생성되는 것을 확인할 수 있다.

```
src/jump2java/house/HouseKim.java
src/jump2java/house/HousePark.java
bin/jump2java/house/HouseKim.class
bin/jump2java/house/HousePark.class
```

house라는 폴더가 자동으로 생성되고 house폴더 밑에 HouseKim과 HousePark 파일이 생성된것을 확인할 수 있다.

## [1-1] 서브패키지 (Subpackage)

이번에는 EungYongPark 이라는 클래스를 다음과 같이 만들어 보자.

```Java
package jump2java.house.person;

public class EungYongPark {

}
```

위 예제를 보면 패키지명이 jump2java.house.person 으로 되어 있다. 이렇게 도트(.)를 이용하여 하위 패키지를 계속해서 만들어 나갈 수 있다. 여기서 jump2java.house.person은 jump2java.house패키지의 서브패키지라고 말한다.

EungYongPark클래스를 작성한 후 클래스가 저장되는 디렉토리를 확인 해 보자.

```
src/jump2java/house/HouseKim.java
src/jump2java/house/HousePark.java
src/jump2java/house/person/EungYongPark.java
bin/jump2java/house/HouseKim.class
bin/jump2java/house/HousePark.class
bin/jump2java/house/person/EungYongPark.class
```

person이라는 디렉토리가 생성되고 그 밑에 EungYongPark 파일이 생성된 것을 확인할 수 있다.

즉, 패키지는 디렉토리의 구조 그대로 따라간다는 것을 확인할 수 있다.

### [1-2] 패키지 사용하기

다른 클래스에서 HouseKim 클래스를 사용하려면 다음과 같이 import 를 해야한다.

```Java
import jump2java.house.HouseKim;
```

또는 다음과 같이 * 기호를 이용할 수도 있다.

```Java
import jump2java.house.*;
```

위와 같이 *를 이용하면 house 패키지내의 모든 클래스를 import 하게 된다.

만약 HouseKim과 동일한 패키지 내에 있는 클래스라면 HouseKim 클래스를 사용하기 위해서 import 를 따로 할 필요는 없다. 같은 패키지 내에서는 import 없이 사용이 가능하다.

이렇게 패키지를 이용하면 다음과 같은 이점이 있다.

- 클래스의 분류가 용이하다. (비슷한 것 끼리 묶는다)

- 패키지가 다르다면 동일한 클래스명을 사용할 수 있다.


## 02 Wrapper 클래스

### [2-1] Wrapper 클래스
`래퍼 클래스(Wrapper class)`

프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있습니다.

예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없습니다.

이때에는 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 합니다.

 

이렇게 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.

래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어 줍니다.

이러한 래퍼 클래스는 모두 java.lang 패키지에 포함되어 제공됩니다.

 

자바의 기본 타입에 대응하여 제공하고 있는 래퍼 클래스는 다음과 같습니다.

| <center>기본 타입</center> | <center>래퍼 클래스</center> |
|:---:|:---:|
| byte | Byte |	
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

> 래퍼 클래스 중에서 Integer 클래스와 Character 클래스만이 자신의 기본 타입과 이름이 다름을 주의해야 합니다.

### [2-2] 박싱(Boxing)과 언박싱(UnBoxing)

`래퍼 클래스(Wrapper class)`는 산술 연산을 위해 정의된 클래스가 아니므로, 인스턴스에 저장된 값을 변경할 수 없습니다.

단지, 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만을 참조할 수 있습니다.

![박싱과 언박싱](http://www.tcpschool.com/lectures/img_java_boxing_unboxing.png)

위의 그림과 같이 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정을 박싱(Boxing)이라고 합니다.

반면 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정을 언박싱(UnBoxing)이라고 합니다.

### [2-3] 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)

JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해 줍니다.

이렇게 자동화된 박싱과 언박싱을 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)이라고 부릅니다.

 

다음 예제는 박싱과 언박싱, 오토 박싱과 오토 언박싱의 차이를 보여주는 예제입니다.

> 예제

```Java
Integer num = new Integer(17); // 박싱

int n = num.intValue();        // 언박싱

System.out.println(n);

 

Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱

char c = ch;        // char c = ch.charValue();           : 오토언박싱

System.out.println(c);
```

> 실행 결과
```
17

X
``` 

위의 예제에서 볼 수 있듯이 래퍼 클래스인 Interger 클래스와 Character 클래스에는 각각 언박싱을 위한 intValue() 메소드와 charValue() 메소드가 포함되어 있습니다.

 

또한, 오토 박싱을 이용하면 new 키워드를 사용하지 않고도 자동으로 Character 인스턴스를 생성할 수 있습니다.

반대로 charValue() 메소드를 사용하지 않고도, 오토 언박싱을 이용하여 인스턴스에 저장된 값을 바로 참조할 수 있습니다.