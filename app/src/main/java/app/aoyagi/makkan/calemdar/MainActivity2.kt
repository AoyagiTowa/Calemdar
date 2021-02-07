package app.aoyagi.makkan.calemdar

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

abstract class MainActivity2 : AppCompatActivity() {
    private lateinit var dataStore: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        val textView = findViewById<TextView>(R.id.textView)
//        val text = intent.getStringExtra("date")
//        dataStore = getSharedPreferences("Datastore", Context.MODE_PRIVATE)
//        val read = dataStore.getString(text,"NoData")
//        textView.text = read

    }

    fun save(v: View) {
//        val text = intent.getStringExtra("date")
//        val string = editText.text.toString()
//        val editor = dataStore.edit()
//        editor.putString(text, string)
//        editor.apply()
    }
}