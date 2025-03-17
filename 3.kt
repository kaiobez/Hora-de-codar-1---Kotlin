//3 Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

    fun main()
    {

        println("Qual o seu nome?\n")
        var nome = readln()

        print("\nQue nome bonito!\nE qual a sua idade?\n")
        var idade = readln().toInt()


        println("Olá! $nome, sua idade é  $idade anos.\n")



    }
