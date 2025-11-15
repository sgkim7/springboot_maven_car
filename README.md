# 🚗 Spring Boot + React 애플리케이션 (Maven 기반)

이 프로젝트는 **Spring Boot 백엔드**와 **React 프론트엔드**를 하나로 묶어 동작시키는 구조를 예제로 보여준다.  
Spring Boot는 Maven으로 빌드하며, REST API 엔드포인트를 통해 React 앱과 데이터를 주고받는 방식이다.

---

## 📌 프로젝트 생성

프로젝트는 Spring Initializr에서 생성할 수 있다:

👉 https://start.spring.io/

**필수 의존성 예시**
- Spring Web  
- Spring Data JPA  
- Lombok  
- H2 또는 MySQL  
- Spring Boot DevTools  

---

## 📂 GitHub 소스 코드

책/예제 기반 프로젝트 소스는 아래를 참고하면 된다:  
👉 https://github.com/wikibook/springboot-react

---

## 📘 Spring Boot 실행 

```bash
mvn spring-boot:run
```

## 📘 React 실행
```bash
npm install
npm start
```
---

## ⚙️ application.properties
[application.properties](src/main/resources/application.properties)

```properties
# ===============================
# Spring Application 
# ===============================
server.port=8081
spring.application.name=hello
spring.data.rest.basePath=/api
spring.jackson.serialization.FAIL_ON_EMPTY_BEANS=false

logging.level.root=INFO

# ===============================
# H2 DATABASE
# ===============================
#spring.h2.console.enabled=true
#spring.h2.console.path=/h2
#spring.datasource.url=jdbc:h2:mem:testdb
#spring.datasource.username=sa
#spring.datasource.password=
#spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect

# ===============================
# Maria DATABASE
# ===============================
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://localhost:3306/assets_car 
spring.datasource.username=root
spring.datasource.password=1234

# ===============================
# JPA / HIBERNATE
# ===============================
spring.jpa.generate-ddl=true 
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#spring.jpa.properties.hibernate.format_sql=true
```

## ⚙️ pom.xml
[pom.xml](pom.xml)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<!-- lookup parent from repository -->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.3</version>
		<relativePath/> 
	</parent>
	
	<groupId>com.sboot</groupId>
	<artifactId>springboot_maven_car</artifactId>
	<version>0.1</version>
	<name>springboot_maven_car</name>
	<description>React project for Spring Boot</description>
	<url/>
	
	<licenses>
		<license/>
	</licenses>
	
	<developers>
		<developer/>
	</developers>
	
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	
	<properties>
		<java.version>17</java.version>
	</properties>
	
		<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		  <dependency>
		  <groupId>org.springframework.boot</groupId>
		  <artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
		<dependency>
	    	<groupId>org.springframework.boot</groupId>
	    	<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
		    <groupId>org.mariadb.jdbc</groupId>
		    <artifactId>mariadb-java-client</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
    		<groupId>io.jsonwebtoken</groupId>
    		<artifactId>jjwt-api</artifactId>
    		<version>0.11.2</version>
		</dependency>
		<dependency>
		    <groupId>io.jsonwebtoken</groupId>
		    <artifactId>jjwt-impl</artifactId>
		    <version>0.11.2</version>
		    <scope>runtime</scope>
		</dependency>
		<dependency>
		    <groupId>io.jsonwebtoken</groupId>
		    <artifactId>jjwt-jackson</artifactId>
		    <version>0.11.2</version>
		    <scope>runtime</scope>
		</dependency>		
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

```