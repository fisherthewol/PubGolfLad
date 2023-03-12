package uk.theeu.pubgolflad.data

import androidx.room.Embedded
import androidx.room.Relation

data class GameWithRounds(
    @Embedded val game: PubGolfGame,
    @Relation(
        parentColumn = "uid",
        entityColumn = "gameId",
    )
    val rounds: MutableList<PubGolfRound>
)