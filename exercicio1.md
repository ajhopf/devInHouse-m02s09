# Exercício 1:

### Qual é a diferença entre o JDBC, JPA e o Hibernate/Spring Data? Cite as características que diferenciam essas ferramentas.

O JDBC(Java DataBase Connectivity) é uma camada de abstração que faz a conexão da aplicação Java com o banco de dados. Ela facilita a comunicação com o DB. O JDBC é o responsável por resolver qual método deve ser utilizado de acordo com o driver de cada banco.

Para que o JDBC funcione é necessário baixar e importar o driver específico do DB que estamos utilizando em nossa aplicação.

Para fazer a conexão, devemos criar uma Connection utilizando o DriverManager, passando como parâmetros a url do DB, o usuário e a senha.

Utilizando o JDBC devemos escrever manualmente os scripts sql. Desta maneira a aplicação pode ser “atacada” utilizando SQL injection.

O Hibernate é um framework que implementa o conceito de ORM (Object Relational Mapping). Ele faz o mapeamento das tabelas e colunas dos bancos relacionais com as classes/atributos do código orientado a objetos.

O Hibernate foi o primeiro framework que surgiu para fazer esse mapeamento. Com seu sucesso novos frameworks surgiram, porém com o problema de que, se por algum motivo fosse necessário alterar o framework a aplicação muito código deveria ser reescrito, visto que cada uma tem suas próprias especificações.

O JPA (Java Persistence API) surge para resolver este problema. O JPA foi desenvolvido pela equipe do JAVA, e é uma série de especificações que busca padronizar o mapeamento objeto-relacional em Java.
Com o JPA existe um padrão que os frameworks de ORM (Object Relational Mapping)

Para utilizar o Hibernate, devemos criar um projeto maven e adicionar às dependências do projeto o Hibernate e o driver de comunicação com o DB.
Para a configuração da url do DB, usuário, senha e outras especificações é utilizado um arquivo XML (com o nome de persistence.xml, que deve ser criado na pasta src/main/resources/META-INF) contendo as informações.

O mapeamento das entidades é feito através de annotations:
* @Entity -> para classes que são entidades do banco de dados;
* @Table -> especifica qual o nome da tabela no DB (necessária apenas se o nome da classe é diferente do nome da tabela)
* @Column -> identificar um atributo como uma coluna da tabela;
* @Id -> identificar um atributo como PK;
* @GeneratedValue(strategy = GenerationType.SEQUENCE -OU- GenerationType.IDENTITY) -> especifica como o id é criado no DB;

Por fim, criamos uma conexão com o DB utilizando a interface EntityManager. Para sua criação é utilizada a EntityManagerFactory.
Utilizando este manager, abrimos a conexão com o DB, persistimos informações, comitamos e por fim fechamos a conexão.