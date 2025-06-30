package com.example.duappvcis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val locateColleges = findViewById<Button>(R.id.locateColleges)
        val aboutDU = findViewById<Button>(R.id.aboutDU)
        val coursesOffered = findViewById<Button>(R.id.coursesOffered)
        val colDept = findViewById<Button>(R.id.colDept)

        locateColleges.setOnClickListener {
            openInBrowser("https://www.du.ac.in/index.php?page=colleges-at-du")
        }

        aboutDU.setOnClickListener {
            openInBrowser("https://www.du.ac.in/index.php?page=about-du-2")
        }

        coursesOffered.setOnClickListener {
            openInBrowser("https://www.du.ac.in/index.php?page=syllabi")
        }

        colDept.setOnClickListener {
            openInBrowser("https://www.du.ac.in/index.php?page=departments-2")
        }
    }

    private fun openInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        // Make sure there's a browser available
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
