package com.example.Voucher.database.repository

import com.example.Voucher.database.domain.VoucherApplication
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface VoucherRepository: CrudRepository<VoucherApplication, String> {

    @Query("select * from voucher_applications")
    fun getVouchers(): List<VoucherApplication>
}
