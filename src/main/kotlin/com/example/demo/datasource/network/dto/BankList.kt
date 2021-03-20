package com.example.demo.datasource.network.dto

import com.example.demo.model.Bank

data class BankList(
    val results: Collection<Bank>
)