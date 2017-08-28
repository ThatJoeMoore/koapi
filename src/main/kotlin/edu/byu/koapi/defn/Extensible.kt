package edu.byu.koapi.defn

/**
 * Created by jmooreoa on 6/30/17.
 */

abstract class Extensible {
    val extensions: MutableMap<String, Any> = mutableMapOf()

    fun x(name: String, value: String) {
        extensions[name] = value
    }
}
