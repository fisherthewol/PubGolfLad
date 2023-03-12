package uk.theeu.pubgolflad.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PubGolfRound(
    @PrimaryKey val uid: Int,
    val pub: String,
    val drink: String,
    val par: Float,
    var score: Float?
)