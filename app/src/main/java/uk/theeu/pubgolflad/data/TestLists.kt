package uk.theeu.pubgolflad.data

import java.util.*

public fun getGames(): MutableList<PubGolfGame> {
    return mutableListOf(
        PubGolfGame(createdAt = Date(),
            lastUpdated = Date(),
            title = "Test Game 1",
            rounds = getRounds()
        ),
        PubGolfGame(createdAt = Date(),
            lastUpdated = Date(),
            title = "Test Game 2",
            rounds = getRounds()
        ),
    )
}

public fun getRounds(): MutableList<PubGolfRound> {
    return mutableListOf(
        PubGolfRound(
            "Ye Olde Test",
            "Beeer",
            2.5f,
            null,
        ),
        PubGolfRound(
            "Ye Debuggers Delight",
            "Fireball",
            1.0f,
            null,
        ),
    )
}