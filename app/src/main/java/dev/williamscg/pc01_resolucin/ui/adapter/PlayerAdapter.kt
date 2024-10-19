package dev.williamscg.pc01_resolucin.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.williamscg.pc01_resolucin.R
import dev.williamscg.pc01_resolucin.ui.model.PlayerModel

class PlayerAdapter(private var lstPlayer: List<PlayerModel>) :
    RecyclerView.Adapter<PlayerAdapter.ViewHolder>(){
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val tvName = itemView.findViewById<TextView>(R.id.tvName)
            val tvAnio = itemView.findViewById<TextView>(R.id.tvAnio)
            val tvEdad = itemView.findViewById<TextView>(R.id.tvEdad)
            val ivPlayer: ImageView = itemView.findViewById(R.id.ivPlayer)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater =LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_player, parent, false))
    }
    override fun getItemCount(): Int {
        return lstPlayer.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemPlayer = lstPlayer[position]
        holder.ivPlayer.setImageResource(itemPlayer.image)
        holder.tvName.text = itemPlayer.name
        holder.tvAnio.text = itemPlayer.year
        holder.tvEdad.text = itemPlayer.age
    }
}