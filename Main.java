// wap to 4 choice by user 
// 1.class and object
// 2.default constructor
// 3.paramiterized callByValue
// 4.paramiterized callByreference
//  Now enter choice by user and display example related to user choice.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "1.class and object\n2.default constructor\n3.paramiterized callByValue\n4.paramiterized callByreference");
        System.out.println("Enter your choice :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("enter 2 num :");
                int x = sc.nextInt();
                int y = sc.nextInt();
                ClassAndObject obj = new ClassAndObject();
                int sum = obj.sum(x, y);
                System.out.println("Sum of " + x + " and " + y + " usingClassAndObject is :" + sum);
                break;
            }
            case 2: {
                DefaultConstructor obj = new DefaultConstructor();
                break;
            }
            case 3: {
                System.out.println("enter 2 num :");
                int x = sc.nextInt();
                int y = sc.nextInt();
                ParamiterizedCallByvalue obj = new ParamiterizedCallByvalue(x, y);
                break;

            }
            case 4: {

                ParamiterizedReference obj = new ParamiterizedReference();
                ParamiterizedReference obj1 = new ParamiterizedReference(obj);
                break;
            }
        }

    }
}

class ClassAndObject {
    int sum(int a, int b) {
        return (a + b);
    }

}

class DefaultConstructor {
    DefaultConstructor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 num :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of " + x + " and " + y + " usingClassAndObject is :" + (x + y));

    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

}

class ParamiterizedCallByvalue {
    ParamiterizedCallByvalue(int x, int y) {
        System.out.println("Sum of " + x + " and " + y + " usingClassAndObject is :" + (x + y));

    }

}

class ParamiterizedReference {
    int x, y;

    ParamiterizedReference() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 num :");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    ParamiterizedReference(ParamiterizedReference P) {
        System.out.println("Sum of " + P.x + " and " + P.y + " usingClassAndObject is :" + (P.x + P.y));
    }

}