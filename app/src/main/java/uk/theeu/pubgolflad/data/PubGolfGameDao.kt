package uk.theeu.pubgolflad.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface PubGolfGameDao {
    @Query("SELECT * FROM PubGolfGame")
    fun getAll(): MutableList<PubGolfGame>
}