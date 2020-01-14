package com.example.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.example.menu.GlobalVariable.gDescription
import com.example.menu.databinding.FragmentGarbageListViewBinding

/**
 * A simple [Fragment] subclass.
 */
class GarbageListView : Fragment() {

    lateinit var listView: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGarbageListViewBinding>(inflater,
            R.layout.fragment_garbage_list_view,container,false)

        listView = binding.root.findViewById(R.id.listView)

        if(gDescription == "Hazardous")
        {
            var list = mutableListOf<Model>()

            list.add(Model(getString(R.string.battery), getString(R.string.hazardous), R.drawable.battery))
            list.add(Model(getString(R.string.bandaid),  getString(R.string.hazardous), R.drawable.bandaid))
            list.add(Model(getString(R.string.expiredcosmetic),  getString(R.string.hazardous), R.drawable.expired_cosmetic))
            list.add(Model(getString(R.string.expiredcapsuledrug),  getString(R.string.hazardous), R.drawable.expired_capsule_drug))
            list.add(Model(getString(R.string.gastank),  getString(R.string.hazardous), R.drawable.gas))
            list.add(Model(getString(R.string.lighter),  getString(R.string.hazardous), R.drawable.lighter))
            list.add(Model(getString(R.string.medicalgauze),  getString(R.string.hazardous), R.drawable.medical_gauze))
            list.add(Model(getString(R.string.chemical),  getString(R.string.hazardous), R.drawable.chemical))
            list.add(Model(getString(R.string.hairgel), getString(R.string.hazardous), R.drawable.hairgel))
            list.add(Model(getString(R.string.lightbulb),  getString(R.string.hazardous), R.drawable.lightbulb))
            list.add(Model(getString(R.string.medicalglove),  getString(R.string.hazardous), R.drawable.medicalglove))
            list.add(Model(getString(R.string.nailpolish),  getString(R.string.hazardous), R.drawable.nailpolish))
            list.add(Model(getString(R.string.paint),  getString(R.string.hazardous), R.drawable.paint))
            list.add(Model(getString(R.string.perfumebottle),  getString(R.string.hazardous), R.drawable.perfume_bottle))
            list.add(Model(getString(R.string.pesticidebottle), getString(R.string.hazardous), R.drawable.pesticide_bottle))

            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, list)

        }
        else if(gDescription == "Household Waste") {
            var listHHW = mutableListOf<Model>()

            listHHW.add(Model(getString(R.string.apple), getString(R.string.householdwaste), R.drawable.apple))
            listHHW.add(Model(getString(R.string.bread), getString(R.string.householdwaste), R.drawable.bread))
            listHHW.add(Model(getString(R.string.cake), getString(R.string.householdwaste), R.drawable.cake))
            listHHW.add(Model(getString(R.string.chili), getString(R.string.householdwaste), R.drawable.chilli))
            listHHW.add(Model(getString(R.string.chocolate), getString(R.string.householdwaste), R.drawable.chocolate))
            listHHW.add(Model(getString(R.string.corn), getString(R.string.householdwaste), R.drawable.corn))
            listHHW.add(Model(getString(R.string.crab), getString(R.string.householdwaste), R.drawable.crab))
            listHHW.add(Model(getString(R.string.dryleaf), getString(R.string.householdwaste), R.drawable.dryleaf))
            listHHW.add(Model(getString(R.string.eggshell), getString(R.string.householdwaste), R.drawable.eggshell))
            listHHW.add(Model(getString(R.string.fishbone), getString(R.string.householdwaste), R.drawable.fishbone))
            listHHW.add(Model(getString(R.string.shrimp), getString(R.string.householdwaste), R.drawable.shrimp))
            listHHW.add(Model(getString(R.string.strawberry), getString(R.string.householdwaste), R.drawable.strawberry))
            listHHW.add(Model(getString(R.string.tomatosauce), getString(R.string.householdwaste), R.drawable.tomatosauce))
            listHHW.add(Model(getString(R.string.vegetable), getString(R.string.householdwaste), R.drawable.vegetable))
            listHHW.add(Model(getString(R.string.watermelon), getString(R.string.householdwaste), R.drawable.watermelon))

            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, listHHW)

        }
        else if(gDescription =="Recyclable Waste") {
            var listRCW = mutableListOf<Model>()

            listRCW.add(Model(getString(R.string.bag), getString(R.string.recyclablewaste), R.drawable.bag))
            listRCW.add(Model(getString(R.string.cap), getString(R.string.recyclablewaste), R.drawable.cap))
            listRCW.add(Model(getString(R.string.glassbottle), getString(R.string.recyclablewaste), R.drawable.glassbottle))
            listRCW.add(Model(getString(R.string.handbag), getString(R.string.recyclablewaste), R.drawable.handbag))
            listRCW.add(Model(getString(R.string.lockpad), getString(R.string.recyclablewaste), R.drawable.lockpad))
            listRCW.add(Model(getString(R.string.milkbox), getString(R.string.recyclablewaste), R.drawable.milkbox))
            listRCW.add(Model(getString(R.string.mirror), getString(R.string.recyclablewaste), R.drawable.mirror))
            listRCW.add(Model(getString(R.string.plasticbottle), getString(R.string.recyclablewaste), R.drawable.plasticbottle))
            listRCW.add(Model(getString(R.string.plasticcomb), getString(R.string.recyclablewaste), R.drawable.plasticcomb))
            listRCW.add(Model(getString(R.string.safetypin), getString(R.string.recyclablewaste), R.drawable.safetypin))
            listRCW.add(Model(getString(R.string.shoe), getString(R.string.recyclablewaste), R.drawable.shoe))
            listRCW.add(Model(getString(R.string.tin), getString(R.string.recyclablewaste), R.drawable.tin))
            listRCW.add(Model(getString(R.string.toothpaste), getString(R.string.recyclablewaste), R.drawable.toothpaste))
            listRCW.add(Model(getString(R.string.toys), getString(R.string.recyclablewaste), R.drawable.toys))


            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, listRCW)

        }
        else if(gDescription == "Residual Waste")
        {
            var listRSW = mutableListOf<Model>()

            listRSW.add(Model(getString(R.string.basketball), getString(R.string.residualwaste), R.drawable.basketball))
            listRSW.add(Model(getString(R.string.woodencomb),  getString(R.string.residualwaste), R.drawable.woodencomb))
            listRSW.add(Model(getString(R.string.bowl),  getString(R.string.residualwaste), R.drawable.bowl))
            listRSW.add(Model(getString(R.string.broom),  getString(R.string.residualwaste), R.drawable.broom))
            listRSW.add(Model(getString(R.string.chopstick),  getString(R.string.residualwaste), R.drawable.chopstick))
            listRSW.add(Model(getString(R.string.cigarette),  getString(R.string.residualwaste), R.drawable.cigarette))
            listRSW.add(Model(getString(R.string.cloths),  getString(R.string.residualwaste), R.drawable.cloths))
            listRSW.add(Model(getString(R.string.cup),  getString(R.string.residualwaste), R.drawable.cup))
            listRSW.add(Model(getString(R.string.flowerpot),  getString(R.string.residualwaste), R.drawable.flowerpot))
            listRSW.add(Model(getString(R.string.peanut),  getString(R.string.residualwaste), R.drawable.peanut))
            listRSW.add(Model(getString(R.string.roottiles),  getString(R.string.residualwaste), R.drawable.rooftiles))
            listRSW.add(Model(getString(R.string.seashell),  getString(R.string.residualwaste), R.drawable.seashell))
            listRSW.add(Model(getString(R.string.sponge),  getString(R.string.residualwaste), R.drawable.sponge))
            listRSW.add(Model(getString(R.string.toiletbowl),  getString(R.string.residualwaste), R.drawable.toiletbowl))
            listRSW.add(Model(getString(R.string.toiletpaper),  getString(R.string.residualwaste), R.drawable.toiletpaper))

            listView.adapter = MyListAdapter(binding.root.context, R.layout.show_list_item, listRSW)
        }

        return binding.root
    }


}
