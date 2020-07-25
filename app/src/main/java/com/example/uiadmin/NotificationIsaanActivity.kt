package com.example.uiadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_isaan.*

class NotificationIsaanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_isaan)
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val record = ArrayList<Isaan>()
        record.add(Isaan("Puk Gy","จากกรณีเมื่อช่วงเวลาประมาณ 18.00 น.ที่ผ่านมาเกิดเหตุเพลิงลุกไหม้ เรือซีลวอล์คเกอร์ แสงอรุณ ไดร์ฟวิ่ง พานักท่องเที่ยวดำน้ำ ที่บริเวณกลางทะเล ใกล้หาดตายาย พื้นที่เกาะล้าน สร้างความเสียหายอย่างหนัก"))
        record.add(Isaan("Nam Wara","ล่าสุดเมื่อเวลา 20.00 น. ทางทะเลเมืองพัทยา ได้เปิดเผยว่าเหตุการณ์ดังกล่าวไม่มีผู้บาดเจ็บแต่อย่างใด "))
        record.add(Isaan("Nam Wara","ล่าสุดเมื่อเวลา 20.00 น. ทางทะเลเมืองพัทยา ได้เปิดเผยว่าเหตุการณ์ดังกล่าวไม่มีผู้บาดเจ็บแต่อย่างใด "))
        record.add(Isaan("Nam Wara","ล่าสุดเมื่อเวลา 20.00 น. ทางทะเลเมืองพัทยา ได้เปิดเผยว่าเหตุการณ์ดังกล่าวไม่มีผู้บาดเจ็บแต่อย่างใด "))
        record.add(Isaan("Nam Wara","ล่าสุดเมื่อเวลา 20.00 น. ทางทะเลเมืองพัทยา ได้เปิดเผยว่าเหตุการณ์ดังกล่าวไม่มีผู้บาดเจ็บแต่อย่างใด "))

        val adapter = IsaanAdapter(record)
        recyclerView.adapter = adapter


    }
}