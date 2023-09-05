# Nome do Seu Projeto

Descrição curta do seu projeto.

## Pré-requisitos

Certifique-se de ter os seguintes pré-requisitos instalados em sua máquina:

- Docker: [https://www.docker.com/get-started](https://www.docker.com/get-started)
- Docker Compose: [https://docs.docker.com/compose/install/](https://docs.docker.com/compose/install/)

## Configuração

1. Clone este repositório para o seu sistema local:

```bash
git clone https://github.com/seu-usuario/seu-projeto.git
cd seu-projeto
```

2. Copie o arquivo application-example.properties para application-dev.properties:

```bash
cp application-example.properties application-dev.properties
```

3. Configure as variáveis de ambiente no arquivo application-dev.properties conforme necessário para o seu ambiente de desenvolvimento.

#### Para iniciar o aplicativo e o banco de dados Postgres, utilize o Docker Compose, Isso iniciará o servidor na porta 8080:
```bash
docker-compose up
```

#### Para acessar a api, acesse o aplicativo em seu navegador:
http://localhost:8080

### Para encerrar o aplicativo e remover os contêineres Docker, utilize o seguinte comando:
```bash
docker-compose down
```