package ExceptionHandling;

/*
 * We categorize errors in 3 types:
 * 1. Syntax error : Basic syntactical mistakes(Less likely to happen while using IDE)
 * 2. Logical error : Basic Logical mistakes like wrong operators or function logics.(Will go away with experience)
 * 3. Runtime error(EXCEPTION) : It is an unwanted event which disturbs the normal flow of out program . To eradicate this we need to handle that exception. 
 */

/*
 * HANDLING THE EXCEPTION
 * 
 * CRITICAL STATEMENT : The statement(s) due to which the flow of program got disturbed is known as critical statement.
 * 
 * To handle the exception we need to write the critical statement(s) inside the try block 
 * and also write the corresponding catch block for it.
 * 
 * Any statement written after the critical statement in the try block will not be executed if an exception is thrown.
 * 
 * ""TRY CATCH BLOCK""
 * 
 * try{
 *     }
 * catch(Exception e){
 *         }
 */

/*
 * In the Finally block we write statements which needs to be executed in any case 
 * wheather exception is occured or not.
 * Try block either Catch or Finally block.
 * Catch or Finally both need atleast one Try block in order to execute.

 */

public class Basic {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("The value of b should be greater than 0. " + e);
        } finally {
            System.out.println("Inside Finally !!!");
        }
    }
}
