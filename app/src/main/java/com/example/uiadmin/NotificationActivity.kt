package com.example.uiadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_notification.*

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val type = arrayOf("กรุงเทพมหานคร",
                "กาญจนบุรี\n" ,
                "ฉะเชิงเทรา\n" ,
                "ชัยนาท\n" ,
                "นครนายก\n",
                "นครปฐม\n" ,
                "นนทบุรี\n" ,
                "ปทุมธานี\n" ,
                "ประจวบคีรีขันธ์\n" ,
                "พระนครศรีอยุธยา\n" ,
                "ราชบุรี\n" ,
                "ลพบุรี\n" ,
                "สมุทรปราการ\n" ,
                "สมุทรสงคราม\n" ,
                "สมุทรสาคร\n" ,
                "สระบุรี\n" ,
                "สิงห์บุรี\n" ,
                "สุพรรณบุรี\n" ,
                "อ่างทอง\n" ,
                "เพชรบุรี\n")
        val arrayAdapter1 = ArrayAdapter(this,android.R.layout.simple_spinner_item,type)
        //atatched arrayadapter to spinner
        spinner.adapter = arrayAdapter1
    }
}