package me.joemacdonald.swoosh.controller

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import me.joemacdonald.swoosh.R
import me.joemacdonald.swoosh.Utilities.EXTRA_LEAGUE
import me.joemacdonald.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesTxt.text = "Looking for $league $skill league near you"

    }
}
