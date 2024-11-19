# OTUS Project
<div align="center"> 
<img width="300px" title="otus" src="https://user-images.githubusercontent.com/36649454/167738690-ab4cf4cd-1bb7-4e08-b1cf-78c8dbb7a848.png"/>
</div>

Participei do desenvolvimento de um projeto de API com a Fatec como parceiro acadêmico, focado na criação de uma assistente de voz voltada para estudantes de programação. Nossa proposta foi desenvolver uma assistente que não só fosse funcional, mas que tivesse uma interface intuitiva e amigável, com funcionalidades desenhadas especialmente para ajudar estudantes a organizarem seus horários de estudo e acompanharem o conteúdo das aulas.

O objetivo principal era criar uma ferramenta que agregasse praticidade ao dia a dia dos alunos, permitindo-lhes acessar informações rapidamente, organizar tarefas e revisar conteúdos de maneira eficiente. Com isso, o projeto se concentrava em fornecer uma experiência de usuário simplificada e acessível, além de explorar novas possibilidades de interação por meio da voz.

[link para o GIT](https://github.com/beatricelopes/OTUS-PROJECT) <br />

**Tecnologias Utilizadas**
- Python <br />
- Jira <br />
- Github <br />
- Figma <br />


# Contribuições Pessoais
- **Desenvolvimento de uma Calculadora Lógica:** Participei ativamente na criação de uma calculadora lógica dentro da assistente de voz, ajudando na lógica de programação para garantir cálculos precisos e rápidas respostas do sistema. <br />
- **Design e Implementação da Interface:** Colaborei no design visual e na implementação da interface, aplicando princípios de usabilidade para melhorar a experiência do usuário. Trabalhei com <i>Figma</i> para prototipar a interface e, em seguida, implementei os elementos de front-end no projeto.
- **Design de Produto:** Contribuí ativamente para o desenvolvimento da identidade do produto, alinhando a funcionalidade com o tema proposto. 


## funcoes_calculadora
1. A função **tabela_verdade** gera uma tabela da verdade com base no tipo de operação lógica (como conjunção, disjunção, implicação, etc.) solicitada pelo usuário. 
- Cada função interna (conjuncao, disjuncao, implicacao, bicondicional, exclusive_disjunction, negacao) representa uma operação lógica específica.
- Cada função usa ttg.Truths para gerar a tabela da verdade com base nos operadores lógicos desejados.
- Cada função chama a função tela (de utils) para exibir a tabela gerada.
- A entrada do usuário é dividida em palavras e comparada a uma lista de palavras-chave associadas a cada operação lógica (palavras_chave).
- Se uma das palavras-chave (e, ou, se, igual, desigual) estiver na entrada do usuário, a função identifica o índice da palavra-chave e chama a função correspondente (como conjuncao para "e" ou disjuncao para "ou").

<details>

```def tabela_verdade():
    # zerando caminho para importar funções de diretórios acima
    import ttg
    import sys
    sys.path.append('')
    
    from utils import ouvir, falar
    falar('Qual tabela-verdade você deseja visualizar?')
    frase = ouvir()

    ##tabelas verdade
    def conjuncao():
        from utils import tela
        tela(ttg.Truths(['p', 'q'], ['p and q']))

    def disjuncao():
        from utils import tela
        tela(ttg.Truths(['p', 'q'], ['p or q']))
    
    def implicacao():
        from utils import tela
        tela(ttg.Truths(['p', 'q'], ['p xor q']))
    
    def bicondicional():
        from utils import tela
        tela(ttg.Truths(['p', 'q'], ['p = q']))
    
    def exclusive_disjunction():
        from utils import tela
        tela(ttg.Truths(['p', 'q'], ['p != q']))

    def negacao():
        from utils import tela 
        tela(ttg.Truths(['p', 'q'], ['not(p and q)']))

    palavras = frase.split()
    palavras_chave = ['e', 'ou', 'se', 'igual', 'desigual']
    funcoes = [conjuncao, disjuncao, implicacao, bicondicional, exclusive_disjunction]
    
    for palavra in palavras:
        if palavra in palavras_chave:
            comando = palavras_chave.index(palavra)
            funcoes[comando]()
            break
```

</details>

2. O conversor de decimais para diferentes bases numéricas, interage com o usuário para ouvir o número e a base desejada para a conversão. 

<details>

```
def converter_decimal(num, base):
    res = ''
    while (num>0):
        # adiciona resto no texto
        res += str(num%base)
        # muda valor atual do número
        num = num//base
    # retorna texto invertido 
    return res[::-1]

def perguntar_conversao():
    from utils import falar
    falar('Diga a conversão')

def mostrar_exemplo_conversao():
    from utils import tela
    tela('Diga a conversão (ex: 10 em base 2)')

def ouvir_conversao():
    from utils import ouvir, tela
    frase_conversor = ouvir()

    palavras = frase_conversor.split()

    numero_encontrado = False
    numero = 0
    base = 0

    for palavra in palavras:
        # tenta converter palavra em numero
        try: 
            # se der certo, número ou base encontrado
            if (numero_encontrado):
                base = int(palavra)
            else:
                numero = int(palavra)
            numero_encontrado = True
        except:
            pass

    resultado_convertido = converter_decimal(numero,base)
    tela(f'Número {numero} convertido para base {base}:\n{resultado_convertido}')

def conversor():
    # zerando caminho para importar funções de diretórios acima
    import sys
    sys.path.append('')

    from threading import Thread
    from utils import ouvir, tela



    Thread(target=perguntar_conversao).start()
    Thread(target=mostrar_exemplo_conversao).start()
    Thread(target=ouvir_conversao).start()
```
</details>

3. plano_cartesiano utiliza interface gráfica e reconhecimento de voz para coletar e exibir produtos cartesianos entre dois conjuntos. A aplicação permite ao usuário informar os elementos de dois conjuntos, A e B, e, em seguida, escolher entre duas operações (produto cartesiano de AxB ou BxA). A interface, construída com Tkinter, exibe mensagens dinâmicas para guiar o usuário e apresenta o resultado final do produto cartesiano na tela.

<details>

```
def plano_cartesiano():
    # zerando caminho para importar funções de diretórios acima
    import sys
    sys.path.append('')

    import threading
    from PIL import ImageTk, Image
    from tkinter import ttk, Tk
    import tkinter as tk

    print('função plano_cartesiano chamada')
    global interface
    interface = Tk()
    image = Image.open("imagens\\fundo_consult.png")
    photo = ImageTk.PhotoImage(image, master=interface)
    fundo = tk.Label(interface, image=photo)
    fundo.image = image
    fundo.pack()
    interface.geometry('800x650+250+5')
    interface.title("Plano Cartesiano")
    texto = ttk.Label(interface, text="Produto Cartesiano!", font=("Arial 17"),
                      foreground='white', background='#0F2027')
    texto.place(relx=0.5, rely=0.4, anchor='center')
    threading.Thread(target=produto_cartesianoP).start() #executar função simultaneamente com interface
    interface.mainloop() #executa a abertura da interface
```
</details>

**Hard Skills Efetivamente Desenvolvidas**
| Tecnologia | Classificação |
| --- | --- |
| Git | Sei fazer com autonomia |
| Python | Sei fazer com autonomia |
| Canva | Sei fazer com autonomia |

**Soft Skills Efetivamente Desenvolvidas**
| Habilidade | Descrição |
| --- | --- |
| Proatividade | ★★★★★★★☆☆☆ |
| Visão de Negócio | ★★★★★★★★★☆ |
| Metodologia Agil | ★★★★★★★★★☆ |
