package com.kodilla.bytecode.reflection;

import java.util.Random;

public class Student {

    private String indexNumber;

    public Student() {
        indexNumber = generateRandomIndex();
    }

    private String generateRandomIndex() {

        int leftLimit = 48;     //  number '0'
        int rightLimit = 57;    //  number '9'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i >= 48 || i <= 57))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;

    }

    private void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

}
