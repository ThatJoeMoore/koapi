package edu.byu.koapi

import edu.byu.koapi.defn.Info

/**
 * Created by jmooreoa on 6/30/17.
 */

fun openapi3(init: OpenApi3Def.() -> Unit): OpenApi3Def {
    val info = OpenApi3Def()
    info.init()
    return info
}

abstract class DslMember {
    internal val data = mutableMapOf<String, DslMember>()
}

class OpenApi3Def {
    internal var info : Info? = null

    fun info(init: Info.() -> Unit): Info {
        val info = Info()
        info.init()
        this.info = info
        return info
    }
}



