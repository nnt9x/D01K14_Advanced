package b8_factory_method.banks;

class TPBank implements Bank{


    @Override
    public String getBankName() {
        return "TPBank";
    }

    @Override
    public boolean payment(int amount) {
        // Logic: ket noi API TPBANK
        return true;
    }
}
