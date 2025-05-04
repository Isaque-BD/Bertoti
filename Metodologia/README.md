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

6 - *VSCode*: Ferramenta para o desenvolvimento do projeto

7 - *Maven*: Ferramenta essencial para o projeto, pois, com ela é possível deixar uma lista de bibliotecas necessárias para rodar o projeto, quando um outro usuário utilizar ele já vai baixar tudo automaticamente.

### Contribuições Pessoais

Minhas contribuições para o projeto foi bastante atrelado ao retorno das informações, para o usuário, quanto na persistência de dados, tudo isso utilizando as tecnologias Spring boot, Java junto com a biblioteca do Hibernate, que permite fazer o controle dos dados no banco SQL com comandos em Java. Sendo mais detalhitas nas tasks que eu realizei consiste em fazer filtros, paginação (é uma prática muito utilizada para não sobrecarregar a página, deixando limitado os dados por blocos, pois, imagina um banco com 1000 dados retornando tudo de uma só vez para o FrontEnd, não é nada prático) e tratamento do retorno dos dados, ou seja, retornando os dados apenas o que é necessário para o usuário final.
Aqui tem um exemplo de um código que demonstra um exemplo de como é feito um filtro junto com a paginação por "trás das câmaras":
```
    public PaginatedApi<ApiEndpointDTO> getFilteredEndpoints(ApiFilterRequestDTO filterRequest, Pageable pageable) {

        List<Api> apis = apiRepository.findAll();

        List<ApiEndpointDTO> result = new ArrayList<>();

        for (Api api : apis) {
            if (filterRequest.getCode() == null || filterRequest.getCode().contains(api.getCode())) {
                ApiContent data = apiContentRepository.findFirstByApiId(api);

                if (data != null) {
                    ApiEndpointDTO dto = new ApiEndpointDTO();
                    dto.setCode(api.getCode());
                    dto.setAddress(api.getAddress());
                    dto.setSource(data.getApiContent());
                    dto.setMethod(api.getPost(), api.getGet());
                    result.add(dto);
                }
            }
        }

        int totalElements = result.size();
        int totalPages = (int) Math.ceil((double) totalElements / pageable.getPageSize());
        int start = Math.min((int) pageable.getOffset(), totalElements);
        int end = Math.min(start + pageable.getPageSize(), totalElements);
        List<ApiEndpointDTO> currentPageContent = result.subList(start, end);

        return new PaginatedApi<>(currentPageContent, pageable.getPageSize(), totalPages);
    }

```
## Hard Skills

Durante esse semestre eu desenvolvi bastante minha autonomia em programação com o Java, conseguindo fazer a maior parte das minhas tasks apenas com meu conhecimento e pesquisas.

## Soft Skill

Nesse projeto aprimorei um pouco minha comunicação, pois eu não sou uma pessoa que se comunica muito bem, mas toda dúvida que eu tive eu fui perguntando até ficar tudo claro para mim, muitas vezes eu ficava com receio de perguntar algo novamente, mas foi algo que eu fui trabalhando aos poucos.







