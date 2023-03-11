package uk.theeu.pubgolflad.gamesList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uk.theeu.pubgolflad.R

class GamesAdapter: RecyclerView.Adapter<GamesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.games_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GamesAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}