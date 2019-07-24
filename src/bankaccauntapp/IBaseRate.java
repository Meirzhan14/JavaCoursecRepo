package bankaccauntapp;

public interface IBaseRate {

    // Write a method that return the base rate
    default double getBaseRate(){
        return 4.5;
    }

}
