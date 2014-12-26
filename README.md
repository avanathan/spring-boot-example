spring-boot-example
===================

Spring boot example with Configuration & Validation

### To run,

```bash
mvn clean package spring-boot:repackage
java -jar target/spring-boot-example-1.0.0-SNAPSHOT.jar --spring.profiles.active=preprod,qa --version=1.0
```
### To check validation error,

```bash
java -jar target/spring-boot-example-1.0.0-SNAPSHOT.jar --spring.profiles.active=preprod,qa
```

