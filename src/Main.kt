class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                var Pilihan = 0
                do {
                    println("Game Suit Terminal Version")
                    println("1. Player 1 VS Player 2")
                    println("0. Exit")
                    print("Masukan Pilihan : ")
                    var inputPilihan = readLine()
                    Pilihan = inputPilihan?.toInt()!!

                    hasilPilihan(Pilihan)
                } while (Pilihan != 0)
            } catch (e: NumberFormatException) {
                println("input yang Anda masukkan salah")

            }
        }

        fun hasilPilihan(Pilihan: Int) {

            try {
                val permainan = mutableListOf("Gunting", "Batu", "Kertas")

                when (Pilihan) {
                    1 -> {
                        var Pemain = Pemain()
                        println("Permainan game suit")
                        println("Player 1 vs Player 2")
                        println("1. gunting")
                        println("2. Batu")
                        println("3. Kertas")
                        println("masukan pilihan player 1 :")
                        var inputPemain = readLine()

                        println("1. Gunting")
                        println("2. Batu")
                        println("3. Kertas")
                        print("Masukan Pilihan Player 2 : ")
                        var inputPemain2 = readLine()

                        Pemain.hasil(
                            permainan[inputPemain?.toInt()!!.minus(1)],
                            permainan[inputPemain2?.toInt()!!.minus(1)]
                        )
                    }
                    0 -> {
                        println("Exit")
                    }

                }
            }catch (e: NumberFormatException) {
                println("input yang Anda masukkan salah")

            }
        }
    }
}
