package com.philwin.marketdata.common.repository

import com.philwin.marketdata.common.model.Options
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OptionsRespository : CrudRepository<Options, Long> {
    fun findBySymbol(symbol: String): List<Options>
}