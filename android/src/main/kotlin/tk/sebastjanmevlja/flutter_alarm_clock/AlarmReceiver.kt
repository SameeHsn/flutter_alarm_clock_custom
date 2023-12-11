package android.src.main.kotlin.tk.sebastjanmevlja.flutter_alarm_clock

import android.appwidget.AppWidgetManager
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
  @Override
  fun onReceive(context: Context?, intent: Intent?) {
    android.util.Log.d("TAG", "onReceive Alarm: this is  clled when  alarm rings q23123")
    Toast.makeText(context, "Alarm is ringing!", Toast.LENGTH_LONG).show()
  }
}