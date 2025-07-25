package org.example.qa_notes.SOLID.ISP.Bad;

public class Clothes implements Product {
    @Override
    public void GetName() {

    }

    @Override
    public void GetProductMark() {

    }

    @Override
    public void GetSalary() {

    }

    @Override
    public void GetSize() {

    }
    // unnecessary here
    // but must implement it due to interface Product
    @Override
    public void GetCalorie() {

    }
}
