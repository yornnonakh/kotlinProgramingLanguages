package main.kotlin.homeWork1

import java.util.Currency

/**
    SAVING
    CURRENT
 */
enum class HomeWork1 {
    SAVING,
    CURRENT,
    FIXED_DEPOSIT,
    STUDENT,
    JUNIOR,
    BUSINESS,
}

/**
    01
    02
    03
 */

enum class HomeWorkExample1(val code: String) {
    SAVING("01"),
    CURRENT("02"),
    FIXED_DEPOSIT("03"),
    STUDENT("04"),
    JUNIOR("04"),
    BUSINESS("05"),
}

/**
 * role of national bank
 */
enum class AccountStatus{
    ACTIVE,
    INACTIVE,
    CLOSE,
    FROZEN,
}

/**
 * create data class
 * information of each account
 */

data class BankAccountModel(
    val accountId: String,
    val accountNumber: String,
    val accountName: String,
    val accountType: String,
    val balance: Double,
    val currency: String,
    val accountStatus: AccountStatus,
    val interestRate: Float,
    val createdDate: String,
    val dailyTransferLimit: Double,
    val branchCode: String,
)

val bankAccounts = listOf(
    BankAccountModel(
        accountId = "ACC001",
        accountNumber = "100000001",
        accountName = "Yorn Nona",
        accountType = "Savings",
        balance = 1500.75,
        currency = "USD",
        accountStatus = AccountStatus.ACTIVE,
        interestRate = 2.5f,
        createdDate = "2025-01-15",
        dailyTransferLimit = 5000.0,
        branchCode = "PP001"
    ),
    BankAccountModel(
        accountId = "ACC002",
        accountNumber = "100000002",
        accountName = "John Doe",
        accountType = "Checking",
        balance = 3200.50,
        currency = "USD",
        accountStatus = AccountStatus.INACTIVE,
        interestRate = 1.2f,
        createdDate = "2024-11-20",
        dailyTransferLimit = 3000.0,
        branchCode = "PP002"
    ),
    BankAccountModel(
        accountId = "ACC003",
        accountNumber = "100000003",
        accountName = "Sophia Kim",
        accountType = "Savings",
        balance = 8700.00,
        currency = "USD",
        accountStatus = AccountStatus.ACTIVE,
        interestRate = 3.0f,
        createdDate = "2023-07-10",
        dailyTransferLimit = 10000.0,
        branchCode = "PP003"
    ),
    BankAccountModel(
        accountId = "ACC004",
        accountNumber = "100000004",
        accountName = "Michael Chan",
        accountType = "Business",
        balance = 25000.99,
        currency = "USD",
        accountStatus = AccountStatus.FROZEN,
        interestRate = 0.8f,
        createdDate = "2022-05-05",
        dailyTransferLimit = 50000.0,
        branchCode = "PP004"
    ),
    BankAccountModel(
        accountId = "ACC005",
        accountNumber = "100000005",
        accountName = "Emily Davis",
        accountType = "Savings",
        balance = 940.20,
        currency = "USD",
        accountStatus = AccountStatus.ACTIVE,
        interestRate = 2.2f,
        createdDate = "2025-03-18",
        dailyTransferLimit = 2500.0,
        branchCode = "PP001"
    ),
    BankAccountModel(
        accountId = "ACC006",
        accountNumber = "100000006",
        accountName = "David Lee",
        accountType = "Checking",
        balance = 5400.10,
        currency = "USD",
        accountStatus = AccountStatus.FROZEN,
        interestRate = 1.0f,
        createdDate = "2021-09-22",
        dailyTransferLimit = 2000.0,
        branchCode = "PP005"
    ),
    BankAccountModel(
        accountId = "ACC007",
        accountNumber = "100000007",
        accountName = "Anna Smith",
        accountType = "Savings",
        balance = 12000.45,
        currency = "USD",
        accountStatus = AccountStatus.CLOSE,
        interestRate = 3.5f,
        createdDate = "2024-02-01",
        dailyTransferLimit = 15000.0,
        branchCode = "PP006"
    ),
    BankAccountModel(
        accountId = "ACC008",
        accountNumber = "100000008",
        accountName = "Chris Johnson",
        accountType = "Business",
        balance = 60000.00,
        currency = "USD",
        accountStatus = AccountStatus.CLOSE,
        interestRate = 1.5f,
        createdDate = "2020-12-30",
        dailyTransferLimit = 100000.0,
        branchCode = "PP007"
    ),
    BankAccountModel(
        accountId = "ACC009",
        accountNumber = "100000009",
        accountName = "Jessica Brown",
        accountType = "Checking",
        balance = 4300.80,
        currency = "USD",
        accountStatus = AccountStatus.ACTIVE,
        interestRate = 1.3f,
        createdDate = "2023-10-12",
        dailyTransferLimit = 4000.0,
        branchCode = "PP002"
    ),
    BankAccountModel(
        accountId = "ACC010",
        accountNumber = "100000010",
        accountName = "Daniel Wilson",
        accountType = "Savings",
        balance = 780.55,
        currency = "USD",
        accountStatus = AccountStatus.ACTIVE,
        interestRate = 2.8f,
        createdDate = "2025-04-08",
        dailyTransferLimit = 1000.0,
        branchCode = "PP003"
    ),
    BankAccountModel(
        accountId = "ACC010",
        accountNumber = "100000011",
        accountName = "Daniel Wilson",
        accountType = "Savings",
        balance = 880.55,
        currency = "USD",
        accountStatus = AccountStatus.ACTIVE,
        interestRate = 2.8f,
        createdDate = "2025-01-01",
        dailyTransferLimit = 1000.0,
        branchCode = "PP010"
    ),
)

/**
 * create function
 */

fun filterAccount(
    accounts: List<BankAccountModel>,
    onResult: (data: BankAccountModel) -> Unit,
    ){
    for (account in accounts){
        if (account.accountId == "ACC010"){
            onResult(account)
            return // break
        }
    }
}