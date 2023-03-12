package uk.theeu.pubgolflad.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class PubGolfGame (
    @PrimaryKey val uid: Int,
    @ColumnInfo(name="createdAt") val createdAt: Date,
    @ColumnInfo(name="lastUpdated") var lastUpdated: Date,
    @ColumnInfo val title: String,
)