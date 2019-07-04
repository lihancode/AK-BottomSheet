package com.lee.bottomsheet

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val bottomSheet = BottomSheetBehavior.from(bottom_sheet)
        fab.setOnClickListener { view ->
            if (bottomSheet.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheet.setState(BottomSheetBehavior.STATE_EXPANDED);
            } else {
                bottomSheet.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }

        }
        payButton.setOnClickListener {
            bottomSheet.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
