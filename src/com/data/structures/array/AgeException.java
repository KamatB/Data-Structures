package com.data.structures.array;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String m){
        super(m);
    }
}

public class AgeException{
    public void validateAge(Integer age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("the age is below 18");
            }
        System.out.println(age);
    }
    public static void main(String[] args) throws InvalidAgeException {
        AgeException ageException= new AgeException();
        ageException.validateAge(6);
    }
}

