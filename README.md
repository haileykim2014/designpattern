# designpattern

### 어댑터 패턴
- 호환되지 않는 인터페이스를 가진 객체들이 협업할 수 있도록 하는 구조적 디자인 패턴
- 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴
- 장점 :
    - 기존코드를 변경하지 않고 인터페이스 구현체를 만들어 재사용할 수 있다.
    - 기존코드가 하던일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다.
- 단점 : 새 클래스가 생겨 복잡도가 증가할 수있다. 경우에 따라서는 기존코드가 해당 인터페이스를 구현하도록 수정하는 것이 좋은 선택이될수도있다.
- Target은 오리에 해당하며, Adapter는 칠면조 예시
- 사용 
    - java.util.Arrays#asList
    - java.util.Collections#list
    - java.io.InputStreamReader(InputStream)
    - java.io.OutStreamWriter(OutputStream)
    - 스프링 : HandlerAdapter : 우리가 작성한 다양한 형태의 핸들러 코드를 스프링 MVC가 실행할 수 있는 형태로 변환해주는 어댑터용 인터페이스  
