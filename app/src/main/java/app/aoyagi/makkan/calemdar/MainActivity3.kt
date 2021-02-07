package app.aoyagi.makkan.calemdar

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    private lateinit var dataStore: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //textViewというidのtextView変数を宣言する
        val textView = findViewById<TextView>(R.id.textView)
        //画面遷移で持ってきたデータの読み込み、dateをキーにして呼び出してtextという変数に格納する
        val text = intent.getStringExtra("date")
        //SharedPreferencesのインスタンスを生成する
        dataStore = getSharedPreferences("Datastore", Context.MODE_PRIVATE)
        //SharedPreferencesからさっき作ったtextをキーとしてデータを呼び出してreadという変数に格納
        val read = dataStore.getString(text,"NoData")
        //textViewにreadの中身をテキストとしてセットする
        textView.text = read
    }

    fun save(v: View) {
        //画面遷移で持ってきたデータの読み込み、dateをキーにして呼び出してtextという変数に格納する
        val text = intent.getStringExtra("date")
        //変数stringにエディットテキストに入力されているテキストの中身を格納する
        val string = editText.text.toString()
        //SharedPreferencesに値を収納する為のコード
        val editor = dataStore.edit()
        //SharedPreferencesにtextをキーとしてstring変数を格納する
        editor.putString(text, string)
        //変更を適用する
        editor.apply()
    }
}