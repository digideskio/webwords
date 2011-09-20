package com.typesafe.webwords.common

import java.net.URL

class Index(val links: Seq[(String, String)],
    val wordCounts: Seq[(String, Int)]) {
    override def toString = {
        "Index(" + links.size + " links," + wordCounts.size + " counts)"
    }
}
