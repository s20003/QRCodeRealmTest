package jp.ac.it_college.std.s20003.qrcoderealmtest

import io.realm.kotlin.types.ObjectId
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class Data : RealmObject {
    @PrimaryKey
    var id: ObjectId = ObjectId.create()
    var name: String = ""
    var usage: String = ""
    var count: Int = 0
}
