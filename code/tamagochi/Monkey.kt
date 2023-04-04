package code.tamagochi

class Monkey (tamagochiName : String) : Tamagochi(tamagochiName) {
    override
    fun deathOfTamagochi() {
        for (i in 1..20) println() // оступ для красоты
        println("               ',\n" +
                "            .-`-,\\__\n" +
                "              .\"`   `,\n" +
                "            .'_.  ._  `;.\n" +
                "        __ / `      `  `.\\ .--.\n" +
                "       /--,|  X    X     )`_.-,)\n" +
                "      |    ;.-----.__ _-');   /\n" +
                "       '--./         `.`/  `\"`\n" +
                "          :   '`      |.      \n" +
                "          |   ,---,   //         \n" +
                "           \\ /     \\ /'        \n" +
                "            `------' \\  \n" +
                "             _/       `--..."
        )
        printInterface()
        println(
            """             
                |
                |
                |             GAME OVER
                |""".trimMargin()
        )
        alive = false
    }

    override
    fun happinessCheck() {
        if ((happiness >= 7) && (satiety >= 7) && (health >= 7))
            println("               ',\n" +
                    "            .-`-,\\__\n" +
                    "              .\"`   `,\n" +
                    "            .'_.  ._  `;.\n" +
                    "        __ / `      `  `.\\ .--.\n" +
                    "       /--,| 0)   0)     )`_.-,)\n" +
                    "      |    ;.-----.__ _-');   /\n" +
                    "       '--./         `.`/  `\"`\n" +
                    "          :   '`      |.      \n" +
                    "          | \\     /  //         \n" +
                    "           \\ '---'  /'        \n" +
                    "            `------' \\  \n" +
                    "             _/       `--..."
            )
        else if ((happiness < 4) || (satiety < 4) || (health < 4))
//            println("             (ಥ﹏ಥ)") (┳Д┳)

            println("               ',\n" +
                    "            .-`-,\\__\n" +
                    "              .\"`   `,\n" +
                    "            .'_.  ._  `;.\n" +
                    "        __ / `      `  `.\\ .--.\n" +
                    "       /--,|  T    T     )`_.-,)\n" +
                    "      |    ;.-----.__ _-');   /\n" +
                    "       '--./         `.`/  `\"`\n" +
                    "          :   '`      |.      \n" +
                    "          |   ,---,   //         \n" +
                    "           \\ /     \\ /'        \n" +
                    "            `------' \\  \n" +
                    "             _/       `--..."
            )
        else if ((happiness < 7) || (satiety < 7) || (health < 7))
            println("               ',\n" +
                    "            .-`-,\\__\n" +
                    "              .\"`   `,\n" +
                    "            .'_.  ._  `;.\n" +
                    "        __ / `      `  `.\\ .--.\n" +
                    "       /--,|  ︶    ︶     )`_.-,)\n" +
                    "      |    ;.-----.__ _-');   /\n" +
                    "       '--./         `.`/  `\"`\n" +
                    "          :   '`      |.      \n" +
                    "          |           //         \n" +
                    "           \\ ,---,  /'        \n" +
                    "            `------' \\  \n" +
                    "             _/       `--..."
            )
    }
}