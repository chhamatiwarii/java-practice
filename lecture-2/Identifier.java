class Identifier {
    public static void main(String[] args) {
        // Identifier - A name in a java program is called Identifier.
        // It may be class name, method name, variable name, label name, etc.

        // Rules: 
        // 1. Allowed characters:
        //      a to z
        //      A to Z
        //      0 to 9
        //      _ (underscore) and $ (dollar)
        // If we use any other character we will get compile time error.

        // int total_number = 10;
        // int total2 = 20;
        // String abc1234;


        // 2. Identifiers are not allowed to start with digit.
        //int abc123; // valid
        // int 123abc;  // invalid

        // 3. Identifier names are case sensitive.
        // Therefore Java itself is case sensitive.
        // int number=10;
        // int Number=20;
        // int NUMBER=20;     // we can differentiate with case.
        // int NuMbEr=30;


        // 4. We cannot use reserved words in java as identifiers.
        // int if = 10;     // invalid
        //int iF = 10;

        // 5. All the predefined java class names and interface names we can use as identifiers.
        // Even though it is legal to use predefined java class names and interface names as identifiers
        // but it is not recommended to use because it is not a good programming practice and it can
        // lead to confusion.
        // int String = 10;
        // int Runnable = 20;
        

        // _$_ (valid)
        // Ca$h (valid)
        // Java2share (valid)
        // all@hands (invalid)
        // 123abc (invalid)
        // Total# (invalid)
        // Int (valid)
        // Integer (valid but not recommended)
        // int (invalid)
        // tot123 (valid)
        // _total34 (valid)
        // $total34 (valid)



        // Conventions

        // Casing
        // 1. Camel Case
        // Normal = Kajal Tiwari
        // Camel Case = kajalTiwari, kajalTiwariShikari

        // give all variable names and method names in camel case.
        // firstNumber
        // getSalary()

        // 2. Pascal Casing
        // Normal = Kajal Tiwari
        // Pascal Case = KajalTiwari

        // Give all class names and interface names in Pascal Case.
        // StudentDetails
        // BankAccount
        // Runnable
        // Integer
        // String
        // StringBuilder

        // 3. Snake casing (Not recommended in Java mostly used in python)
        // normal = Kajal Tiwari
        // snake case = kajal_tiwari, Kajal_Tiwari

        // 4. UPPER_CASE
        // normal = kajal tiwari
        // upper_case = KAJAL_TIWARI

        // All constant names and Enum value names should be written in UPPER_CASE
        // ACTIVE
        // INACTIVE
        // RUTHERFORD_CONST

        // 5. lowercase
        // only used in pacakage name - folder names

    }    
}
