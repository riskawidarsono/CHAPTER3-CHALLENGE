class Pemain : IPemain {
    override val permainan: MutableList<String>
        get() = mutableListOf<String>("Gunting", "Batu", "Kertas")

    override fun hasil(player1: String, player2: String) {
        val output =
            if (player1 == permainan[0] && player2 == permainan[1] ||
                player1 == permainan[2] && player2 == permainan[0] ||
                player1 == permainan[1] && player2 == permainan[2]
            ) {
                print("Pemain 2 Menang")
            } else if (
                player1 == permainan[0] && player2 == permainan[2] ||
                player2 == permainan[2] && player2 == permainan[1] ||
                player1 == permainan[1] && player2 == permainan[0]
            ) {
                println("Pemain 1 menang")

            } else {
                println(" Hasil DRAW")
            }
        println(output)


    }
}