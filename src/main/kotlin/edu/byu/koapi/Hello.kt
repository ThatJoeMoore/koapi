package edu.byu.koapi

import edu.byu.koapi.defn.APACHE_2_LICENSE

fun main(args: Array<String>) {
    println("Hello, World")

    openapi3 {
        info {
            title = "hi"
            description = """Long Desc"""
            contact {
                name = ""
                email = ""
            }
            license = APACHE_2_LICENSE
            x("foo-bar-extension", "value")
        }
    }


//    koapi(koapi.spark.SparkEngine) {
//        info {
//            description("string string")
//            version("string string")
//            title("string string")
//            termsOfService("string string"}
//            contact {
//                email ("email")
//            }
//            license {
//                name("Apache 2.0")
//            }
//        }
//        host("")
//        x("custom-foo", "bar")
//        paths {
//            p("/pet") {
//                post {
//                    tags("pet")
//                    summary("")
//                    parameters {
//                        query("foo") {
//                            description("")
//                            required()
//                            type(String.class)
//                        }
//                    }
//                    requestBody(FooBar.class)
//                    handle {
//                        //Actually do stuff here
//                    }
//                }
//            }
//        }
//    }
}

