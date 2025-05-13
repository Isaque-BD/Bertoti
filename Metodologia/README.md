# Isaque de Souza Costa

## Introdução
Começando pela minha formação, atualmente estou cursando Banco de Dados, na qual eu me ingressei no segundo semestre de 2023, e atuando na área de análise de dados na minha profissão atualmente. Lá eu utilizo as tecnologias de Python e SQL para análise de dados e as ferramentas do Office365 para gerar dashboards, como por exemplo o Power BI.

## Contatos
<a href="https://www.linkedin.com/in/seu-usuario" target="_blank">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linkedin/linkedin-original.svg" alt="LinkedIn" width="20" style="vertical-align: middle;"/>
  Linkedin
</a>
<a href="https://github.com/Isaque-BD" target="_blank">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" alt="GitHub" width="20" style="vertical-align: middle;"/>
  GitHub
</a>

## Principais Conhecimentos

<a href="https://www.java.com" target="_blank">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" width="20" style="vertical-align: middle;"/>
  Java
</a>
<a href="https://spring.io/projects/spring-boot" target="_blank">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="Spring Boot" width="20" style="vertical-align: middle;"/>
  Spring Boot
</a>
<a href="https://www.mysql.com" target="_blank">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" alt="SQL" width="20" style="vertical-align: middle;"/>
  SQL
</a>

## Meus Projetos

### Em 2024-2
A GSW Soluções Integradas nos propôs o desafio de desenvolver uma página web voltada para análises estratégicas, com foco no armazenamento de históricos de informações. O sistema utilizará dados provenientes de outros sites, como, por exemplo, portais de notícias, para realizar previsões conforme a necessidade do usuário. Um exemplo seria a análise do crescimento de criptomoedas com base nas notícias relacionadas ou a previsão do tempo, entre outras possibilidades.

[GIT do Projeto Concluído - GSW Soluções Integradas](https://github.com/Morpheus-Fatec/morpheus/tree/main)

### Tecnologias Utilizadas
1 - *Java*: Foi essencial para todo desenvolvimento pois, foi com ele que foi feito toda a lógica do projeto.

2 - *MySQl*: Atuou com todo o armazenamento dos dados, a lógica do sistema e também o cruzamento dos dados para realizar as análises.

3 - *Vue*: Teve como atuação toda parte de interface para que o usuário consiga interagir com sistema de forma assertiva e prática.

4 - *GitHub*: Fez todo o gerenciamento de versionamento do projeto, ou seja a cada modificação nós tinhamos o controle de quem fez e o que foi alterado.

5 - *Discord*: Ferramenta foi utilizada para entrarmos em contato um com outro para discutir assuntos do projeto e ajudar uns aos outros no decorrer do desenvolvimento.

6 - *VSCode*: Ferramenta para o desenvolvimento do projeto.

7 - *Maven*: Ferramenta essencial para o projeto, pois, com ela é possível deixar uma lista de bibliotecas necessárias para rodar o projeto, quando um outro usuário utilizar ele já vai importar tudo automaticamente.

### Contribuições Pessoais

<details>
  <summary>Método de filtro de autores</summary>
      Objetivo dessa task era implementar um endpoint que retornava todos os autores cadastrados no sistema. O endpoint listava os autores com informações básicas, como nome e ID para fornecer uma visão geral útil.
  
      @Service
      public class NewsAuthorService {
        @Autowired
        private NewsAuthorRepository newsAuthorRepository;
    
        public List<NewsAuthorDTO> getAllAuthors() {
            return newsAuthorRepository.findAll().stream()
                .map(author -> new NewsAuthorDTO(author.getAutId(), author.getAutName()))
                .collect(Collectors.toList());
        }
      }

Esse método busca todos os autores de notícias do banco.

- findAll() retorna uma lista de entidades NewsAuthor (por exemplo).

- .stream() transforma essa lista em um stream para operar de forma funcional.

- .map(...) converte cada entidade em um DTO (Data Transfer Object) chamado NewsAuthorDTO. Tem como objetivo não retornar todas as informações, pois, não são necessárias mostrar todas elas.

- .collect(Collectors.toList()) junta os resultados mapeados numa nova lista.
  
</details> 

<details>
  <summary>Criação de Endpoints</summary>
     A função de endpoint tem como objetivo criar ponto de acesso para o cliente (a aplicação) enviar requisições e receber respostas do servidor da API.
     aqui está exemplo de um endpoint que eu desenvolvi durante o projeto:
  
      public class ApiEndpointDTO{
          private int code;      
          private String address; 
          private String source;  
          private String method;  
      
          public void setMethod(int post, int get) {
              if (post == 1) {
                  this.method = "POST";
              } else if (get == 1) {
                  this.method = "GET";
              }
          }
      }

  Esse código define uma classe ApiEndpointDTO com informações de um endpoint de API (código, endereço, origem e método HTTP).
  Esse método 'setMethod' só permite que um dos dois parâmetros (post ou get) seja 1 por vez. Ele não lida com outros valores (como ambos 0 ou ambos 1), nem com métodos HTTP além de POST e GET.
  </details>

  <details>
  <summary>Modelagem de Banco de Dados</summary>
  Nessa task tive que desenvolver uma estrutura no banco de dados para suportar o cadastro, atualização e gerenciamento das fontes de dados provenientes de APIs, armazenando as informações capturadas de forma organizada e permitindo a categorização das APIs com tags para facilitar a consulta e aplicação de filtros. Logo abaixo tem o código em SQL da minha parte de banco:

- Armazena informações básicas sobre APIs;
- api_cod: identificador único (chave primária, auto incremental);
- api_name: nome da API (obrigatório);
- api_url: URL da API (obrigatório e único);

      create table Api(
        api_cod int auto_increment primary key,
        api_name varchar(30) NOT NULL,
        api_url varchar(500) unique not null
      );

- Relação muitos-para-muitos entre Api e Tag;
- Cada linha representa uma associação entre uma API e uma tag;
- Usa chave primária composta (api_cod, tag_cod);

      create table Api_tag(
          api_cod int,
          tag_cod int,
          primary key (api_cod, tag_cod),
          foreign key (api_cod) REFERENCES Api(api_cod),
          foreign key (tag_cod) REFERENCES Tag(tag_cod)
      );

- Armazena dados coletados de uma API ao longo do tempo.
- dat_coll_api_cod: identificador único da coleta.
- api_cod: qual API forneceu os dados (chave estrangeira).
- dat_coll_api_registry_date: data/hora da coleta (valor padrão é o momento atual).
- dat_coll_api_content: conteúdo coletado (pode ser grande, tipo JSON).

      create table Data_collected_api(
          dat_coll_api_cod int auto_increment primary key,
          api_cod int,
          dat_coll_api_registry_date timestamp not null DEFAULT CURRENT_TIMESTAMP,
          dat_coll_api_content LONGTEXT,
          foreign key (api_cod) REFERENCES Api(api_cod)
      );
  
  </details>

## Hard Skills

- Programação em Java: Durante o desevolvimento com a linguagem java, utilizando meus conhecimentos, de orientação a abjeto e estrutura de dados e fazendo pesquisas consegui ter bastante autonomia.

- Base de Dados: Conhecimento na interpretação e entendimento de relacionamento de banco de dados, que é muito importante para desenvolvimento da lógica e da estrutura do projeto.

## Soft Skill

- Comunicação: Durante a API eu tinha uma certa dificuldade em comunicação que eu fui desenvolvimento ao longo do projeto, muitas vezes eu ficava com receio de perguntar algumas dúvidas que eu tinha, mas eu fui perdendo esse medo.

- Paciência: Durante a API inteira eu sempre fui paciente a qualquer tipo de inesperado sem me estressar independente do ocorrido, muito importante sempre manter o controle das coisas, quando se trabalha em equipe.








