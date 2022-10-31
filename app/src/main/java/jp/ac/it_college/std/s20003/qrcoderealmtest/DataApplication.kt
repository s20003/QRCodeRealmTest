package jp.ac.it_college.std.s20003.qrcoderealmtest

import android.app.Application
import io.realm.Realm

class DataApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}