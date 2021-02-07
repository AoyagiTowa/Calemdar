package app.aoyagi.makkan.calemdar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarview = CalendarView(this)
        calendarview.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.container)
        constraintLayout.addView(calendarview)

        val format = SimpleDateFormat("yyyy/MM/dd", Locale.US)


        // 初期選択日を取得
        val defaultDate = calendarview.date

        calendarview.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val intent = Intent(this, MainActivity3::class.java)
            val date = "$year/$month/$dayOfMonth"
            intent.putExtra("date",date)
            startActivity(intent)

        }

    }
}