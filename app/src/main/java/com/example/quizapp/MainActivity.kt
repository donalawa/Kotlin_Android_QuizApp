package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.WindowCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        To make sure app takes full screen
//        WindowCompat.setDecorFitsSystemWindows(window, true)
        btn_start.setOnClickListener{

            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }else {
//              Moving over to the next activity screen we set an intent the set context to current screen followed by the screen that it will move to
                val intent = Intent(this, QuizQuestionsActivity::class.java)
//              We want to start the intent activity
                startActivity(intent)
//              Then we want to close the current activity because we dont want the user to be able to return here
                finish()
            }
        }

    }
}