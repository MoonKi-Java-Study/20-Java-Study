# AWT, Swing package

## AWT, Swing package
자바 언어는 GUI기반의 응용프로그램 작성을 위해서 다양한 GUI 컴포넌트를 제공한다.
GUI 컴포넌트는 AWT 컴포넌트와 Swing 컴포넌트로 구분되며, 이들은 각각 java.awt 패키지와 javax.swing 패키지를 통해 공급된다.

### AWT
AWT(Abstract Windwing Toolkit)는 자바가 처음 나왔을 때 함께 배포된 패키지로써 많은 GUI컴포넌트를 가지고 있다.

Frame, Window, Panel, Dialog, Button, Label, TextField, Checkbox, Chioce 등과 같은 AWT의 컴포넌트들은 중량 컴포넌트(heavy weight compoenent)로도 불린다.

이 컴포넌트들은 운영체제(OS)의 도움을 받아 화면에 출력되는데, 운영체제의 리소스를 많이 소모해 운영체제에 부담을 많이 준다. 또한, 운영체제에 의존적이므로 OS환경에 따라 다르게 구현될 수 있다.

### Swing
스윙은 AWT기술을 기반으로 작성된 라이브러리로 AWT와 달라 순수하게 자바 언어로 작성되었다.

스윙 컴포넌트는 경량 컴포넌트(light weight component)라고도 불리며, 운영체제의 도움을 받지 않고 구현되기 때문에 운영체제와 관계 없이 항상 동일하게 작동하며 동일한 모양으로 그려진다.

스윙 컴포넌트의 이름은 AWT 컴포넌트와 구분하기 위해 모두 대문자 J로 시작한다.

> 보통 AWT보다는 스윙 사용을 권장한다.

## 자바의 GUI 패키지
### GUI 패키지 계층 구조
![java awt, swing component hierachy1](http://2.bp.blogspot.com/-7ymIoPZMaX8/TgdDU4ALlxI/AAAAAAAAANI/Usr2bxCt-hw/s1600/JavaSwingCompoentsList.jpg)

![java awt, swing component hierachy2](https://cdn.guru99.com/images/uploads/2012/06/java-swing-class-hierarchy.jpg)

자바의 모든 GUI 컴포넌트들은 Component 클래스를 반드시 상속받는다.

AWT컴포넌트는 Button, Label 등과 같이 Component를 직접 상속 받는 것들과 Panel, Frame 등과 같이 Container를 상속 받는 것들이 있다.

그리고 JApplet, JFrame, JDialog를 제외하고 모든 스윙 컴포넌트들은 JComponent를 상속 받는다.

### 컨테이너와 컴포넌트
컨테이너란 다른 컴포넌트를 포함할 수 있는 특별한 GUI 컴포넌트다.

컨테이너가 되기 위해서는 java.awt.Container클래스를 상속 받아야만 한다.

- AWT Container Component
	- Frame, Panel, Applet, Dialog, window

- Swing Container Compoenet
	- JFrame, JPanel, JApplet, JDialog, JWindow

- Top Level Container

컨테이너 중에서 다른 컨테이너에 속하지 않고도 독립적으로 존재해 출력될 수 있는 컨테이너를 최상위 컨테이너라고 한다.

JFrame, JApplet, JDialog 등이 최상위 컨테이너에 속한다.

**컴포넌트**란 컨테이너와 달리 다른 컴포넌트를 포함할 수 없으며, 임의의 컨테이너에 포함돼야 화면에 출력될 수 있는 GUI객체다.

## Making Swing GUI Program
- 프레임 만들기(최상위 컨테이너 만들기)
- 프레임에 스윙 컴포넌트 붙이기
- main() 메소드 작성

## 컨테이너(Container)와 배치(Layout)
### container, layout notion
컨테이너에는 여러 개의 컴포넌트를 부착할 수 있다. 여기서 컴포넌트들의 위치와 크기의 결정을 컨테이너 내부의 배치관리자(Layout Manager)가 한다.

AWT, Swing의 컨테이너는 아래와 같은 특징을 갖는다.
- 하나의 컨테이너는 반드시 하나의 배치관리자를 갖는다.
- 배치관리자는 컨테이너에 컴포넌트가 들어오는 시점에 컴포넌트의 위치와 크기를 결정한다.
- 배치관리자는 컨테이너의 크기가 변경되면 컨테이너 내부의 모든 컴포넌트들의 위치와 크기를 재조정한다.

### 배치관리자(Layout Manager)의 유형
자바는 대표적으로 4가지 배치 관리자가 컴포넌트를 배치한다. 배치관리자는 java.awt패키지에 전재하는 클래스들이며, 이들을 사용하기 위해서 ```import java.awt.*```와 같이 import해야 한다.

- FlowLayout
	- 컨테이너에 컴포넌트가 들어오면 순서대로 왼쪽에서 오른쪽으로 배치하며, 오른쪽에 더 이상 배치할 공간이 없으면 아래로 내려와서 다시 왼쪽에서 오른쪽으로 배치한다.

- BorderLayout
	- 컨테이너의 공간을 동,서,남,북,중앙 5개의 영역으로 나누고 응용프로그램에서 지정한 영역에 컴포넌트를 배치한다.

- GridLayout
	- 컨테이너의 공간을 응용프로그램에서 설정한 동일 크기의 2차원 그리드로 나누고, 컴포넌트를 들어오는 순서대로 좌에서 우로, 다시 위에서 아래로 순서대로 배치한다.

- CardLayout
	- 컨테이너의 공간에 카드를 쌓아놓은 듯이 컴포넌트를 쪼개 배치한다.

