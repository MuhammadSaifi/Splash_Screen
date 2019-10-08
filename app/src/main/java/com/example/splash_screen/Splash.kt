package com.example.splash_screen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Splash :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        val background = object : Thread(){
            override fun run() {
                try{
                      Thread.sleep(5000)
                    val intent=Intent(baseContext,MainActivity::class.java)
                    startActivity(intent)

                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}