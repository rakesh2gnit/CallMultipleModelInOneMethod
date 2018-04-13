package com.bizshare.differentmodelexample;

/**
 * Created by Rakesh.Kumar on 23-03-2018.
 */

public class Emp {

    String empcode;

    public Emp(String empcode, String empdesignation) {
        this.empcode = empcode;
        this.empdesignation = empdesignation;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getEmpdesignation() {
        return empdesignation;
    }

    public void setEmpdesignation(String empdesignation) {
        this.empdesignation = empdesignation;
    }

    String empdesignation;
}
