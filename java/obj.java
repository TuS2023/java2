class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    // person1に対して、helloメソッドを呼び出してください
    person1.hello();
    
    Person person2 = new Person();
    // person2に対して、helloメソッドを呼び出してください
    person2.hello();
    
  }
}

class Person {
  // インスタンスメソッドhelloを定義してください
  public void hello() {
    System.out.println("こんにちは");
  }
}

class Main {
  public static void main(String[] args) {
    // Personクラスのインスタンスを生成し、変数person1に代入してください
    Person person1 = new Person();
    // Personクラスのインスタンスを生成し、変数person2に代入してください
    Person person2 = new Person();
  }
}
// Personクラスを定義してください
class Person {
  
}

class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.hello();
  }
}
class Person {
  public void hello() {
    // 「こんにちは」と出力されるように書き換えてください
    System.out.println("こんにちは");
  }
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.hello();
    
    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
    person1.name = "Kate Jones";
    
    // person1のインスタンスフィールドnameの値を出力してください
    System.out.println(person1.name);

    Person person2 = new Person();
    person2.hello();
    
    // person2のインスタンスフィールドnameに「John Christopher Smith」をセットしてください
    person2.name = "John Christopher Smith";
   
    // person2のインスタンスフィールドnameの値を出力してください
    System.out.println(person2.name);
    
  }
}
class Person {
  // インスタンスフィールドnameを定義してください
  public String name;

  public void hello() {
    System.out.println("こんにちは");
  }
}

class Person {
  public String name;

  public void hello() {
    // thisを用いて、「こんにちは、私は◯◯です」で出力するように以下を書き換えてください
    System.out.println("こんにちは、私は"+this.name+"です");
  }
}

class Person {
  public String name;

  // コンストラクタを定義してください
  Person() {
    System.out.println("インスタンスが生成されました");
  }

  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}

class Main {
  public static void main(String[] args) {
    // newの引数に「Kate Jones」を渡してください
    Person person1 = new Person("Kate Jones");
    person1.hello();
    
    // newの引数に「John Christopher Smith」を渡してください
    Person person2 = new Person("John Christopher Smith");
    person2.hello();
  }
}
class Person {
  public String name;
  // コンストラクタがString型の引数を受け取るようにしてください
  Person(String name) {
    System.out.println("インスタンスが生成されました");
    // インスタンスフィールドnameに値をセットしてください
    this.name = name;
    
  }
  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    
    System.out.println(person1.firstName);
    System.out.println(person1.lastName);
    System.out.println(person1.age);
    System.out.println(person1.height);
    System.out.println(person1.weight);
  }
}
class Person {
  // 以下にインスタンスフィールドを定義してください
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  // 以下にコンストラクタを定義し、インスタンスフィールドに値をセットしてください
  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    System.out.println(person1.fullName());
    System.out.println(person1.age);
    System.out.println(person1.bmi());
  }
}
class Person {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
  
  // fullNameメソッドを定義してください
  public String fullName() {
    return firstName + " " + lastName;
  }
  
  // bmiメソッドを定義してください
  public double bmi() {
    return weight / height / height;
  }
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
  }
}
class Person {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
  // printDataメソッドを定義してください
  public void printData() {
    System.out.println("私の名前は"+this.fullName()+"です");
    System.out.println("年齢は"+this.age+"歳です");
    System.out.println("BMIは"+Math.round(this.bmi())+"です");
  }
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    // 「合計◯◯人です」と出力してください
    System.out.println("合計"+Person.count+"人です");
    
  }
}
class Person {
  // int型のクラスフィールドcountを定義し、0を代入してください
  public static int count = 0;
  
  public String firstName;
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    // 変数countに1を足してください
    Person.count++;
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }
}

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    // printCountメソッドを呼び出してください
    Person.printCount();
    
  }
}
class Person {
  public static int count = 0;
  public String firstName, lastName;
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

  // クラスメソッドprintCount()を定義してください
  public static void printCount() {
    System.out.println("合計"+Person.count+"人です");
  }
}

