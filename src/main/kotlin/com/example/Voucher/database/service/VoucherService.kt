package com.example.Voucher.database.service

import com.example.Voucher.database.domain.VoucherApplication
import com.example.Voucher.database.repository.VoucherRepository
import org.springframework.stereotype.Service

@Service
class VoucherService(val db: VoucherRepository) {

    fun getApplications(): List<VoucherApplication> = db.getVouchers()

    fun add(voucherApplication: VoucherApplication){
        db.save(voucherApplication)
    }
}