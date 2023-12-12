package android.src.main.kotlin.tk.sebastjanmevlja.flutter_alarm_clock

import android.appwidget.AppWidgetManager
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.widget.Toast
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.os.Vibrator

class AlarmReceiver: BroadcastReceiver() {

  override fun onReceive(context: Context, intent: Intent?) {
    //we will use vibrator first
    val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    vibrator.vibrate(4000)
    android.util.Log.d("TAG", "onReceive: wake  up wake up")
    Toast.makeText(context, "Alarm! Wake up! Wake up!", Toast.LENGTH_LONG).show()
    var alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
    if (alarmUri == null) {
      alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
    }
    val ringtone = RingtoneManager.getRingtone(context, alarmUri)
    ringtone.play()
  }
}