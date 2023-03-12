package uk.theeu.pubgolflad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import uk.theeu.pubgolflad.data.PubGolfGameRepository
import uk.theeu.pubgolflad.data.getGames
import uk.theeu.pubgolflad.gamesList.GamesAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Handle top bar*/
        setSupportActionBar(findViewById(R.id.top_app_bar))
        (findViewById<MaterialToolbar>(R.id.top_app_bar)).setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.top_bar_settings -> {
                    Log.d("top_app_bar","Settings Pressed")
                    true
                }
                else -> {false}
            }
        }
        /* Instantiate RecyclerView*/
        val recyclerView: RecyclerView = findViewById(R.id.game_list_recycler)
        val Repository: PubGolfGameRepository = PubGolfGameRepository(getGames())
        recyclerView.adapter = GamesAdapter(Repository)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_page_top_app_bar, menu)
        return true
    }
}