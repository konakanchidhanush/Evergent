package com.evergent.CoreJAVA.Dhanush.Task1;

public class AdultUser implements LibraryUser {
  private int age;
  private String bookType;
  public void registerAccount(int age)
  {if (age > 12) {
          System.out.println("You have successfully registered under an Adult Account.");
      } else {
          System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
      }
  }
  @Override
  public void requestBook(String btype)
  {
      if ("Fiction".equalsIgnoreCase(btype)) {
          System.out.println("Book Issued successfully, please return the book within 7 days.");
      } else {
          System.out.println("Oops, you are allowed to take only adult Fiction books.");
      }
  }
  // Getter and Setter for age
  public int getAge() {
      return age;
  }
  public void setAge(int age) {
      this.age = age;
  }
  // Getter and Setter for bookType
  public String getBookType() {
      return bookType;
  }
  public void setBookType(String bookType) {
      this.bookType = bookType;
  }
}