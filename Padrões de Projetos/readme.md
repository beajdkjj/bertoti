## Atividade 1
- Crie um repositório no GitHub chamado “bertoti”. Dentro dele, crie uma pasta chamada “padroes”, depois uma pasta “estrategia” e, dentro desta, crie mais duas pastas: “padrao” e “antipadrao”.
- Na pasta “antipadrao”, crie um projeto que demonstre um code smell relacionado à redundância. No exemplo, é criada uma classe abstrata chamada Conta. A partir dela, são derivadas quatro subclasses — duas podem realizar empréstimos e duas não podem. O bad smell ocorre porque há duplicação de código: para as contas que não podem realizar empréstimos, é necessário reescrever o método, sobrescrevendo o já existente.
- Já na pasta “padrao”, as mesmas quatro classes são implementadas, mas utilizando uma interface que evita esse problema. Com a interface, é possível aplicar polimorfismo e implementar o método emprestimo apenas nas classes que têm permissão para usá-lo.

