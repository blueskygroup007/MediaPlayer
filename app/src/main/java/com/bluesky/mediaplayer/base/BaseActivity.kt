package com.bluesky.mediaplayer.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

/**
 *
 * @author BlueSky
 * @date 23.8.9
 * Description:
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutId())
        initEvent()
        initData()
    }

    fun initEvent() {

    }

    fun initData() {

    }


    abstract fun getLayoutId(): Int

    inline fun <reified T : BaseActivity> startActivityAndFinish(context: Context) {
        startActivity(Intent(context, T::class.java))
        finish()
    }

}