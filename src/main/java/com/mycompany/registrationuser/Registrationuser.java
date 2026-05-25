/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationuser;

import static com.mycompany.registrationuser.LoginClass.authenticate;
import java.util.Scanner;

/**
 *
 * @author junio
 */
public class Registrationuser {

    static String username;
    static String password;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Registration -----");
        
        System.out.print("Enter Name: ");
        String firstname = input.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastname = input.nextLine();


       

       
        boolean validUsername = false;

        while (!validUsername) {
        System.out.print("Enter Username: ");
        username = input.nextLine();

    if (LoginClass.isValidUsername(username)) {
        System.out.println("Username successfully captured.");
        validUsername = true;
       
        
       
        
    } else {
        
        System.out.println("Username is not correctly formatted.");
        System.out.println("Please ensure that the username contains an underscore and is no more than five characters in length.");
        
       
        
        
        }
        }

       boolean validPassword = false;

       while (!validPassword) {
        System.out.print("Enter Password: ");
        password = input.nextLine();

    if (LoginClass.checkPasswordComplexity(password)) {
         System.out.println("Password successfully captured.");
        validPassword = true;
        
       
    } else {
        System.out.println("Password is not correctly formatted.");
        System.out.println("Ensure it has at least 8 characters, a capital letter, a number, and a special character.");
       

        }
        }

      boolean validPhone = false;
      
      while (!validPhone) {
        System.out.print("Enter Cellphone: ");
        String cellphone = input.nextLine();

    if (LoginClass.checkCellPhoneNumber(cellphone)) {
        System.out.println("Cellphone number successfully added.");
        validPhone = true;
        
    } else {
        System.out.println("Cellphone number is incorrect.");
        System.out.println("Format must be +27 followed by 9 digits.");

        
            }
        }
        System.out.println("\nRegistration successful.");

        System.out.println("\n----- Login -----");
        
        boolean loginSuccess = false;

        while (!loginSuccess) {
            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter Login Password: ");
            String loginPass = input.nextLine();

            if (authenticate(loginUser, loginPass)) {
                System.out.println("Login successful. Welcome to Quick Chat " + firstname + " " + lastname);
                loginSuccess = true;
                System.out.println("\nWelcome to QuickChat.");
            } else {
                System.out.println("Login unsuccessful. Incorrect username or password.\n");
            }
        }
            
            ///Declare an integer variable called option and set its initial value to zero///
            int option = 0;

while (option != 3) {
                System.out.println("\nPlease select an option:");
                System.out.println("1. Send Messages");
                System.out.println("2. Show recently sent messages");
                System.out.println("3. Quit");

                System.out.print("Enter option: ");
                /// ParsINT Converts string into an integer///
                option = Integer.parseInt(input.nextLine());

    switch (option) {
        case 1:
                System.out.print("How many messages would you like to send? ");
                /// ParsINT Converts string into an integer///
            int numberOfMessages = Integer.parseInt(input.nextLine());

            for (int i = 0; i < numberOfMessages; i++) {
                System.out.println("\nMessage " + (i + 1));

                System.out.print("Enter recipient cellphone number: ");
                String recipient = input.nextLine();

                System.out.print("Enter message: ");
                String messageText = input.nextLine();

                MessageClass message = new MessageClass(recipient, messageText);

                if (!message.checkRecipientCell()) {
                    System.out.println("Cell phone number is incorrectly formatted or does not contain an international code.");
                } else if (message.checkMessageLength() > 250) {
                    System.out.println(message.validateMessageLength());
                } else {
                    System.out.println("Message successfully sent.");
                    System.out.println(message.printMessage());
                }
            }

            System.out.println("\nTotal messages sent: " + MessageClass.returnTotalMessages());
            break;

        case 2:
            System.out.println("Coming Soon.");
            break;

        case 3:
            System.out.println("Goodbye.");
            break;

        default:
            System.out.println("Invalid option. Please try again.");
            break;
            }
        }
    }
}
    


    
    
    

        


        

    
            
            
 


       
   
            
                

                            
                            
                            
            
                    
                    
                
                   
                


      
    
    

    
        

    
  
    


        

        
        
        
     


        
            
        

        
    
        

    

    

            
  
                
               
    
   

 
        
                
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
