package edu.temple.audiobb

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.Handler
import android.os.IBinder
import android.util.Log

class AudioService : Service()
{
    var paused = false
    var shouldExit = false
    lateinit var timerHandler : Handler

    inner class AudioBinder : Binder()
    {
        fun playAudio(id: Int)
        {
            play(id : int)
        }
    }

}