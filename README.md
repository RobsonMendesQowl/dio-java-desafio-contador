# dio-java-desafio-contador

## Funcionalidade

No método main da classe Contador, verificamos se foram passados dois parâmetros via terminal. Se não forem passados, lançamos uma exceção **ParametrosInvalidosException** com a mensagem "É necessário passar dois parâmetros". 🚨

Em seguida, convertemos os parâmetros para inteiros e verificamos se o primeiro parâmetro é maior que o segundo. Se for, lançamos outra exceção **ParametrosInvalidosException** com a mensagem "O segundo parâmetro deve ser maior que o primeiro". 🤔

Se os parâmetros forem válidos, criamos um loop for que irá de inicio a fim e imprime os números incrementados no console. ➡️

Caso ocorra uma exceção, capturamos ela e imprimimos a mensagem de erro no console de erro. ❗️

## Observações

* É importante verificar se os parâmetros foram passados corretamente para evitar erros. 💡
* O loop for é usado para imprimir os números incrementados no console. 📊
* As exceções são capturadas e tratadas para evitar que o programa crash. 💻

## Autor

Robson Mendes 👋



