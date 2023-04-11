// 10 April,
// 10120902 Dina Sri Hartini,
// IF10K
package com.example.a10120902latihan1


import android.os.Bundle
import android.view.WindowManager
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(R.layout.activity_main)

        val colors = listOf("#70CD94", "#008444", "#008444", "#008444", "#008444", "#008444", "#1FB767", "#70CD94", "#70CD94", "#008444", "#008444", "#008444", "#C3E9D0", "#008444", "#C3E9D0", "#008444", "#1FB767", "#C3E9D0", "#9BDBB3", "#16A75C", "#9BDBB3", "#9BDBB3", "#9BDBB3", "#16A75C", "#16A75C", "#008444", "#16A75C", "#16A75C", "#16A75C", "#9BDBB3", "#9BDBB3")

        val colorsApril = listOf("#16A75C", "#069550", "#069550", "#70CD94", "#70CD94", "#16A75C", "#70CD94", "#069550", "#70CD94", "#16A75C", "#9BDBB3", "#069550", "#16A75C", "#70CD94", "#70CD94", "#16A75C", "#70CD94", "#70CD94", "#70CD94", "#16A75C", "#069550", "#F5F5F5", "#F5F5F5", "#F5F5F5", "#F5F5F5", "#F5F5F5", "#F5F5F5", "#F5F5F5", "#F5F5F5", "#F5F5F5")

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = ColorAdapter(colors)
        gridView.adapter = adapter

        val gridView2 = findViewById<GridView>(R.id.gridView2)
        val adapterApril = ColorAdapter(colorsApril)
        gridView2.adapter = adapterApril
    }
}