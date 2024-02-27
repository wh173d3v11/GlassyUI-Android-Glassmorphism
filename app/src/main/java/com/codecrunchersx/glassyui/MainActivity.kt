package com.codecrunchersx.glassyui

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.hoko.blur.HokoBlur


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.bgRoot)
        val bm = (imageView.drawable as BitmapDrawable).bitmap
        val outBitmap: Bitmap = HokoBlur.with(this).radius(12).blur(bm)
        imageView.setImageBitmap(outBitmap)
    }
}