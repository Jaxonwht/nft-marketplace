package com.nftmarketplace.backend.respository

import com.nftmarketplace.backend.model.MarketplaceUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MarketplaceUserRepository : JpaRepository<MarketplaceUser, Long>
