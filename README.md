# Academia

Projeto Spring Boot para o sistema de gerenciamento de academia (cadastro de aluno, treinos, check-in e mensalidades).

## Como rodar

Pré-requisito: Java 21.

```bash
./mvnw spring-boot:run
```

## Porta da aplicação

Sem configuração explícita de `server.port`, a aplicação sobe na porta padrão do Spring Boot:

`8080`

## Swagger

Com `springdoc-openapi-starter-webmvc-ui`, a interface Swagger fica em:

`http://localhost:8080/swagger-ui/index.html`

## Actuator

Com `spring-boot-starter-actuator`, o endpoint base é:

`http://localhost:8080/actuator`
