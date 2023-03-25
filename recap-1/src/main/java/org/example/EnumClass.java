package org.example;

public enum EnumClass {
    CASE_1("Case 1") {
        @Override
        public Integer getValueForConstant() {
            return 1;
        }
    },
    CASE_2("Case 2") {
        @Override
        public Integer getValueForConstant() {
            return 2;
        }
    },
    CUVANT("Cuvant") {
        @Override
        public Integer getValueForConstant() {
            return 3;
        }
    },
    ALT_CUVANT("Alt cuvant") {
        @Override
        public Integer getValueForConstant() {
            return 4;
        }
    };

    private String stringValue;

    EnumClass(String stringValue) {
        this.stringValue = stringValue;
    }


    public abstract Integer getValueForConstant();
}
