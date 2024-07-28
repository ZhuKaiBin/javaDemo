package CodeSources;

public class ExceptionDemo {
    public static void main(String[] args) {

        //region 方式一:e instanceof ArrayIndexOutOfBoundsException
//        try {
//            int[] intnum = new int[5];
//            int n = intnum[10];
//        } catch (Exception e) {
//
//            if (e instanceof ArrayIndexOutOfBoundsException) {
//                System.out.println("Array index out of bounds: " + e.getMessage());
//
//            } else {
//                System.out.println("Exception occurred: " + e.getMessage());
//
//            }
//        }

        //endregion


        //region 方式二:e.getClass().equals(ArrayIndexOutOfBoundsException.class

        try {
            int[] intnum = new int[5];
            int n = intnum[10];
        } catch (Exception e) {
            if (e.getClass().equals(ArrayIndexOutOfBoundsException.class)) {
                System.out.println("Array index out of bounds: " + e.getMessage());

            } else {
                System.out.println("Exception occurred: " + e.getMessage());

            }
        }

        //endregion
    }
}
