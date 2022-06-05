package com.nftmarketplace.backend.controller

import com.nftmarketplace.backend.dal.MarketplaceUserDal
import com.nftmarketplace.backend.model.MarketplaceUser
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/users")
class MarketplaceUserController(private val marketplaceUserDal: MarketplaceUserDal) {
    @PostMapping("/", consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    suspend fun insertUser(@RequestBody user: MarketplaceUser): MarketplaceUser = marketplaceUserDal.insertNewMarketplaceUser(user)

    @GetMapping("/{id}")
    suspend fun getUserById(@PathVariable id: Long): MarketplaceUser {
        return marketplaceUserDal.getMarketplaceUserById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}