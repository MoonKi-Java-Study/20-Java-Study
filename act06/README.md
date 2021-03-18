# act.06

## 01 업캐스팅과 다운캐스팅

`캐스팅(Casting)`이란?

우선, 캐스팅이란 타입 변환을 말한다. 

자바에서 클래스에 대한 캐스팅은 업캐스팅과 다운캐스팅으로 나뉜다.

### [1-1] 업캐스팅(Upcasting)

자바에서 서브 클래스는 슈퍼 클래스의 속성을 받기 때문에, 서브 클래스의 객체는 슈퍼 클래스의 멤버를 모드 가진다.

**서브 클래스는 슈퍼 클래스의 모든 특성을 상속받는다는 말이다.** 따라서, 서브 클래스는 슈퍼 클래스로 취급될 수 있다.

이 때, 업캐스팅(Upcasting)이란, 서브 클래스의 객체가 슈퍼 클래스 타입으로 형변환한다는 것을 말한다.

다시 말하자면, 슈퍼 클래스의 레퍼런스 변수가 서브 클래스로 객체화된 인스턴스를 가리킬 수 있게 되는 것이다.

> "사람은 동물이다" 정도로 생각하면 된다.

```Java
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

class Student extends Person{
    String check;
    Student(String name){
        super(name);
    }
}
public class Practices {
    public static void main(String[] args){
        Student stu = new Student("홍길동");
        Person per = stu; //업캐스팅
        per.check = "이름입니다"; //컴파일에러 발생
        System.out.println(per.name);
    }

}
```

위 코드에서 슈퍼클래스 타입의 래퍼런스 per이 서브클래스 객체 stu를 가리키도록 되는 것이 업캐스팅이다.

업캐스팅을 통하여 Person타입의 per은 Student 객체를 가치키지만, per은 Person 타입이기 때문에 per로는 Person클래스의 멤버에만 접근이 가능하다.

그렇기 때문에 per.check에서 컴퍼일 에러가 발생하게 된다.

### [1-2] 다운캐스팅(Downcasting)

업캐스팅과 반대로 캐스팅하는 것을 다운캐스팅(Downcasting)이라고 한다.

자신의 고유한 특성을 잃은 서브클래스의 객체를 다시 복구시켜주는 것을 말하는데, 다시 말하자면 업캐스팅 된 것을 다시 원상태로 돌리는 것을 말한다.

```Java
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

class Student extends Person{
    String check;
    Student(String name){
        super(name);
    }
}
public class Practices {
    public static void main(String[] args){
        Person per = new Student("홍길동");

        Student stu = (Student)per; //Downcasting
        stu.name = "김가나";
        stu.check = "확인용";

        System.out.println(stu.name);
        System.out.println(stu.check);
    }

}
```

우선 업캐스팅과의 차이점은 명시적으로 타입을 지정해야 한다는 것이다.

그리고 업캐스팅이 선행되어야 한다.

```Java
Person per = new Student("홍길동");
```

우선 이 코드에서 업캐스팅이 실행되었다.

```Java
Student stu = (Student)per;
```
에서 다운캐스팅을 하였는데 보면 (Student)로 형변환을 해주었다.

다운캐스팅은 이와같이 명시적으로 타입 변환을 해주어야 한다.