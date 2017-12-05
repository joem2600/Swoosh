package me.joemacdonald.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import me.joemacdonald.swoosh.Model.Player
import me.joemacdonald.swoosh.R
import me.joemacdonald.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    var player : Player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {

        if (player.league != "")
        {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Choose a league", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensClicked(view: View) {

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"

    }

    fun onWomensClicked(view: View) {

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"

    }

    fun onCoedClicked(view: View) {

        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "coed"

    }


}
