package com.nftmarketplace.backend.app

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories("com.nftmarketplace.backend")
class RepositoryConfig
