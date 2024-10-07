package dizzcode.com.blur_o_matic

import android.app.Application
import dizzcode.com.blur_o_matic.data.AppContainer
import dizzcode.com.blur_o_matic.data.DefaultAppContainer

class BluromaticApplication : Application()  {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer(this)
    }
}
