# [jakarta-app](https://hub.docker.com/r/evertonagilar/jakart-app)

[![Docker Hub](https://img.shields.io/badge/Docker%20Hub-46a2f1?logo=docker&logoColor=white)](https://hub.docker.com/r/evertonagilar/jakarta-app)


Aplicação Jakarta EE 9.1.0 + build imagem Dockerhub para fins de teste e debug de containers Docker/K8s

[Clique aqui para acessar o projeto no dockerhub](https://hub.docker.com/r/evertonagilar/jakarta-app).


### Detalhes da aplicação

- Contém a estrutura mínima de um projeto Jakarta EE 9.1.0 com Java 21 
- A imagem usa o container payara/server-web:latest para executar a aplicação 
- Implementado um servlet com anotação @WebServlet
- utilizado JSP e JSTL apenas
- O deploy possui o novo descritor payara-web.xml


### Subir container Docker

```bash
docker compose up
```
**Nota: Acessar a aplicação no endereço http://localhost:8080/jakartaapp/index.html**


### Autor

Copyright 2024 - Everton de Vargas Agilar




