package com.philwin.marketdata.common.repository

import com.philwin.marketdata.common.model.Strategy
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StrategyRepository : CrudRepository<Strategy, String> {
}