package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.Exception.UserNotFoundException;

import Day2controller.Day2controller;

public class Main {

    public static void main(String[] args) {
        System.out.println("Employee system");
        Scanner sc = new Scanner(System.in);
        Day2controller c = new Day2controller();
        String yn = null;

        try {
            String un = null;
            String pwd = null;

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter Username");
            un = br.readLine();
            System.out.println("Enter Password");
            pwd = br.readLine();

            BiPredicate<String, String> credentialsValidator = (username, password) ->
                    username.equals("Aash") && password.equals("pass");

            if (credentialsValidator.test(un, pwd)) {
                System.out.println("Please wait...loading");
                Thread.sleep(5000);
                do {
                    System.out.println("1.Add emp \t 2.view emp \t 3.serialize \t 4.deserialize");
                    System.out.println("Enter choice:");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            c.addEmployee();
                            break;

                        case 2:
                            c.viewEmployee();
                            break;

                        case 3:
                            c.serialize();
                            break;

                        case 4:
                            c.deserialize();
                            break;

                        default:
                            System.out.println("Invalid choice");
                            break;
                    }

                    System.out.println("continue? y|n");
                    yn = sc.next();

                } while (yn.equals("y"));
                System.exit(0);
            } else {
                throw new UserNotFoundException();
            }

        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally .....");
        }
    }

}
