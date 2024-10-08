package b8_factory_method;


import b8_factory_method.banks.Bank;
import b8_factory_method.banks.BankFactory;
import b8_factory_method.banks.BankType;

public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VPBANK);
        System.out.println(bank.getBankName());
    }
}
