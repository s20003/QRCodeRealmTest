package jp.ac.it_college.std.s20003.qrcoderealmtest

import io.realm.RealmObject

open class Data(
    open var name: String = ""
): RealmObject()
