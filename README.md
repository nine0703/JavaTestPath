####  演示    Demo

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

#### 快速开始   Quick Start

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

## 参与与贡献   Contributors

Thanks to the following people who have contributed to this project:

[![贡献者](https://img.shields.io/github/contributors/nine0703/JavaTestPath.svg?label=贡献者)](https://github.com//nine0703/JavaTestPath/graphs/contributors)
