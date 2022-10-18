package module14.practical_work_13

import kotlinx.coroutines.*

class GamePlay() {
    private val numCards = 2
    private val numPlayers = 3


    private val players = mutableListOf<Player>()

    init {
        for (i in 0 until numPlayers) {
            players.add(Player("Игрок ${(i+1)}", numCards))
            players[i].getCards()
        }
    }


    fun startCollect() {

        runBlocking {
            launch {
                print(players[0].collectNumbers())
            }

            launch {
                print(players[1].collectNumbers())
            }

            launch {
                print(players[2].collectNumbers())
            }
        }
        print(" - выиграл! ")
    }


}

