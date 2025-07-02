package com.example.duappvcis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          val du_web_btn = findViewById<Button>(R.id.du_web_btn)
          val about_du_btn = findViewById<Button>(R.id.about_du_btn)
          val du_lib_btn = findViewById<Button>(R.id.du_lib_btn)
          val du_amenities_btn = findViewById<Button>(R.id.du_amenities_btn)
          val campus_map = findViewById<Button>(R.id.campus_map)
          val syllabi_btn = findViewById<Button>(R.id.syllabi_btn)
//        val locateColleges = findViewById<Button>(R.id.locateColleges)
//        val aboutDU = findViewById<Button>(R.id.aboutDU)
//        val coursesOffered = findViewById<Button>(R.id.coursesOffered)
//        val colDept = findViewById<Button>(R.id.colDept)


          du_web_btn.setOnClickListener {
              openInBrowser("https://www.du.ac.in/")
          }
          about_du_btn.setOnClickListener {
              openInBrowser("https://www.du.ac.in/uploads/duflyer2023/DU-CENTENARY_Brochure_1.pdf")
          }
          du_lib_btn.setOnClickListener {
              openInBrowser("https://www.du.ac.in/index.php?page=du-library-system")
          }
          du_amenities_btn.setOnClickListener {
              openInBrowser("https://www.du.ac.in/index.php?page=Amenities-2")
          }
          campus_map.setOnClickListener {
              openInBrowser("https://www.du.ac.in/uploads/du_map.jpg")
          }
          syllabi_btn.setOnClickListener {
              openInBrowser("https://www.du.ac.in/index.php?page=nep-ugcf-2022-syllabi")
          }
//        locateColleges.setOnClickListener {
//            openInBrowser("https://www.du.ac.in/index.php?page=colleges-at-du")
//        }
//
//        aboutDU.setOnClickListener {
//            openInBrowser("https://www.du.ac.in/index.php?page=about-du-2")
//        }
//
//        coursesOffered.setOnClickListener {
//            openInBrowser("https://www.du.ac.in/index.php?page=syllabi")
//        }
//
//        colDept.setOnClickListener {
//            openInBrowser("https://www.du.ac.in/index.php?page=departments-2")
//        }
    }

    private fun openInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, url.toUri())
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "No browser found to open this link", Toast.LENGTH_SHORT).show()
        }
    }
}