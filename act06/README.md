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

## 03 오버라이딩

`메소드 오버라이딩(method overriding)`

앞서 배운 `오버로딩(overloading)`이란 서로 다른 시그니처를 갖는 **여러 메소드를 하나의 이름으로 정의하는 것**이었습니다.

`오버라이딩(overriding)`이란 상속 관계에 있는 부모 클래스에서 **이미 정의된 메소드를 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의하는 것**이라고 할 수 있습니다.

 

자바에서 자식 클래스는 부모 클래스의 private 멤버를 제외한 모든 메소드를 상속받습니다.

이렇게 상속받은 메소드는 그대로 사용해도 되고, 필요한 동작을 위해 재정의하여 사용할 수도 있습니다.

즉, 메소드 오버라이딩이란 상속받은 부모 클래스의 메소드를 재정의하여 사용하는 것을 의미합니다.

### 오버라이딩의 조건

자바에서 메소드를 오버라이딩하기 위한 조건은 다음과 같습니다.

 
1. 오버라이딩이란 메소드의 동작만을 재정의하는 것이므로, 메소드의 선언부는 기존 메소드와 완전히 같아야 합니다.

    하지만 메소드의 반환 타입은 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경할 수 있습니다.

2. 부모 클래스의 메소드보다 접근 제어자를 더 좁은 범위로 변경할 수 없습니다

3. 부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없습니다.

### [3-1] 메소드 오버라이딩

자바에서는 메소드 오버라이딩을 통해 상속받은 부모 클래스의 메소드를 자식 클래스에서 직접 재정의할 수 있습니다.

 

다음 예제는 부모 클래스인 Parent 클래스의 display() 메소드를 자식 클래스인 Child 클래스에서 오버라이딩하는 예제입니다.

```Java
class Parent {

    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }

}

class Child extends Parent {

    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }

}

 

public class Inheritance05 {

    public static void main(String[] args) {

        Parent pa = new Parent();

        pa.display();

        Child ch = new Child();

        ch.display();

        Parent pc = new Child();

        pc.display(); // Child cp = new Parent();

    }

}
```


> 실행 결과
```
부모 클래스의 display() 메소드입니다.

자식 클래스의 display() 메소드입니다.

자식 클래스의 display() 메소드입니다.
```
 

위의 예제에서 세 번째와 같은 인스턴스의 참조가 허용되는 이유는 바로 자바에서의 `다형성(polymorphism)` 때문입니다.


### [3-2] 오버로딩과 오버라이딩

오버로딩과 오버라이딩은 그 단어의 유사함으로 인해 혼동하기 쉽습니다.

하지만 그 개념은 확실히 다르며, 그 차이점을 아는 것이 중요합니다.

 

간단히 정의하면 오버로딩(overloading)은 새로운 메소드를 정의하는 것입니다.

하지만 오버라이딩(overriding)은 상속받은 기존의 메소드를 재정의하는 것입니다.

 

다음 예제는 부모 클래스인 Parent 클래스의 display() 메소드를 자식 클래스인 Child 클래스에서 오버라이딩과 오버로딩을 둘 다 수행하는 예제입니다.

```Java
class Parent {

    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }

}

class Child extends Parent {

    // 오버라이딩된 display() 메소드

    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }

    void display(String str) { System.out.println(str); } // 오버로딩된 display() 메소드

}

 

public class Inheritance06 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

        ch.display("오버로딩된 display() 메소드입니다.");

    }

}
```


> 실행 결과
```
자식 클래스의 display() 메소드입니다.

오버로딩된 display() 메소드입니다.
```
