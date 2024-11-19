# Pro4Tech - Projeto de RH
<div align="center"> 
<img width="300px" title="pro4tech" src="https://github.com/OsReservas/Project-RH/raw/main/doc/image/logo-sliders.svg"/>
</div>

Desenvolvimento de um projeto em parceria com a Pro4Tech, empresa especializada em soluções de software personalizadas. O objetivo foi criar um sistema de gerenciamento de vagas para Recursos Humanos, com foco em cruzar dados de candidatos com vagas disponíveis e gerar relatórios detalhados para facilitar as decisões do RH. O sistema abrange funcionalidades como:
- Cadastro de vagas e candidatos.
- Aplicação de candidatos a vagas específicas.
- Gerenciamento de vagas com atributos customizáveis.
- Acompanhamento do status das candidaturas pelos candidatos.
- Geração de relatórios para o RH.

[link para o GIT](https://github.com/OsReservas/Project-RH) <br />

**Tecnologias Utilizadas**
- Java <br />
- Eclipse <br />
- MySQL <br />
- Github <br />
- Figma <br />

# Contribuições Pessoais
Minhas contribuições se concentraram principalmente na criação e documentação do banco de dados. Fui responsável por desenvolver os modelos lógico e conceitual, garantindo que a estrutura estivesse alinhada às necessidades funcionais do sistema. Além disso, atuei fortemente na documentação do projeto, registrando de forma detalhada os diagramas, decisões técnicas e etapas do desenvolvimento.

Também colaborei com a equipe para integrar o banco de dados às funcionalidades principais, como o gerenciamento de candidatos e vagas, e assegurei que todas as operações fossem otimizadas e bem estruturadas. Meu foco esteve em criar uma base sólida e organizada, tanto no aspecto técnico quanto no documental, facilitando o trabalho do time e a manutenção futura do sistema.  <br />

<details>

![alt text](image.png)
![alt text](image-1.png)

```
create database bancotech;
CREATE TABLE login(
id int not null auto_increment primary key,
email varchar(50) unique, 
senha varchar(50),
acesso varchar(20)
);
CREATE TABLE vaga(
id int not null auto_increment primary key,
titulo    varchar (50),
cargo     varchar(50),
formacao  varchar(40),
periodo   varchar (20),
regime    varchar(15),
descricao varchar (500),
salario   decimal(7,2)
);
```

</details>


**Hard Skills Efetivamente Desenvolvidas**
| Tecnologia | Classificação |
| --- | --- |
| Java | Sei fazer com ajuda |
| MySQL | Sei fazer com ajuda |
| Figma | Sei fazer com autonomia |

**Soft Skills Efetivamente Desenvolvidas**
| Habilidade | Descrição |
| --- | --- |
| Resiliência | ★★★★★★★★★☆ |
| Comunicação Assertiva | ★★★★★★★☆☆☆ |
| Empatia | ★★★★★★★★★☆ |
