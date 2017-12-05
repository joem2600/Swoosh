package me.joemacdonald.swoosh.Controller


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import me.joemacdonald.swoosh.R
import me.joemacdonald.swoosh.Model.Player
import me.joemacdonald.swoosh.Utilities.EXTRA_PLAYER


class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onNoviceClicked(view: View) {

        intermediateSkillsBtn.isChecked = false
        expertSkillsBtn.isChecked = false

        player.skill = "novice"
    }

    fun onIntermediateClicked(view: View) {

        noviceSkillsBtn.isChecked = false
        expertSkillsBtn.isChecked = false

        player.skill = "intermediate"
    }

    fun onExpertClicked(view: View) {

        noviceSkillsBtn.isChecked = false
        intermediateSkillsBtn.isChecked = false

        player.skill = "expert"
    }

    fun onSkillFinishClicked(view: View) {

        if (player.skill != "")
        {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else
        {
            Toast.makeText(this, "Choose a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}



