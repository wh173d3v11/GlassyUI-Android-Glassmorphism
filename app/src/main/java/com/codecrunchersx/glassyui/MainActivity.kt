package com.codecrunchersx.glassyui

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hoko.blur.HokoBlur


class MainActivity : AppCompatActivity() {

    companion object {
        init {
            System.loadLibrary("glassyui")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.bgRoot)
        val bm = (imageView.drawable as BitmapDrawable).bitmap
        val outBitmap: Bitmap = HokoBlur.with(this).radius(12).blur(bm)
        imageView.setImageBitmap(outBitmap)

        findViewById<TextView>(R.id.tvGetStartedButton).apply {
            setOnClickListener {
                val key = getApikey()
                Log.d("TAG", "onCreate: key found >> $key")
                Toast.makeText(this@MainActivity, "Key Found", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private external fun getApiKeyFromNdk(): String

    private fun getApikey(): String {
        return getApiKeyFromNdk()
    }
}