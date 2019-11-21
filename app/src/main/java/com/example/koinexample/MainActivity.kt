package com.example.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.koinexample.viewmodels.LoginViewmodel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val viewmodel: LoginViewmodel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mainactivity", "oncreate")
        val viewmodelData = viewmodel.getLoginDetails()
        Log.i("mainactivity", viewmodelData)
    }

    override fun onStart() {
        super.onStart()
        Log.i("mainactivity", "onstart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mainactivity", "stop")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mainactivity", "pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("mainactivity", "resume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mainactivity", "Restart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mainactivity", "onstop")
    }
}
