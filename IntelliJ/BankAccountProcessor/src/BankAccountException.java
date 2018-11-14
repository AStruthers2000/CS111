class BankAccountException extends Exception{
    BankAccountException(String errorMsg){
        super("Invalid Bank Account info: " + errorMsg);
    }
}
