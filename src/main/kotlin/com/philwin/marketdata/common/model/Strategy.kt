package com.philwin.marketdata.common.model

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "strategy")
data class Strategy(
        @Id
        var name: String? = null
) {

}