package module14.practical_work_13

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.takeWhile


class Player(val namePlayer: String, private val numCards: Int) {
    var goOn: Boolean = true
    var cards = mutableListOf<LottoCard>()


    fun getCards() {
        for (i in 0 until numCards) {
            println("$namePlayer")
            cards.add(LottoCard())
            cards[i].fillCard()
        }

    }

    suspend fun collectNumbers(): String {
        var result = ""
        Host.sharedFlow
            .takeWhile { goOn }
            .collect {
                //print(" $it ")
                if (it <= 90) {
                    for (i in 0 until numCards)
                        if (cards[i].checkCard(it)) {
                            Host.stopPlay = 200
                            result = namePlayer
                            //goOn = false
                            break
                        }
                } else goOn = false
            }
        return result

    }
}