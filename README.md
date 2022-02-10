## Spring으로 만드는 게시판

- Java 11
- SpringBoot 2.6.2
- Mybatis 
- MySQL
- Gradle

Reference Blog : https://congsong.tistory.com/

### 2022 / 1 / 27 (목)
- 게시판 CRUD 기능 추가

### 2022 / 1 / 29 (토)
- Controller에 특정 상황에서의 alert메세지 출력하는 기능 추가

### 2022 / 1 / 30 (일)
- 추가한 alert메세지 기능에서 `TemplateInputException` 발생 → jar파일에서 Classpath의 기본경로는 templates/ 였음 → "templates/utils/message-redirect"를 "utils/message-redirect"로 수정
- SQL 쿼리 로그 출력을 위한 LogBack(Log4JDBC) 추가
- Controller의 URI에 접근하는 과정에서 무언가를 제어할 필요가 있을 때 사용되는 Interceptor 추가

### 2022 / 2 / 3 (목)
- AOP를 이용한 log기능 추가
- Service에 원자성,일관성, 고립성, 지속성을 위한 트랜잭션 추가

### 2022 / 2 / 4 (금)
- Paging기능 추가 -> 생각보다 paging기능이 어렵다...

### 2022 / 2 / 7 (월)
- Search기능 추가 -> SQL의 like로 search가 된다!

### 2022 / 2 / 8 (화)
- 이전 페이지 정보 유지하기
    1. 게시글 상세 페이지에서 뒤로 가기 버튼을 클릭했을 때
    2. 게시글 상세 페이지에서 게시글을 삭제했을 때
    3. 게시글 수정 페이지에서 뒤로 가기 버튼을 클릭했을 때
    4. 게시글 수정 페이지에서 게시글 수정이 이루어졌을 때
  
### 2022 / 2 / 10 (목)
- 댓글 CRUD 기능 추가
- 댓글 작성, 읽기, 수정 기능 REST API로 구현 -> 타임리프의 사용법이 아직 어색하다.
- JSON으로 데이터를 주고받으면서 명사만을 사용하여 자원만을 표현하는 REST API의 작성법을 알게됨