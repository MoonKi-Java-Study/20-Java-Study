JAVA Constant
=====================
# static

# final 필드
final == '최종적' <br>
final 필드 == 최종적인 필드 <br>
=>  초기값이 저장되면 이게 최종(적인) 값이 되어 프로그램 실행 도중에 수정할 수 없는 필드
> = 한 번 초기화되면 수정할 수 없는 필드 <br>
> <code> final 타입 필드; </code> <br>
> <code> final 타입 필드 = 초기값; </code>
+ 정리
> - final 변수 : 상수 (값을 변경 불가능)
> - final 메소드 : overriding(오버라이딩)이 안되는 메소드
> - final 클래스 : 상속이 안되는 클래스

## final 필드의 초기값을 줄 수 있는 방법

### 1. 필드 선언 시에 주는 방법
단순 값이라면 필드 선언 시에 주는 것이 제일 간단

### 2. 생성자에서 주는 방법
복잡한 초기화 코드가 필요 or 객체 생성 시에 외부 데이터로 초기화해야 한다면 생성자에서 초기값 지정

```javascript

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
```
> ssn 필드 : 한 번 값이 저장되면 변경할 수 없도록 final 필드 선언
>> ssn은 Person 객체가 생성될 때 부여 ->  Person 클래스에서 초기값 미리 못 줌
>>> ssn을 생성자 매개변수로 받아서 초기값 지정

> nation은 final 필드로 항상 고정된 값을 가짐
>> 필드 선언할 때 초기값으로 "Korea" 지정

# Q&A
## 1
__Q.__ final 필드를 상수라고 불러도 되지 않을까 ? <br>
(BUT) final 필드를 상수라고 부르진 않음 <br>
__A.__ 
> 1. 불변의 값은 객체마다 저장할 필요가 없는 __공용성__<sup>Hint</sup>을 띠고 있음. 
> 2. 여러 가지 값으로 초기화 될 수 없음
<br>

# Constant(상수)

(자바에서의 상수) 불변의 값을 저장하는 필드
> 불변의 값 = 원주율 파이(π), 지구의 무게 및 둘레, ...

+ 상수는 __static__ + __final__ 이어야 함
>  __final static__ 키워드로 선언
>> statuc final 필드는 객체마다 존재하지 않고 클래스에만 존재

![constant](https://user-images.githubusercontent.com/76231561/106939867-2d570400-6764-11eb-9e99-304abcc19820.png)
> <code> static final 타입 상수 = 초기값 ; </code>

+ 선언 시 초기 값 지정
> 한 번 초기값이 저장되면 변경 불가
+ 실행 중 값 변경 불가

