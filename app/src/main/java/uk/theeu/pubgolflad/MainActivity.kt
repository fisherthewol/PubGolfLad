package uk.theeu.pubgolflad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_page_top_app_bar, menu)
        return true
    }
}