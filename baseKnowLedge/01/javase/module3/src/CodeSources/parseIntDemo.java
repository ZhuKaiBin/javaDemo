package CodeSources;

public class parseIntDemo {
    public static void main(String[] args) {
        String validNumberStr = "123";
        String invalidNumberStr = "1111c";

        try {
            int validNumber = Integer.parseInt(validNumberStr);
            System.out.println("转换成功的整数是：" + validNumber);
        } catch (NumberFormatException e) {
            System.out.println("输入的字符串不是一个有效的整数：" + validNumberStr);
        }



        // 尝试转换无效的整数字符串
        try {
            Integer invalidNumber = Integer.valueOf(invalidNumberStr);
            System.out.println("转换成功的整数是：" + invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println("输入的字符串不是一个有效的整数：" + invalidNumberStr);
        }
    }
}
