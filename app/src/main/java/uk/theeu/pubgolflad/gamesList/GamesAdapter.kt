package uk.theeu.pubgolflad.gamesList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uk.theeu.pubgolflad.R
import uk.theeu.pubgolflad.data.PubGolfGameRepository

class GamesAdapter(private val games: PubGolfGameRepository): RecyclerView.Adapter<GamesAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val gametitle: TextView
        init {
            gametitle = view.findViewById(R.id.game_title)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.games_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.gametitle.text = games.games.getOrNull(position)?.title ?: "No Title!"
    }

    override fun getItemCount(): Int = games.games.size
}