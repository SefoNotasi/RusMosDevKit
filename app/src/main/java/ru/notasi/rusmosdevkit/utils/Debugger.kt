package ru.notasi.rusmosdevkit.utils

import android.util.Log
import ru.notasi.rusmosdevkit.BuildConfig

private const val TAG = "RMDK"

object Debugger {

    private val isDebug = BuildConfig.DEBUG

    /**
     * https://stackoverflow.com/questions/48181751/get-name-of-current-function-in-kotlin
     *
     * https://stackoverflow.com/a/48182038
     * val name = object{}.javaClass.enclosingMethod.name
     *
     * A more Java way is this:
     * Thread.currentThread().stackTrace[1].methodName
     *
     * but it takes ~47ms on my system compared with ~13ms for the object() based one: nearly 4 times slower.
     *
     * https://stackoverflow.com/a/71305539
     * just log this line, it should print "main".
     *
     * Thread.currentThread().name
     */

    fun log(message: String) {
        if (isDebug) Log.e(TAG, message)
    }

    fun log(threadName: String, className: String, methodName: String?) {
        if (isDebug) Log.e(
            TAG,
            "Thread: $threadName\n" +
                    "Class: $className\n" +
                    "Method: $methodName"
        )
    }

    fun log(threadName: String, className: String, methodName: String?, message: String) {
        if (isDebug) Log.e(
            TAG,
            "Thread: $threadName\n" +
                    "Class: $className\n" +
                    "Method: $methodName\n" +
                    "Message: $message"
        )
    }

    fun log(
        threadName: String,
        className: String,
        methodName: String?,
        message: String,
        throwable: Throwable
    ) {
        if (isDebug) Log.e(
            TAG,
            "Thread: $threadName\n" +
                    "Class: $className\n" +
                    "Method: $methodName\n" +
                    "Message: $message",
            throwable
        )
    }

}