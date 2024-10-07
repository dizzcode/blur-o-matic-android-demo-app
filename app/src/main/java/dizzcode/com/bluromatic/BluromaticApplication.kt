package dizzcode.com.bluromatic

import android.app.Application
import dizzcode.com.bluromatic.data.AppContainer
import dizzcode.com.bluromatic.data.DefaultAppContainer

class BluromaticApplication : Application()  {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}
