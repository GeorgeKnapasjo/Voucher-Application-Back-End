package com.example.Voucher.database.domain



import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.*


@Entity
@Table(name="VOUCHERS")
data class VoucherApplication(

        @Id
        val id: Int?,

        @NotEmpty
        val firstName: String,

        @NotEmpty
        val lastName: String,


        val dateOfBirth: LocalDate?,

        @Min(18)
        val age: Int,



        @NotEmpty
        val mobileNumber: String,

        @NotEmpty
        val email: String,
//
//        @NotEmpty
//        val medicareCard: MedicareCard
        )

data class MedicareCard(
        val number:Int,
        val expiryMonth:Int,
        val expiryYear:Int
)

