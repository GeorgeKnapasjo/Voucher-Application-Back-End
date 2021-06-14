package com.example.Voucher.database.repository

import com.example.Voucher.database.domain.VoucherApplication
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface VoucherRepository : CrudRepository<VoucherApplication, String> {

    @Query(value="select * from vouchers", nativeQuery = true)
    fun getVouchers(): List<VoucherApplication>
}
