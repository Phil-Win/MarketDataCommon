package com.philwin.marketdata.common.model

import java.math.BigDecimal
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "stock")
data class Stock (
    var symbol: String? = null,
    @Temporal(TemporalType.DATE)
    var date: Date? = null,
    var open: BigDecimal? = null,
    var close: BigDecimal? = null,
    var high: BigDecimal? = null,
    var low: BigDecimal? = null,
    var volume: Long? = null
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
}