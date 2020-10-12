package com.example.myapplication2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.androidbolts.topsheet.TopSheetBehavior
import com.orhanobut.dialogplus.DialogPlus
import com.orhanobut.dialogplus.OnItemClickListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        init()



    }

    fun init()
    {
        lateinit var button: Button
        lateinit var topSheetBehavior: TopSheetBehavior<View>

        topSheetBehavior = TopSheetBehavior.from(topSheetContainer)
        button = findViewById(R.id.btn_open_top_sheet)

        button.setOnClickListener {

            topSheetBehavior.state = TopSheetBehavior.STATE_EXPANDED
            topSheetBehavior.setTopSheetCallback(object : TopSheetBehavior.TopSheetCallback() {
                override fun onSlide(bottomSheet: View, slideOffset: Float, isOpening: Boolean?) {

                }

                override fun onStateChanged(bottomSheet: View, newState: Int) {
                }
            })

        }

    }

}