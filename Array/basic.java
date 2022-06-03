import java.util.*;

public class basic {
    public static void main(String [] args){
        //Scanner
        Scanner in = new Scanner(System.in);

        //store 5 roll numbers:
        int[] rollno = new int[5];

        //directly save the number:
        int[] rollno2 = {1,2,3,4,5};

        //working of arrays
        int[] ros; //declaration of array, ros is a variable defined in the stack
        ros = new int[5]; // initialisation of ros object: Actually here object is being created in the memory (heap)
        System.out.println(ros[1]);

        //input using for loop
        for(int i=0; i<rollno.length; i++){
            rollno[i] = in.nextInt();
        }

        //enhanced for loop
        for(int num : rollno){   //for every element in array, print the element
            System.out.print(num + " ");//here num reperesents element of the array
        }
        System.out.println(); // for next line
        System.out.println(Arrays.toString(rollno)); // 2nd method to print an array


/*        
        //storing 4 words 
        // array of objects
        String[] arr = new String[4];
        System.out.println(arr[0]); //will return null(literal): as arr doesn't have any value 
        
        for(int i=0; i<arr.length;i++){
            arr[i] = in.next();
        }

        //modify
        arr[0] = "Harshita";

        System.out.println(Arrays.toString(arr));
*/

/*
        //2D Arrays
    
        int[][] arr = new int[3][3];

        int[][] arr1 = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };
        
        //taking input in 2d array
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

         //printing 2d array
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //2nd way of printing 
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //3rd way of printing 2d array using enhanced for loop
        for(int[] a:arr){ //every single element in arr is itself an array: that's why we are using int[]
            System.out.println(Arrays.toString(a));
        }
*/

/*
        //Array List
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(34);
        System.out.println(list);
        System.out.println(list.contains(342));
        list.set(2,23);

        //input for arraylist
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
*/

    }
}
