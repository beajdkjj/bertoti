function adicionarAoCarrinho(){
    var qtd = document.getElementById('quantidade')?.value;
    var frutaEscolhida = document.getElementById('select-frutas')?.value;

    
    const dados = new URLSearchParams();
    dados.append('nome', frutaEscolhida);
    dados.append('qtd', qtd);

    const requestOptions = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: dados
    };

    fetch('/Fruta/carrinho', requestOptions)
    .then(response => response.text())
    .then(response => JSON.parse(response))
    .then(response => {
        document.getElementById('valor').innerHTML = 
            response.map(x => x.valor * x.qtd).reduce((a,b) => a + b, 0)
    })
    .catch(error => {
        console.error('Ocorreu um erro:', error);
    });
}

function comprar(){
    const dados = new URLSearchParams();
    const requestOptions = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: dados
    };

    fetch('/Fruta/carrinho/comprar', requestOptions)
    .then(response =>   document.getElementById('valor').innerHTML = 0)
    .catch(error => {
        console.error('Ocorreu um erro:', error);
    }); 
}
