package com.philwin.marketdata.common.model

import java.io.Serializable

class GeneratedTradesId : Serializable {
    var options_id : Long? = null
    var stock_id : Long? = null
    var strategy_name : String? = null
    constructor(optionsId: Long?, stockId: Long?, strategyName: String?)
}
