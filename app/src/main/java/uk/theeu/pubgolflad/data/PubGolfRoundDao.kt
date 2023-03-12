package uk.theeu.pubgolflad.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PubGolfRoundDao {
    @Query("SELECT * FROM PubGolfRound")
    fun getAll(): List<PubGolfRound>

    @Query("SELECT * FROM PubGolfRound WHERE uid == :id")
    fun getById(id: Int): PubGolfRound

    @Insert
    fun insertAll(vararg rounds: PubGolfRound)

    @Delete
    fun delete(round: PubGolfRound)
}