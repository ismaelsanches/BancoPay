class ContaBancaria(): PessoaLogin(){

    var numeroDaConta = 0
    var saldo:Double = 500.0

    //para deixar o contador estatico, toda vez que abrir um obj ele atualiza
    companion object{
        private var contadorConta = 1
    }
    //inicializa toda vez que é criado um objeto, antes de iniciar a class
    init{
        numeroDaConta = contadorConta
        contadorConta++
    }


    fun depositar(valor:Double){

        saldo += valor
        println("Saldo: R$$saldo")

        if(this.saldo < 0){
            println("Seu saldo esta negativo!")
        }else if(this.saldo > 0){
            println("Seu saldo esta positivo!")
        }
    }

    fun sacar(valor:Double){

        if(this.saldo <= 0){
            println("ERRO - Não possui saldo!")
        } else if(valor > this.saldo){
            println("ERRO - Saldo insuficiente!\n" +
                    "Seu saldo atual: R$$saldo")
        }else{
            saldo -= valor
            println("Saldo: R$$saldo")
        }

    }

    fun consultar(){

        println("Saldo: R$$saldo")

    }
}
