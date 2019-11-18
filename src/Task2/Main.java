package Task2;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Main {

    public static void main(String[] args) {


        try {
            throwException(Status.FileNotFoundException);
        } catch (JarException e) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (AccessDeniedException e) {

        }


        try {
            throwException(Status.AccessDeniedException);
        } catch (JarException e) {

        } catch (FileNotFoundException e) {

        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());

            try {
                throwException(Status.AccessDeniedException);
            } catch (JarException e1) {

            } catch (FileNotFoundException e1) {

            } catch (AccessDeniedException e1) {

            }
        }


        try {
            throwException(Status.JarException);
        } catch (JarException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {

        } catch (AccessDeniedException e) {

        }

    }

    public enum Status {

        JarException, FileNotFoundException, AccessDeniedException
    }

    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {

        if (status.equals(Status.FileNotFoundException)) throw new FileNotFoundException();
        if (status.equals(Status.AccessDeniedException)) throw new AccessDeniedException("Exception from method \"throwException\" - \"AccessDeniedException\" ");
        if (status.equals(Status.JarException)) throw new JarException();
    }
}
