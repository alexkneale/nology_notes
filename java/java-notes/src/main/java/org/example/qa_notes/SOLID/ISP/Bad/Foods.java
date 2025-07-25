package org.example.qa_notes.SOLID.ISP.Bad;

public class Foods implements Product {


    @Override
    public void GetName() {

    }

    @Override
    public void GetProductMark() {

    }

    @Override
    public void GetSalary() {

    }
    // unnecessary here
    // but must implement it due to interface Product
    @Override
    public void GetSize() {

    }

    @Override
    public void GetCalorie() {

    }
}
