#4_3 인자 전달 방식 정리하기

[ 값에 의한 호출(Call-by-value) ]
: 인자로 값을 넘겨주는 방법
: caller의 인자의 값이 복사되어 callee(함수)의 인자로 전달되는 방식

[ 참조에 의한 호출(Call-By-Reference) ]
: 인자로 주소값을 넘겨주는 방법
: 변수의 주소와 포인터를 활용한 인자 전달 방식
: 변수의 조소값을 호출한다는 것

[ java의 메소드 호출 ]
Always call by value(값에 의한 호출) 인자 전달 방식을 채택
- 호출하는 인자의 값이 복사되어 메소드의 인자로 전달. 
(만약 call by reference 를 채택하였다면 주소를 가져와, 객체를 통째로 전달하는 것과 같은 결과를 출력해 낼 수 있었을 것) 

1. 기본 타입이 인자로 전달되는 경우 : Call By Value
: 자바 기본 타입이 인자로 전달되는 경우
- 기본 타입(primitive type) : byte, char, short, int, long, float, double, boolean 등
- 메소드가 호출되면 caller의 인자 값이 생성된 매개변수로 복사되고, 연산이 끝나면 해당 매개변수는 사라짐

2. 객체 레퍼런스가 인자로 전달되는 경우 
: 객체에 대한 레퍼런스 값이 복사되어 전달
( 객체가 통째로 전달되는 것은 아님을 주의해야 함 )
-  객체 타입 (reference type) : java.lang.object를 상속받는 모든 객체
