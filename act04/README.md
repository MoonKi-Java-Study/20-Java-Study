# Java Study act 04.

## 01 클래스와 객체

(1) 클래스(class)

자바에서 클래스(class)란 객체를 정의하는 틀 또는 설계도와 같은 의미로 사용됩니다.

자바에서는 이러한 설계도인 클래스를 가지고, 여러 객체를 생성하여 사용하게 됩니다.

클래스는 객체의 상태를 나타내는 필드(field)와 객체의 행동을 나타내는 메소드(method)로 구성됩니다.

즉, 필드(field)란 클래스에 포함된 변수(variable)를 의미합니다.

또한, 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.


(2) 객체(Object)

- 소프트웨어 세계에 구현할 대상

- 클래스에 선언된 모양 그대로 생성된 실체

- ‘클래스의 인스턴스(instance)’ 라고도 부릅니다.

- 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖습니다.

- oop의 관점에서 클래스의 타입으로 선언되었을 때 ‘객체’라고 사용하게 됩니다.


(3) 인스턴스(instance)

자바에서 클래스를 사용하기 위해서는 우선 해당 클래스 타입의 객체(object)를 선언해야 합니다.

이렇게 클래스로부터 객체를 선언하는 과정을 클래스의 `인스턴스 화`라고 합니다.

또한, 이렇게 선언된 해당 클래스 타입의 객체를 인스턴스(instance)라고 합니다.

즉, 인스턴스란 메모리에 할당된 객체를 의미합니다.

자바에서는 하나의 클래스로부터 여러 개의 인스턴스를 생성할 수 있습니다.

이렇게 생성된 인스턴스는 독립된 메모리 공간에 저장된 자신만의 필드를 가질 수 있습니다.

하지만 해당 클래스의 모든 메소드(method)는 해당 클래스에서 생성된 모든 인스턴스가 공유하게 됩니다.

**(4) 클래스, 객체, 인스턴스의 차이**

**클래스(Class) VS 객체(Object)**

클래스는 ‘설계도’, 객체는 ‘설계도로 구현한 모든 대상’을 의미한다.

**객체(Object) VS 인스턴스(Instance)**

- 클래스의 타입으로 선언되었을 때 객체라고 부르고, 그 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 부릅니다.

- 객체는 현실 세계에 가깝고, 인스턴스는 소프트웨어 세계에 가깝다고 볼 수 있습니다.

- 객체는 ‘실체’, 인스턴스는 ‘관계’에 초점을 맞춥니다.

- 객체를 ‘클래스의 인스턴스’라고도 부릅니다.

> ‘인스턴스화하여 레퍼런스를 할당한’ 객체를 인스턴스라고 말하지만, 
> 이는 원본(추상적인 개념)으로부터 생성되었다는 것에 의미를 부여하는 것일 뿐 엄격하게 객체와 인스턴스를 나누긴 어렵다.


> 클래스, 객체, 인스턴스
```Javascript
/* 클래스 */
public class Animal {
  ...
}
/* 객체와 인스턴스 */
public class Main {
  public static void main(String[] args) {
    Animal cat, dog; // '객체'

    // 인스턴스화
    cat = new Animal(); // cat은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
    dog = new Animal(); // dog은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
  }
}
```
***

## 02 메소드(method)

1. 메소드

`메소드`란 하나 또는 여러가지 기능을 묶어서 독립적으로 사용 할 수 있는 프로그램 구성 단위로, 모듈이라고도 합니다.

입력값(파라미터)을 넣어주면 해당 기능을 처리하고 출력 값을 반환합니다.


2. 메소드 작성 형식

	자료형 메소드 이름(매개 변수1, 매개 변수2, ...){...}



3. 메소드 종류

- 파라미터와 반환값이 모두 존재하는 메소드

- 파라미터는 존재하나 반환값이 없는 메소드

e.g. main 메소드: 입력값은 있으나 출력값은 없는 메소드

- 파라미터는 없으나 반환값은 존재하는 메소드

- 둘다 없는 메소드

> main 메소드
>
> 유일하게 이름이 지정되어 있는 메소드
>
> 한 프로그램에 반드시 main 메소드가 존재해야하고 한 프로젝트당 반드시 하나만 존재해야한다.
> Call stack은 메소드를 호출하기 위한 계층으로 call stack에는 항상 main 메소드가 들어있다.

4. 메소드 형식

**[4-1] 파라미터 O, 반환값 O 메소드**

- 두개의 값을 입력 받고 결과를 반환하는 메소드

- 이렇게 메소드 안에서 호출하게 되면 입력값을 받기위한 변수로는 사용 불가함
```Javascript
	public static int add(int a, int b) {
		int c, d;
		int result = a + b;
		return result;
	}
```
 

**[4-2] 파라미터 O, 반환값 X 메소드**
```Javascript
	public static void sub(int a, int b) {//return이 없는 경우 반환형에 void 써줌
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}
 ```

**[4-3] 파라미터 X, 반환값 O 메소드**
```Javascript
	public static int mul() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		return result;	
	}
```

**[4-4] 파라미터 X, 반환값 X 메소드**
```Javascript
	public static void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a / b;
		System.out.println(a + " / " + b + " = " + result);
	}
```

***

## 03 인자전달

- 자바에서 지원하는 타입에는 primitive type과 reference type이 있다.

- primitive type : byte, char, short, int, long, float, double, boolean 등과 같은 자바 기본 타입

- reference type : java.lang.object를 상속받는 모든 객체

 

**(1) primitive type이 인자로 전달되는 경우**

 
```Javascript
public class test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("a = "+a);
		add(a);
		System.out.println("a = "+a);
	}
	static void add(int x) { // a의 값을 1증가 시켜주는 함수
		x++;
	}

}
``` 

> a = 10 a = 10

값이 바뀌지 않는 것을 보아 `Call By Value`임을 알 수 있다.

 

**(2) 객체 레퍼런스가 인자로 전달되는 경우**

```Javascript 

class Point{
	int x;
	Point(int x){
		this.x = x;
	}
}
public class test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10);
		System.out.println("a = "+p.x);
		add(p);
		System.out.println("a = "+p.x);
	}
	static void add(Point a) { // a.x 값을 1 증가 시켜주는 함수
		a.x++;
	}

}
 
```

> a = 10 a = 11
 
값이 바뀌는 것을 보아 `Call By Reference`임을 알 수 있다.

 

**(3) 배열이 인자로 전달되는 경우**

```Javascript
public class test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20};
		System.out.println("x = "+a[0]+", y = "+a[1]);
		swap(a);
		System.out.println("x = "+a[0]+", y = "+a[1]);
		
		
	}
	static void swap(int x[]) { // x[0]와 x[y] 값을 교환하는 함수
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}

}
 
```

> x = 10, y = 20 x = 20, y = 10

값이 바뀌는 것을 보아 `Call By Reference`임을 알 수 있다.

 

> [정리] primitive type은 Call By Value, reference type은 Call By Value
