package org.example.head04.example10;

    public enum PaymentMethod {
        CREDIT_CARD("카드결제"),
        ACCOUNT_TRANSFER("계좌이체"),
        MOBILE_PAYMENT("모바일결제");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }


}
