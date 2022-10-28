/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package irs;

import java.util.ArrayList;
import java.util.List;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    private List<TaxPayer> payers = new ArrayList<>();
    private int currentIndex = 0;  // for dealing with the array

    public void collectTaxes() {
        for (TaxPayer taxpayer : payers) {
            double deduction = taxpayer.getStandardDeduction();
            System.out.println("Tax Payer's deduction is " + deduction);
            taxpayer.payTaxes();

        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {

        try {
            if(payer != null){
                payers.add(payer);
            }

        }
        catch (IllegalArgumentException e){
            System.out.println("Enter a Valid tax payer");
        }
    }
}