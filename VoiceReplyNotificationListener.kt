package com.voiceReply.app

import android.app.Notification
import android.app.RemoteInput
import android.content.Intent
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.widget.Toast

class VoiceReplyNotificationListener : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        val notification = sbn.notification
        val extras = notification.extras ?: return

        val title = extras.getString(Notification.EXTRA_TITLE) ?: return
        val text = extras.getCharSequence(Notification.EXTRA_TEXT)?.toString() ?: return

        // Detectamos acciones de respuesta disponibles en la notificación.
        val replyAction = notification.actions?.firstOrNull { action ->
            action.remoteInputs?.any { it.allowFreeFormInput } == true
        }

        if (replyAction != null) {
            // V1: dejamos la notificación intacta y mostramos una indicación.
            // La UI avanzada de respuesta se puede ampliar en V1.1.
            Toast.makeText(
                this,
                "VoiceReply detectó: $title\n$text",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    fun sendReply(actionIndex: Int, replyText: String) {
        // Método preparado para RemoteInput.
        // Se utilizará desde la UI de respuesta.
    }
}
