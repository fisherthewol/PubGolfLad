package uk.theeu.pubgolflad.data

import java.util.*

class PubGolfGame (val createdAt: Date, var lastUpdated: Date, val title: String, val rounds: MutableList<PubGolfRound> = mutableListOf()) {
}