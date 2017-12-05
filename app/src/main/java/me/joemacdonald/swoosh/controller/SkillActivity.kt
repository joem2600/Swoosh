package me.joemacdonald.swoosh.controller


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import me.joemacdonald.swoosh.Utilities.EXTRA_LEAGUE
import me.joemacdonald.swoosh.R
import me.joemacdonald.swoosh.Utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)


    }

    fun onNoviceClicked(view: View) {

        intermediateSkillsBtn.isChecked = false
        expertSkillsBtn.isChecked = false

        skill = "novice"
    }

    fun onIntermediateClicked(view: View) {

        noviceSkillsBtn.isChecked = false
        expertSkillsBtn.isChecked = false

        skill = "intermediate"
    }

    fun onExpertClicked(view: View) {

        noviceSkillsBtn.isChecked = false
        intermediateSkillsBtn.isChecked = false

        skill = "expert"
    }

    fun onSkillFinishClicked(view: View) {

        if (skill != "")
        {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }
        else
        {
            Toast.makeText(this, "Choose a skill level", Toast.LENGTH_SHORT).show()
        }
    }

}



