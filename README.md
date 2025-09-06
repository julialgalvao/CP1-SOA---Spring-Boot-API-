# Checkpoint 1 – API REST com Spring Boot

## Integrantes do Grupo
- **Aline Fernandes Zeppelini – RM97966**
- **Camilly Breitbach Ishida – RM551474**
- **Jessica Witzler Costacurta – RM99068**
- **Julia Leite Galvão – RM550201**

---

## Resumo do Projeto
Este projeto implementa uma **API REST em Java com Spring Boot** para gerenciamento de **Instrutores** e **Alunos**, cumprindo os requisitos do Checkpoint.

### O que foi desenvolvido
- **Entidades**: `Aluno` e `Instrutor` com atributos obrigatórios e relacionamento com `Endereco` (VO).
- **DTOs**: 
  - `DadosCadastroAluno`, `DadosCadastroInstrutor` para entrada de dados.
  - `DadosListagemAluno`, `DadosListagemInstrutor` para retorno de listagens.
- **VO (Value Object)**: `Endereco` como objeto embutido (`@Embeddable`).
- **Controllers REST**: Endpoints para cadastro (`POST`) e listagem (`GET` com paginação e ordenação).
- **Validações**: Anotações Bean Validation (`@NotBlank`, `@Email`, `@Pattern`, etc.) garantem integridade dos dados.
- **Migrations com Flyway**: Controle de versão do schema do banco com arquivos `V1__...sql` até `V4__...sql`.
- **Banco de Dados**: Integração com **MySQL**, conexão configurada via `application.properties`.

---

## Como rodar o projeto

### Pré-requisitos
- **Java 17 ou superior**
- **Maven 3.9+** (já incluso wrapper `mvnw`)
- **MySQL 8.x**

### Passos

1. **Criar banco de dados no MySQL**
   ```sql
   CREATE DATABASE spring_boot_project CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
   ```

2. **Verificar credenciais do MySQL**  
   O arquivo `src/main/resources/application.properties` já está configurado com:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/spring_boot_project
   spring.datasource.username=root
   spring.datasource.password=fiap
   ```
   > Ajuste se necessário para seu ambiente.

3. **Executar a aplicação**
   ```bash
   ./mvnw spring-boot:run
   # ou no Windows:
   mvnw.cmd spring-boot:run
   ```

4. A API estará disponível em:  
   [http://localhost:8080](http://localhost:8080)

---

