package com.nftmarketplace.backend.model

import javax.persistence.*

@Entity
class MarketplaceUser(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null, var name: String)