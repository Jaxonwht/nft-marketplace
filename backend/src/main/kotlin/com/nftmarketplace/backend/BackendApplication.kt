package com.nftmarketplace.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.repository.CrudRepository

@SpringBootApplication
class BackendApplication

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}