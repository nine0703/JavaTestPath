####  response

```java
package com.test.main;

public class ClassWork {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print("@");
            System.out.print("@");
            System.out.print("@");
            System.out.println("@");
        }
    }   //  method main end.
}   // class end.
```

#### response

```java
package com.test.main;

public class ClassWork {
    public static void main(String[] args) {
        int money = 10;     //总钱数
        int intCount = 0;   //纸币数量
        int coinCount = 0;  //硬币数量

        for (int i = 1; i < money; i++) {
            intCount = i;
            coinCount = (money - intCount)*2;	//总钱减去一元纸币，剩下的值*2为硬币数量
            System.out.println("一元纸币："+intCount);
            System.out.println("五角硬币："+coinCount);
            System.out.println("===========");

        }
    }   //  method main end.
}   // class end.

```

####  response

```java
package com.test.main;

public class ClassWork {
    public static void main(String[] args) {
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int j : arr){
            System.out.print(j+" ");
        }
    }   //  method main end.
}   // class end.
```
