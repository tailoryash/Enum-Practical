package com.enumpractical.company;

public class CompanyDetails {
    public static void getNoOfEmployee() {
        int count = 0;
        CompanyEnum com[] = CompanyEnum.values();
        for (CompanyEnum no : com) {
            System.out.println(no + ":" + no.getNumber());
        }

    }
}
