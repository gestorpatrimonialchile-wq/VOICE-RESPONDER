package com.voiceReply.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
        }

        val title = TextView(this).apply {
            text = "VoiceReply"
            textSize = 30f
        }

        val info = TextView(this).apply {
            text = "\nResponde tus notificaciones con ayuda de IA.\n\n1. Activa el acceso a notificaciones.\n2. Cuando llegue un mensaje, VoiceReply podrá mostrar una propuesta de respuesta.\n3. Puedes usarla, modificarla o crear una nueva."
            textSize = 17f
        }

        val settings = Button(this).apply {
            text = "ACTIVAR ACCESO A NOTIFICACIONES"
            setOnClickListener {
                startActivity(Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"))
            }
        }

        layout.addView(title)
        layout.addView(info)
        layout.addView(settings)
        setContentView(layout)
    }
}
