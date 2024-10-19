package dev.williamscg.pc01_resolucin.ui.players

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.williamscg.pc01_resolucin.LoginActivity
import dev.williamscg.pc01_resolucin.MainActivity
import dev.williamscg.pc01_resolucin.R
import dev.williamscg.pc01_resolucin.ui.adapter.PlayerAdapter
import dev.williamscg.pc01_resolucin.ui.model.PlayerModel

class ListadoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_listado, container, false)

        val rvPlayers = view.findViewById<RecyclerView>(R.id.rvPlayers)
        val btnRegresar = view.findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
        rvPlayers.layoutManager = LinearLayoutManager(requireContext())
        rvPlayers.adapter = PlayerAdapter(getPlayers())
        return view
    }

    private fun getPlayers(): List<PlayerModel> {
        val lstPlayer: ArrayList<PlayerModel> = ArrayList()
        lstPlayer.add(PlayerModel(1, R.drawable.haland, "2000", "Erling Haaland", "23"))
        lstPlayer.add(PlayerModel(2, R.drawable.jude, "2000", "Jude Bellingham", "23"))
        lstPlayer.add(PlayerModel(3, R.drawable.quispe, "2001", "Piero Quispe", "22"))
        return lstPlayer
    }

}