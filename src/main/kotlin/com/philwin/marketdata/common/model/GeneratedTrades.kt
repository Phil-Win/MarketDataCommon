package com.philwin.marketdata.common.model


import java.math.BigDecimal
import java.util.*
import javax.persistence.*
import com.philwin.marketdata.common.model.GeneratedTradesId

@Entity
@Table(name = "generated_trades")
@IdClass(GeneratedTradesId::class)
data class GeneratedTrades(
        @Id
        val stock_id : Long? = null,
        @Id
        val options_id : Long? = null,
        @Id
        val strategy_name : String? = null,
        val symbol : String? = null,
        val trade_date : Date? = null,
        val profit : BigDecimal,
        val capital_requirements : BigDecimal,
        val days : Long
)


