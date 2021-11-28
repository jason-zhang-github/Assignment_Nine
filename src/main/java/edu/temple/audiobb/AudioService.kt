package edu.temple.audiobb

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.Handler
import android.os.IBinder
import android.util.Log
import java.io.File

class AudioService : Service()
{
    var paused = false // paused = anytime not playing
    var shouldExit = false
    lateinit var audioHandler : Handler

    inner class AudioBinder : Binder()
    {
        fun playAudio(id: Int)
        {
            play(id)
            paused = false
        }

        fun playAudio(file: File)
        {
            play(file)
            paused = false
        }

        fun playAudio(file : File, position : Int)
        {
            play(file, position)
            paused = false
        }

        fun pauseAudio()
        {
            pause()
            paused = true
        }

        fun stopAudio()
        {
            stop()
            paused = true
        }

        fun setProgressHandler(progressHandler: Handler)
        {

        }

        fun seekAudio(position : Int)
        {
            seekTo(position)
        }

        fun isPlaying() : Boolean
        {
            return paused
        }




    }

}