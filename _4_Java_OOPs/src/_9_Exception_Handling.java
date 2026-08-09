public class _9_Exception_Handling {
    static void main(String[] args) {
        try{
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Exception Handled");
        }//finally
        finally {
            System.out.println("Final msg...");
        }
    }
}
