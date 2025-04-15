package org.pklearning.jdbc;

public class Constants {
    public static final String uri="jdbc:mysql://localhost:3306/classicmodels";
    public static final String user_name="root";
    public static final String password="oracle";


    /*Table column*/
    //Product
    public static final String PRODUCTS ="products";
    public static final String products_productCode="productCode";
    public static final String products_productName ="productName";
    public static final String products_productLine="productLine";
    public static final String products_productScale="productScale";
    public static final String products_productVendor="productVendor";
    public static final String products_productDescription="productDescription";
    public static final String products_quantityInStock="quantityInStock";
    public static final String products_buyPrice ="buyPrice";
    public static final String products_MSRP="MSRP";

    //orderdetails
    public static final String orderdetails ="orderdetails";
    public static final String orderdetails_orderNumber="orderNumber";
    public static final String orderdetails_productCode="productCode";
    public static final String orderdetails_quantityOrdered="quantityOrdered";
    public static final String orderdetails_priceEach="priceEach";
    public static final String orderdetails_orderLineNumber="orderLineNumber";

    //employees
    public static final String employees ="employees";
    public static final String employees_employeeNumber="employeeNumber";
    public static final String employees_lastName="lastName";
    public static final String employees_firstName="firstName";
    public static final String employees_extension="extension";
    public static final String employees_email="email";
    public static final String employees_officeCode="officeCode";
    public static final String employees_reportsTo="reportsTo";
    public static final String employees_jobTitle="jobTitle";

}
