package com.yzh.learnandroid.bottomnavigation.ui.airplane

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.yzh.learnandroid.R
import kotlinx.android.synthetic.main.fragment_airplane.*

/**
 * Created by YZH on 2020/9/2.
 * From the BaoBao project
 * @author YZH
 */
class AirplaneFragment : Fragment() {

    private lateinit var airplaneViewModel: AirplaneViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        airplaneViewModel = ViewModelProvider(this).get(AirplaneViewModel::class.java)
        return inflater.inflate(R.layout.fragment_airplane, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        airplaneViewModel.text.observe(viewLifecycleOwner, { text_airplane.text = it })
    }

}