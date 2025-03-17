//4 Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.

    fun main()
    {

        var lado1 : Double
        var lado2 : Double
        var lado3 : Double
        var area : Double

        println("Olá, qual area de figura plana que vamos calcular? \n1)Retangulo; 2)Quadrado; 3)Losango; 4)Trapézio; 5)Paralelogarmo; 6)Triangulo; 7)Circulo.\n\n Digite o codigo da figura: ")
        var forma = readln().toInt()

        if (forma == 1) {
           println("Beleza! Digite o valor de altura: ")
            lado1 = readln().toDouble()

           println("Show! Digite o valor de largura: ")
            lado2 = readln().toDouble()

            area = lado1 * lado2

            println("A area do Retangulo é: $area")

        }else if(forma == 2) {
            println("\nBeleza! Digite o valor de um lado: ")
            lado1 = readln().toDouble()

            area = lado1 * lado1

            println("\nA area do Quadrado é: $area")
        }


        else if(forma == 3) {
            println("\nBeleza! Digite o valor da diagonal maior: ")
            lado1 = readln().toDouble()

            println("\nShow! Digite o valor da diagonal menor: ")
            lado2 = readln().toDouble()

            area = lado1 * lado2 / 2

            println("\nA area do Losango é: $area")

        }

        else if(forma == 4) {
            println("\nBeleza! Digite o valor da base maior: ")
            lado1 = readln().toDouble()

            println("\nShow! Digite o valor da base menor: ")
            lado2 = readln().toDouble()

            println("falta um! Digite o valor de altura: ")
            lado3 = readln().toDouble()

            area = ((lado1 + lado2) * lado3 /2)

            println("\nA area do Trapezio é: $area")

        }


        else if(forma == 5) {
           println("\nBeleza! Digite o valor da base: ")
            lado1 = readln().toDouble()

           print("\nShow! Digite o valor da alturar: ")
            lado2 = readln().toDouble()

            area = lado1 * lado2

            print("\nA area do Paralelogramo é: " + area)
        }

       else if(forma == 6) {
            println("\nBeleza! Digite o valor da base: ")
            lado1 = readln().toDouble()

            println("\nShow! Digite o valor da alturar: ")
            lado2 = readln().toDouble()

            area = lado1 * lado2 / 2

           println("\nA area do Triângulo é: $area")
        }

        else if(forma == 7) {
            println("\nBeleza! Digite o valor do raio: ")
            lado1 = readln().toDouble()

            area = lado1 * lado1 * 3.14159265359

            println("\nA area do Circulo é: $area")
        }


        else println("Este numero é invalido. Por Favor tente novamente.")




    }
