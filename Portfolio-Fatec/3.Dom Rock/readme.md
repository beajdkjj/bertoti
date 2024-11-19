# Dom Rock - 
<div align="center"> 
<img width="300px" title="pro4tech" src="https://github.com/beatricelopes/Dom-Rock/raw/main/doc/Assets/logo02.png"/>
</div>

Desenvolvimento de soluções baseadas em ciência de dados e automação para simplificar processos corporativos em parceria com a empresa Dom Rock. O desafio consiste em lidar com o histórico de movimentação de produtos (vendas e estoque), predição de faturamento (feito por um algoritmo de IA já existente) e a entrada de dados oriundas da força de vendas quanto ao planejamento futuro. 

[link para o GIT](https://github.com/Thunder53/Dom-Rock) <br />

**Tecnologias Utilizadas**
- Java <br />
- Eclipse <br />
- MySQL <br />
- Github <br />
- Figma <br />

# Contribuições Pessoais
- Desenvolvimento de funcionalidades de front-end: Contribuí para o design e desenvolvimento da interface de usuário, criando elementos como a navbar com Bootstrap e telas para registro de vendas e exibição de vendas realizadas.
- Melhoria na usabilidade do sistema: Trabalhei na correção e aprimoramento de funcionalidades, como ajuste de botões e melhorias nos gráficos, visando uma experiência mais intuitiva e eficiente para o usuário.
- Documentação e organização: Fiz várias atualizações na documentação do projeto, garantindo que os detalhes do desenvolvimento estivessem claros e acessíveis para a equipe, além de adicionar diagramações para melhor visualização dos fluxos.
- Ajustes na lógica de negócios: Atualizei e mantive registros importantes, garantindo que as métricas estivessem sempre atualizadas e com informações relevantes para a análise do progresso do projeto.
- Aprimoramento contínuo do projeto: Durante o desenvolvimento, fiz ajustes em diversas áreas do código e dos fluxos do front-end, como mudanças nas visualizações e melhorias no código JavaScript, buscando sempre otimizar o desempenho e a clareza do sistema.  <br />

<details>

```
fetch("http://localhost:8080/venda/acima-meta")
.then(function (response) {
    return response.json();
  })
  .then(function (data) {
    var dados = data.map(function (item) {
      return { y: item.quant_vendida, a: item.fk_usuario_id };
    });
    var config = {
      data: dados,
      xkey: "y",
      ykeys: "a",
      labels: ["Total"],
      fillOpacity: 0.6,
      hideHover: "auto",
      behaveLikeLine: true,
      resize: true,
      pointFillColors: ["#ffffff"],
      pointStrokeColors: ["black"],
      lineColors: ["blue"],
    };
    config.element = "stacked";
    config.stacked = true;
    Morris.Bar(config);
  })
  .catch(function (error) {
    console.log(error);
  });
```


</details>


**Hard Skills Efetivamente Desenvolvidas**
| Tecnologia | Classificação |
| --- | --- |
| Java | Sei fazer com ajuda |
| Javascript | Sei fazer com autonomia |
| MySQL | Sei fazer com autonomia |
| Figma | Sei fazer com autonomia |

**Soft Skills Efetivamente Desenvolvidas**
| Habilidade | Descrição |
| --- | --- |
| Resiliência | ★★★★★★★★★☆ |
| Comunicação Assertiva | ★★★★★★★☆☆☆ |
| Empatia | ★★★★★★★★★☆ |
