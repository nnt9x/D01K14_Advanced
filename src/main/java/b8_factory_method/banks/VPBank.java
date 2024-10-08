package b8_factory_method.banks;

class VPBank implements Bank {
    private String key;

    public VPBank(String key) {
        this.key = key;
    }

    @Override
    public String getBankName() {
        return "VPBANK";
    }

    @Override
    public boolean payment(int amount) {
        return true;
    }
}
