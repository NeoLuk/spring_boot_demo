package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    private val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 2),
        Bank("2222", 2.33, 9),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank = banks.firstOrNull() { it.accountNumber == accountNumber }
        ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
}