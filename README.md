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