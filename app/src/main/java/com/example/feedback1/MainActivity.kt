package com.example.feedback1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Ejercicio Feedback UD 3
        Se propone realizar las siguientes apps utilizando lo aprendido en la unidad.
        1. Realizar una app que reproduzca un vídeo, usando para ello el
        componente VideoView.
        2. Realizar una app que grabe audio. La interfaz debe tener al
        menos dos botones: uno para iniciar la grabación y otro para parar.*/
        var mediaPlayer= findViewById<VideoView>(R.id.video)
        //var videoPath= Uri.parse("https://youtu.be/z0AJK9kcYTU?si=rK1J9nSuewHszPyj")
        var videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video
        var videoUri:Uri= Uri.parse(videoPath)
        mediaPlayer.setVideoURI(videoUri)
        mediaPlayer.start()

    }
}