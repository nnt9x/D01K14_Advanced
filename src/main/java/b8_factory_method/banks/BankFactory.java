package b8_factory_method.banks;

public class BankFactory {
    private BankFactory(){

    }
    public static Bank getBank(BankType type) {
        switch (type) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            case VPBANK:
                return new VPBank("BKACAD");
            default:
                return null;
        }
    }
}
