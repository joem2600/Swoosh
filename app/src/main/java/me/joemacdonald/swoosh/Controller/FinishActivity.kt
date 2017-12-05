package me.joemacdonald.swoosh.Controller

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import me.joemacdonald.swoosh.Model.Player
import me.joemacdonald.swoosh.R
import me.joemacdonald.swoosh.Utilities.EXTRA_PLAYER

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} league near you"

    }
}
