/** @author Faizan Atif Masood
 * @version 2.0
 * @since 2023
 */
package JavaDoc;

/**
 * 
 * @author Faizan Atif Masood
 *         Class for Library Book
 */
class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * @param s Book Name
     */
    public Book(String s) {
    }

    /**
     * Issue a Book to a Student
     * 
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */

    public void issue(int roll) throws Exception {
    }

    /**
     * check if book is available
     * @param str Book Name
     * @return if book is available return true else false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Get Book name
     * @param id book id
     * @return returns book
     */
    public String getName(int id) {
        return "";
    }
}

public class JavaDocDemo {

}
