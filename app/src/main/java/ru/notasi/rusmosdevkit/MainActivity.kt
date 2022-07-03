package ru.notasi.rusmosdevkit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.notasi.rusmosdevkit.utils.Debugger

private const val className = "MainActivity"

/**
 * https://stackoverflow.com/questions/31297246/activity-appcompatactivity-fragmentactivity-and-actionbaractivity-when-to-us
 *
 * https://stackoverflow.com/a/31297559
 * So basically, using AppCompatActivity is always the right choice. The differences between them are:
 * • Activity is the basic one.
 * • Based on Activity, FragmentActivity provides the ability to use Fragment.
 * • Based on FragmentActivity, AppCompatActivity provides features to ActionBar.
 *
 * https://stackoverflow.com/a/39302338
 * Android Documentation recommends using AppCompatActivity if you are using an App Bar.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Debugger.log(
            threadName = Thread.currentThread().name,
            className = className,
            methodName = object {}.javaClass.enclosingMethod?.name
        )
    }

}