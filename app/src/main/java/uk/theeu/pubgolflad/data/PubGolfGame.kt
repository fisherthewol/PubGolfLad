package uk.theeu.pubgolflad.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class PubGolfGame (
    @PrimaryKey val uid: Int,
    val createdAt: Date,
    var lastUpdated: Date,
    val title: String,
)