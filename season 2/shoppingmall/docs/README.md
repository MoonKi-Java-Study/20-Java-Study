# Shopping Mall project

# 아는 것, 하는 것

# 추가 구현
## commandNumber variable in class file MainMenu
commandNumber 변수는 메인메뉴에서 사용자의 입력을 받아 저장하는 역할을 한다.사용자의 입력이 유효한지 검사하기 위해서는 아래와 같은 예외처리 및 유효성 검사가 필요하다.

- [ ] 입력이 정수인가
- [ ] 입력 받은 정수가 명령을 수행하기에 유효한가 
- [ ] 장바구니에서 구입한 물품 재고 감소
- [ ] 장바구니 모드 끝난 후 메인메뉴로 가기
- [ ] 뷰어들을 static 으로 바꾸기
- [ ] Product class 만들어서 일급 컬렉션 구현하기
- [ ] 기존의 product 저장 방식들 변경하기
    - [ ] 메인
    - [ ] 어드민
    - [ ] 카트
    - [ ] 커스터머
    

# common error check
## null pointer
- null pointer exception
- null String exception
    - don't compare null to String
        - ```null.equls("sthStringVar")```