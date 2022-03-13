package com.djxf.kotlindome

import kotlin.reflect.KProperty

class Delegate {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {

    }
}