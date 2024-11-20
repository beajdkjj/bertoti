# Oracle 
<div align="center"> 
<img width="200px" title="oracle" src="assets/oracle_logo.png"/>
</div>
Desenvolvimento de um sistema para gerenciar e monitorar a evolução dos parceiros no contexto do programa Oracle PartnerNetwork. O projeto tem como funcionalidades principais o cadastro de novos parceiros, a gestão das informações existentes, e o fornecimento de ferramentas analíticas para acompanhamento do progresso.
Entre os desafios enfrentados no desenvolvimento, destacam-se:
- Mapeamento completo da Linhagem dos Dados para assegurar rastreabilidade e confiabilidade.
- Documentação detalhada das boas práticas e diretrizes de governança de dados.
- Implementação de relatórios dinâmicos para exibir o nível de expertise dos parceiros em diferentes áreas de atuação.
- Criação de dashboards com uma visão consolidada do desenvolvimento dos parceiros ao longo do tempo.
- Identificação de lacunas nos conhecimentos dos parceiros em relação aos produtos e serviços oferecidos.
- Detecção e reporte de discrepâncias significativas nos dados cadastrados.
Configuração de indicadores para alertar sobre a validade de certificações e provas técnicas.

[link para o GIT](https://github.com/api-4-sem/api) <br />

**Tecnologias Utilizadas**
- Java <br />
- Spring <br />
- Vue.js <br />
- Bootstrap <br />
- Oracle <br />
- Github <br />

# Contribuições Pessoais
Durante o desenvolvimento do sistema para o gerenciamento e monitoramento dos parceiros no programa Oracle PartnerNetwork, tive contribuições significativas em várias etapas do projeto, conforme evidenciado pelos meus commits no repositório. Estas são algumas das principais ações realizadas:

- **Internacionalização do sistema:** Realizei a adaptação de nomenclaturas, como a alteração de "parceiros" para "partners", garantindo alinhamento com padrões internacionais e a possibilidade de uso global do sistema.
- **Botão para extração de dados em formato XLSX:** Desenvolvi uma funcionalidade que permite aos usuários exportar relatórios em formato Excel, facilitando análises externas e o compartilhamento de informações.
- **Criação da tabela de empresas:** Adicionei uma nova tabela para armazenar e gerenciar dados das empresas parceiras, expandindo a capacidade do sistema de lidar com informações corporativas.
- **Correção de bugs críticos:** Identifiquei e solucionei problemas técnicos, melhorando a estabilidade do sistema e a experiência do usuário.
- **Tela de rastreamento ajustada:** Ajustei a interface de rastreamento para torná-la mais intuitiva e funcional, promovendo uma experiência de usuário aprimorada.
- **Criação e finalização de trilhas:** Contribuí para o desenvolvimento de telas relacionadas às trilhas de conhecimento dos parceiros, incluindo ajustes de layout e funcionalidades completas.
- **Bootstrap da interface:** Implementei elementos de design utilizando Bootstrap, conferindo responsividade e estética às páginas do sistema.
- **Resolução de conflitos de merge:** Atuei na resolução de conflitos durante a integração de diferentes branches, assegurando que o código permanecesse funcional e integrado.
- **Lacuna View:** Criei uma visão específica para identificar lacunas de conhecimento dos parceiros em relação aos produtos oferecidos, contribuindo para estratégias de desenvolvimento direcionadas.

<details>

```
 download(data:any){
    var a = document.createElement("a") as any;
    document.body.appendChild(a);
    a.style = "display: none";
    var blob =  new Blob([data], {
                type: 'application/vnd.ms-excel'})
        , url = window.URL.createObjectURL(blob);
    a.href = url;
    a.click();
    window.URL.revokeObjectURL(url);
}
extrairRelatorio() {
    axios.get("relatorio/1").then(x=>this.download(x.data));
}
  async getColaboradores() {
    const response = await axios.get("colaborador/1");
    this.listaDeColaboradores = response.data;
  }
```

```
  async getProgresso(colaboradorId: string | null | any) {
    if (colaboradorId === null || colaboradorId === "0") {
      this.chartData = {
        labels: [],
        datasets: [{ data: [] }],
      };
      return;
    }
    const response = await axios.get(`progresso-colaborador/${colaboradorId}`);
    const progresso = response.data as {
      porcentagemAndamento: number;
      nomeTrilha: string;
    }[];
    this.chartData = {
      labels: progresso.map((p) => p.nomeTrilha),
      datasets: [{ data: progresso.map((p) => p.porcentagemAndamento) }],
    };
  }
```

```
    created() {
        let empresaId = +this.$route.params.id 
        axios.get('progresso-colaborador/habilidades/'+this.colaboradorSelecionado)
            .then(x => {
                this.integracoes = x.data
                   this.integracoes.forEach((inte:any, i)=> {
                    let ok = "percentagem-ok"+i;
                    let nok = "percentagem-nok"+i;
                    let porcentagemConclusao = (inte.expertisesConcluidas.id.length / inte.expertisesPorTrilha.id.length);
                    setTimeout(() => {
                        console.log(ok, nok)
                        document.getElementById(ok)!.style.width = `${(porcentagemConclusao) * 100}%`
                        document.getElementById(nok)!.style.width = `${(1 - porcentagemConclusao) * 100}%`
                    }, 1000)
                    
                })
            })
    }
```


</details>


**Hard Skills Efetivamente Desenvolvidas**
| Tecnologia | Classificação |
| --- | --- |
| Java | Sei fazer com ajuda |
| Javascript | Sei fazer com autonomia |
| Typescript | Sei fazer com ajuda|
| Vue.js | Sei fazer com ajuda |
| Oracle | Sei fazer com ajuda |
| Git & Github | Sei fazer com autonomia |

**Soft Skills Efetivamente Desenvolvidas**
| Habilidade | Descrição |
| --- | --- |
| Resiliência | ★★★★★★★★★☆ |
| Comunicação Assertiva | ★★★★★★★☆☆☆ |
| Empatia | ★★★★★★★★★☆ |
| Desenvolvimento de Visões Estratégicas | ★★★★★★★★★☆ |