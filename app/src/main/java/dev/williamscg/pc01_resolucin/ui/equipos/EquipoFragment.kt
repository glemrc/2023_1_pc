package dev.williamscg.pc01_resolucin.ui.equipos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import dev.williamscg.pc01_resolucin.R


class EquipoFragment : Fragment() {
    var arrSO = arrayOf(
        "Manchester United","Barcelona FC", "Liverpool", "Real Madrid","Juventus","Pumas UNAM","Universitario de Deportes",
        "Flamengo","River Plate","Boca Juniors"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_equipo, container, false)

        val lstEquipos : ListView = view.findViewById(R.id.lstEquipos)

        val adaptador = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,arrSO)

        lstEquipos.adapter = adaptador
        return view
    }
}