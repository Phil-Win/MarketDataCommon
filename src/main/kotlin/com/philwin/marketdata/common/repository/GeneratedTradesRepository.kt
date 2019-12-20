package com.philwin.marketdata.common.repository

import com.philwin.marketdata.common.model.GeneratedTrades
import com.philwin.marketdata.common.model.GeneratedTradesId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GeneratedTradesRepository : CrudRepository<GeneratedTrades, GeneratedTradesId> {
    fun findBySymbol(symbol: String): List<GeneratedTrades>
}