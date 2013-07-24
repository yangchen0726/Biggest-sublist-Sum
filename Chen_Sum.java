public class Chen_Sum {

    public static void main(String[] args) {

        int input1[] = {-10, 2, 3, -2, 0, 5, -15};
        int input2[] = {-10, 12, 3, -2, -100, 112, 0, 5, -15};
        int input3[] = {10, 12, 34, -2, -100, 10, 0, 20, -15};

        System.out.println("Test");
        findSum(input1);
        findSum(input2);
        findSum(input3);

    }

    public static void findSum(int[] input) {
    
    
        if (input == null || input.length == 0) {
            return;
        }

        //initiate two position pointers and a buffer pointer
        int startP = 0;
        int endP = 0;
        int newStartP = 0;

        int sumMax = 0;
        int rightRunner = 0;

        for (int i = 0; i < input.length; i++) {

            //reset runner
            if (rightRunner < 0) {
                rightRunner = input[i];
                newStartP = i;
            } else {
            
                //keep adding
                rightRunner += input[i];
            }

            //confirm pointer
            if (sumMax < rightRunner) {
                sumMax = rightRunner;
                startP = newStartP;
                endP = i;
            }
        }

        System.out.println("max_sum : " + sumMax + ", start: " + startP + ", endP: " + endP);
    }
}
