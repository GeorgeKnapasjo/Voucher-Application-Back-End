package com.example.Voucher.database

import com.example.Voucher.database.domain.VoucherApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class VoucherDatabaseApplication

fun main(args: Array<String>) {
	runApplication<VoucherDatabaseApplication>(*args)

}
