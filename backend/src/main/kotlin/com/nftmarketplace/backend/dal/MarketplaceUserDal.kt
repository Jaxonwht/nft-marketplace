package com.nftmarketplace.backend.dal

import com.nftmarketplace.backend.model.MarketplaceUser
import com.nftmarketplace.backend.respository.MarketplaceUserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.yaml.snakeyaml.error.Mark
import javax.persistence.EntityNotFoundException

@Service
class MarketplaceUserDal(private val marketplaceUserRepository: MarketplaceUserRepository) {
    suspend fun getMarketplaceUserById(id: Long): MarketplaceUser? =
            withContext(Dispatchers.IO) {
                marketplaceUserRepository.findByIdOrNull(id)
            }

    suspend fun insertNewMarketplaceUser(user: MarketplaceUser): MarketplaceUser =
        withContext(Dispatchers.IO) {
            marketplaceUserRepository.save(user)
        }
    }