open class PessoaLogin {
    private var nome: String = ""
    private var senha = 0
    private var email = ""
    private var cpf = 0

    fun getNome(): String {
        return nome
    }

    fun setNome(novoNome: String) {
        this.nome = novoNome
    }

    fun getSenha(): Int {
        return senha
    }

    fun setSenha(novaSenha: Int) {
        this.senha = novaSenha
    }

    fun setEmail(): String {
        return email
    }

    fun setEmail(novoEmail: String) {
        this.email = novoEmail
    }

    fun getCPF(): Int {
        return cpf
    }

    fun setCPF(novoCPF: Int) {
        this.cpf = novoCPF
    }


    fun dados() {

        print("Dados Pessoais:/n")
        print("NOME: $nome")
        print("SENHA: $senha")
        print("EMAIL: $email")
        print("CPF: $cpf")

    }


}