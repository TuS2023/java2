class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    // middleNameとして「Christopher」を渡してください
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    Person.printCount();
  }
}
class Person {
  public static int count = 0;
  public String firstName;
  // インスタンスフィールドmiddleNameを定義してください
  public String middleName;
  
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
  
  // middleNameを受け取るコンストラクタを定義してください
  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.middleName = middleName;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}
 // middleNameを受け取るコンストラクタを定義したときのthisでの簡略化
Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    // this()を用いて、コンストラクタを呼び出してください
    this(firstName, lastName, age, height, weight);
    
    this.middleName = middleName;
}

public String fullName() {
    // 以下を、middleNameがない場合とある場合で条件分岐を行ってください
    if(middleName == null){
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + lastName;
    }
}

class Person {
  // クラスを外部から遮断させるprivate
  private static int count = 0;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();

    System.out.println("----------------------");
    // person2に対して、getMiddleNameメソッドを呼び出し、「person2のミドルネームは◯◯です」と出力してください
    System.out.println("person2のミドルネームは"+ person2.getMiddleName() +"です");
    
  }
}
// middleNameフィールドのゲッターを定義してください
  public String getMiddleName() {
    return this.middleName;
  }


class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();

    System.out.println("----------------------");
    // person1のmiddleNameフィールドの値を「Claire」にしてください
    person1.setMiddleName("Claire");
    
    System.out.println("ミドルネームを" + person1.getMiddleName() + "に変更しました");
    person1.printData();
  }
}
// middleNameフィールドのセッターを定義してください
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  

class Main {
  public static void main(String[] args) {
    // 仕事を「医者」にしてください
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "医者");
    person1.printData();
    // 仕事を「教師」にしてください
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    System.out.println("----------------------");
    // person1の仕事を「獣医」に変更してください
    person1.setJob("獣医");
    
    // 「person1の仕事を◯◯に変更しました」と出力されるようにしてください
    System.out.println("person1の仕事を"+ person1.getJob() +"に変更しました");
    
    person1.printData();
  }
}  
class Person {
  private static int count = 0;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
  // インスタンスフィールド「job」を追加してください
  private String job;
  
  // コンストラクタを書き換えてください
  Person(String firstName, String lastName, int age, double height, double weight, String job) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }
  
  // コンストラクタを書き換えてください
  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
    this(firstName, lastName, age, height, weight, job);
    this.middleName = middleName;
  }

  public String getMiddleName() {
    return this.middleName;
  }
  
  // jobのゲッターを定義してください
  public String getJob() {
    return this.job;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  // jobのセッターを定義してください
  public void setJob(String job) {
    this.job = job;
  }
  

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
    // 「仕事は◯◯です」と出力してください
    System.out.println("仕事は" + this.job + "です");
    
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}