package com.example.Voucher.database.controller

import com.example.Voucher.database.domain.VoucherApplication
import com.example.Voucher.database.service.VoucherService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class VoucherController(val service: VoucherService) {

    @PostMapping("/Vouchers")
    fun voucherApplication(@RequestBody voucherApplication: VoucherApplication) : Any {
        return voucherApplication
    }
}