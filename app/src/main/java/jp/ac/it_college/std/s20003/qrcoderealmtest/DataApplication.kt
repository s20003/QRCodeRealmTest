package jp.ac.it_college.std.s20003.qrcoderealmtest

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class DataApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        // 設定
        val config = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            // .readOnly()
            .build()
        Realm.setDefaultConfiguration(config)
    }
}