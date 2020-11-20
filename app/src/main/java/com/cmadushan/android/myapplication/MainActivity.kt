package com.cmadushan.android.myapplication

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
private var view:View?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            run {
                Snackbar.make(it, getString(R.string.fab_message), Snackbar.LENGTH_LONG)
                        .show()
            }

        }
         view = findViewById(android.R.id.content)
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
            R.id.action_settings ->{
                view?.let {
                    Snackbar.make(it,getString(R.string.settings_option),Snackbar.LENGTH_SHORT)
                            .show()
                }
                //toast message
                Toast.makeText(applicationContext,getString(R.string.settings_option),Toast.LENGTH_SHORT).show()
                true
            }
            
            R.id.action_exit->{
                view?.let {
                    Snackbar.make(it,getString(R.string.exit_option),Snackbar.LENGTH_SHORT)
                            .show()
                }
                //toast message
                Toast.makeText(applicationContext,getString(R.string.exit_option),Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


}