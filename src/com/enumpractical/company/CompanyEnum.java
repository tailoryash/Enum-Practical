package com.enumpractical.company;

public enum CompanyEnum {
    SDE(80), SDE2(10), LEAD(3), TEAM_LEAD(2), TEAM_MANAGER(1), ENGINEERING_MANAGER(1);
    private final int number;

    CompanyEnum(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
