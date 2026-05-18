class ArrayNotes {
    public static void main(String[] args) {
        // ARRAYS
        // Introduction
        // Array declaration
        // Array construction
        // Array intitalization
        // Array decalation, construction and initialization in a single line
        // length vs length() method
        // Anonymous arrays
        // Array element assignments 
        // Array variable assignments
        
        // Introduction
        // int rollNumber1Marks = 90;
        // int rollNumber2Marks = 23;
        // int rollNumber3Marks = 26;
        // int rollNumber4Marks = 32;
        // int rollNumber5Marks = 82;
        
        /*
        Array is an indexed collection of fixed number of homogenous data elements.
        
        The main advantage of arrays is we can reperesent multiple values with same name
        so that the readibility of code is improved.
            int[] marks = new int[5];
            marks[0] = 90;
            marks[1] = 23;
            marks[2] = 26;
            marks[3] = 32;
            marks[4] = 82;

        Also the values are stored in contigious memory locations.

        But the main disadvantage of arrays is:
        Arrays are fixed in size that means once we created an array there is no chance of 
        inceasing or decreasing the size based on the requirement. 

        To use the arrays compulsary we should know the size of array in advance which is
        not possible always.

        We can resolve this problem using Collections.
        */
       
       // Array Declarations
    //    int[] arr;            // recommended
    //    int []arr;
    //    int arr[];
        // Note: At the time of decalration we can specify data type and idenfier name
        // if we try to specify size we will get compile time error.

        // int[] a;             // valid
        // int a[5];            // invalid

        // Array Construction
        // Every array in java is an object hence we can create it using new operator.

        // int[] arr = new int[3];
        // The arr variable is a reference variable which stores the reference to the
        // the actual array object stored in the heap memory.

        // For every array type corresponding classes are available but these classes are
        // part of java language and not available to the programmer level.
        // int[]   ---  [I
        // int[][]   ---  [[I
        // double[]   ---  [D

        // Rule-1: At the time of array creation compulsary we should specify the size otherwise
        // we will get compile time error
        // int[] arr = new int[3];
        // int[] arr = new int[];          // error: array dimension missing

        int[] arr = new int[5];
        System.out.println(arr.length);

        // Rule-2: It is legal to have an array of size zero in java.
        // int[] arr = new int[0];
        // System.out.println(arr.length);
        
        // Rule-3: If we are taking array with negative size then we'll get runtime exception
        // saying NegativeArraySizeException
        // int[] arr = new int[-3];     // R.E: NegativeArraySizeException

        // Rule-4: The only allowed data types to specify array size are byte, short, int, char.
        // If by mistake we are using any other type we'll get compile time error.
        
        // int[] arr = new int[7];   // valid
        // byte b = 10;
        // int[] arr = new int[b];    // valid
        // short s = 20;
        // int[] arr = new int[s];     // valid

        // int[] arr = new int['a'];
        // System.out.println(arr.length);    // valid

        // int[] arr = new int[200l];      // error: incompatible types: possible lossy conversion from long to int
        // int[] arr = new int[5.7];
        // int[] arr = new int[10.5f];

        // Rule-5: The maximum allowed array size in java is maximum value of int data type.
        // If it exeeds this you'll get RE: OutOfMemoryError.

        // Array Initialization
        // int[] arr1 = new int[4];
        // System.out.println(arr1); //prints address
        // System.out.println(arr1[2]);

        // double[] arr3 = new double[4];
        // System.out.println(arr3);
        // System.out.println(arr3[2]);

        // Whenever we are creating an array every element is initialized with default value automatically.
        // If we are not satified with those values then we can override those values.

        // int[] arr = new int[4];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;        // RE: ArrayIndexOutOfBoundsException
        // arr[-4] = 50;        // RE: ArrayIndexOutOfBoundsException

        // Declation, Construction and initialization in single line
        // We can perform declaration, construction and initialization of array in single line.

        // int[] arr = new int[3];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;

        // int[] arr = {10, 20, 30};
        // char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // String[] names = {"Salman", "Ranbir", "Vicky"};


        // Traversing the array
        int[] arr6 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }

        int n = arr6.length;
        int i = 0;
        while (i < n) {
            System.out.println(arr6[i++]);
            // i++;
        }
        for (int k: arr6) {
            System.out.println(k);
        }
    }    
}
