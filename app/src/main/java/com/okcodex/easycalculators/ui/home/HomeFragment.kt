package com.okcodex.easycalculators.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.okcodex.easycalculators.adapters.ItemAdapter
import com.okcodex.easycalculators.models.Model
import com.okcodex.easycalculators.R

class HomeFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView
    var list: ArrayList<Model> = ArrayList<Model>()


    private lateinit var relativeLayout1: RelativeLayout

    private lateinit  var relativeLayout2:RelativeLayout
    private lateinit  var relativeLayout3:RelativeLayout
    private lateinit  var relativeLayout4:RelativeLayout

    private lateinit var linunit: LinearLayout
    private lateinit  var lintools:LinearLayout
    private lateinit  var lincalculator:LinearLayout
    private lateinit  var linsize:LinearLayout



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = root.findViewById(R.id.recyID)
        linunit = root.findViewById(R.id.linunitID)
        lintools = root.findViewById(R.id.lintoolsID)
        lincalculator = root.findViewById(R.id.lincalculatorId)
        linsize = root.findViewById(R.id.linsizeID)


        val model = Model(R.drawable.ageimage, "Age \nCalculator")
        val model2 = Model(R.drawable.weight, "Weight")
        val model3 = Model(R.drawable.length, "Length")
        val model4 = Model(R.drawable.tip, "Tip \nCalculator")
        val model5 = Model(R.drawable.bmi, "BMI")
        val model6 = Model(R.drawable.speed, "Speed")
        val model7 = Model(R.drawable.location, "Area")
        val model8 = Model(R.drawable.solarenergy, "Energy")

        list.add(model)
        list.add(model2)
        list.add(model3)
        list.add(model4)
        list.add(model5)
        list.add(model6)
        list.add(model7)
        list.add(model8)

        val adapter = ItemAdapter(context, list)
        recyclerView.setHasFixedSize(true)
        val layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter





        relativeLayout1 = root.findViewById(R.id.rel1)
        relativeLayout2 = root.findViewById(R.id.rel2)
        relativeLayout3 = root.findViewById(R.id.rel3)
        relativeLayout4 = root.findViewById(R.id.rel4)


        relativeLayout1.setOnClickListener{
            relativeLayout1.background =resources.getDrawable(R.drawable.circle_bg)
            relativeLayout2.background = resources.getDrawable(R.drawable.circle_bg6)
            relativeLayout3.background = resources.getDrawable(R.drawable.circle_bg7)
            relativeLayout4.background = resources.getDrawable(R.drawable.circle_bg8)
            linunit.visibility = View.VISIBLE
            lintools.visibility = View.GONE
            lincalculator.visibility = View.GONE
            linsize.visibility = View.GONE
        }


        relativeLayout2.setOnClickListener{
            relativeLayout1.background = resources.getDrawable(R.drawable.circle_bg5)
            relativeLayout2.background = resources.getDrawable(R.drawable.circle_bg2)
            relativeLayout3.background = resources.getDrawable(R.drawable.circle_bg7)
            relativeLayout4.background = resources.getDrawable(R.drawable.circle_bg8)
            linunit.visibility = View.GONE
            lintools.visibility = View.VISIBLE
            lincalculator.visibility = View.GONE
            linsize.visibility = View.GONE
        }


        relativeLayout3.setOnClickListener {
            relativeLayout1.background = resources.getDrawable(R.drawable.circle_bg5)
            relativeLayout2.background = resources.getDrawable(R.drawable.circle_bg6)
            relativeLayout3.background = resources.getDrawable(R.drawable.circle_bg3)
            relativeLayout4.background = resources.getDrawable(R.drawable.circle_bg8)
            linunit.visibility = View.GONE
            lintools.visibility = View.GONE
            lincalculator.visibility = View.VISIBLE
            linsize.visibility = View.GONE
        }


        relativeLayout4.setOnClickListener{
            relativeLayout1.background = resources.getDrawable(R.drawable.circle_bg5)
            relativeLayout2.background = resources.getDrawable(R.drawable.circle_bg6)
            relativeLayout3.background = resources.getDrawable(R.drawable.circle_bg7)
            relativeLayout4.background = resources.getDrawable(R.drawable.circle_bg4)
            linunit.visibility = View.GONE
            lintools.visibility = View.GONE
            lincalculator.visibility = View.GONE
            linsize.visibility = View.VISIBLE

        }





        return root
    }



}

