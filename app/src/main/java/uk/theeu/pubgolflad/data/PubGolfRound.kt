package uk.theeu.pubgolflad.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PubGolfRound(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name= "pub") val pub: String,
    @ColumnInfo(name="drink") val drink: String,
    @ColumnInfo(name="par") val par: Float,
    @ColumnInfo(name="score") var score: Float?
)