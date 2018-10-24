package com.jelekong.aplikasifootbalclub

import android.graphics.Bitmap
import android.graphics.Paint
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_footbal_club.view.*
import org.jetbrains.anko.*

class DetailFootballClubActivity : AppCompatActivity() {

    private var nameData: String = ""
    private var imageData: Int = 0
    private var detailData: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent

        scrollView {
            verticalLayout{
                padding = dip(16)

                imageData = intent.getIntExtra("image",0)
                imageView(imageData).lparams(width = dip(120), height = dip(120)){
                    gravity = Gravity.CENTER
                }

                textView{
                    nameData = intent.getStringExtra("name")
                    text = nameData
                    typeface = Typeface.DEFAULT_BOLD
                    textSize = 16f
                    gravity = Gravity.CENTER
                }.lparams(width = matchParent){
                    topMargin = dip(8)
                }

                textView{
                    detailData = intent.getStringExtra("detail")
                    text = detailData
                    textSize = 16f
                    gravity = Gravity.CENTER
                }.lparams(width = matchParent){
                    topMargin = dip(8)
                }
            }

        }
    }
}