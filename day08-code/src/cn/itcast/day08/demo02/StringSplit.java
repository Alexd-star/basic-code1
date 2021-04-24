package cn.itcast.day08.demo02;
/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分成若干部分

注意事项：
split方法其实是一个"正则表达式"
特殊写法：
如果按照英文句点："."进行切分，必须写"\\."（两个反斜杠）

 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String str3 = "XXX.YYY.ZZZ";
        String[] split1 = str3.split("\\.");
        System.out.println(split1.length);//0
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }
}
