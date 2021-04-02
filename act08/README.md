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

## 서브패키지 (Subpackage)

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

## 패키지 사용하기

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
