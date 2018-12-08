package au.com.tangke.tram.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import au.com.tangke.tram.R

class TramActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tram_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, TramFragment.newInstance())
                    .commitNow()
        }
    }

}
