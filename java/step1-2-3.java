import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("何人分の情報を入力しますか：");
    int n = scanner.nextInt();
    
    int maxAge = 0;
    int totalAge = 0;
    
    for (int i = 0; i < n; i++) {
      
      System.out.println(i + 1 + "人目");
      
      System.out.print("名前：");
      String firstName = scanner.next();
      
      System.out.print("名字：");
      String lastName = scanner.next();
      
      System.out.print("年齢：");
      int age = scanner.nextInt();
      if(age > maxAge){
        maxAge = age;
      }
      totalAge += age;
      
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
    
    Person.printData(firstName, lastName, age, height, weight);
    }
    System.out.println("最高年齢は"+maxAge+"歳です");
    System.out.println("平均年齢は"+totalAge/n+"歳です");
  }
}

class Person {
  public static void printData(String firstName, String lastName, int age, double height, double weight){
      System.out.println("名前は"+fullName(firstName, lastName)+"です");
      System.out.println("年齢は"+age+"歳です");
      if(age >= 20) {
        System.out.println("成年者です");
      } else {
        System.out.println("未成年者です");
      }
      
      System.out.println("身長は"+height+"mです");
      System.out.println("体重は"+weight+"kgです");
      double bmi = bmi(height, weight);
      System.out.println("BMIは"+Math.round(bmi)+"です");
      if (isHealthy(bmi)) {
      System.out.println("健康です");
    } else {
      System.out.println("健康ではありません");
    }
    }
  public static String fullName(String firstName, String lastName) {
    return firstName+ " " +lastName;
  }
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }
  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}