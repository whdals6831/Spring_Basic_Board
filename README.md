## Spring으로 만드는 게시판

- Java 11 
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
- Controller의 URI에 접근하는 과정에서 무언가를 제어할 필요가 있을 때 사용되는 Interceptor 추

### 2022 / 2 / 3 (목)
- AOP를 이용한 log기능 추가
- Service에 원자성,일관성, 고립성, 지속성을 위한 트랜잭션 추가