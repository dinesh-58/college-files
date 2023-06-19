<?php

interface HasLockerBox {
    function numOfLockerBox(); 
}

abstract class BankAccount {
    protected $amount;
    protected $interestRate;

    function __construct ($openingBalance = 0) {
        $this->amount = $openingBalance;
    }

    function withdraw($withdrawAmount) {
        if ($withdrawAmount > $this->amount) {
            echo 'Insufficient balance';
            return;
        }
        $this->amount -= $withdrawAmount;
        echo "You have withdrawn $withdrawAmount<br>";
    }

    function deposit($depositAmount) {
        $this->amount += $depositAmount; // private members can't be directly accessed inside functions using just their identifier.
                                        // use $this->member instead. don't use $ sign for member identifier
        echo "You have deposited $depositAmount<br>";
    }

    function checkBalance() {
        echo "Your balance is $this->amount<br>";
    }

    function calculateInterest($years) {
        echo "Amount: $this->amount, Years: $years, Rate: $this->interestRate<br>";
        echo 'Total interest: '.($this->amount * $years * $this->interestRate / 100).'<br>';
    }
    
}

class FixedDepositAccount extends BankAccount implements HasLockerBox {
    protected $interestRate = 12;
    public function withdraw($withdrawAmount) {
        echo "Can't withdraw in fixed deposit account<br>";
    }
    
    public function numOfLockerBox() {
        return 4;
    }
}

class SavingsAccount extends BankAccount {
    protected $interestRate = 6;
    public function withdraw($withdrawAmount) {
        if ($withdrawAmount > 100000) {
            echo 'Can\'t withdraw more than Rs. 1 lakh in a Savings account';
            return;
        }
        parent::withdraw($withdrawAmount); // else call parent's method. 
        // remember that :: is used to access a class's static properties
    }
}

$JohnBankAccount = new SavingsAccount();
$JohnBankAccount->deposit(2000);
$JohnBankAccount->withdraw(100);
$JohnBankAccount->checkBalance();
$JohnBankAccount->calculateInterest(5);

$BenBankAccount = new FixedDepositAccount(10);
$BenBankAccount->checkBalance();
$BenBankAccount->withdraw(100);
$BenBankAccount->calculateInterest(3);
