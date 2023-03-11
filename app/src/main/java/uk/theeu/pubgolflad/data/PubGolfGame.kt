package uk.theeu.pubgolflad.data

import java.util.*

class PubGolfGame (val createdAt: Date, var lastUpdated: Date, val rounds: MutableList<PubGolfRound> = mutableListOf()) {
}