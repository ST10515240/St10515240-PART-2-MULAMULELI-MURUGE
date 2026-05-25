/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationuser;

/**
 *
 * @author junio
 */
import java.util.Random;
import java.io.FileWriter;
public class MessageClass {
    
    private static int totalMessages = 0;
    
   ///Accessable only class
    private final int messageNumber;
    private final String recipient;
    private final String messageText;
    private final String messageHash;
    private final String messageId;
    
    ///"This " allows access to the objects instant variables///
    public MessageClass (String recipient, String messageText){
        this.messageId = generateMessageId();
        this.messageNumber = ++totalMessages;
        this.recipient = recipient;
        this.messageText = messageText;
        this.messageHash = createMessageHash();
    }
    private String generateMessageId() {
        Random random = new Random();
        long number = 1000000000L + random.nextInt((int) 900000000L);
        return String.valueOf(number);
    }

    public boolean checkMessageId() {
        return messageId.length() <= 10;
    }

    public int checkMessageLength() {
        return messageText.length();
    }

    public String validateMessageLength() {
        if (messageText.length() <= 250) {
            return "Message ready to send.";
        }

        int extraCharacters = messageText.length() - 250;
        return "Message exceeds 250 characters by " + extraCharacters + ", please reduce size.";
    }

    public boolean checkRecipientCell() {
        return recipient.matches("^\\+27\\d{9}$");
    }

    public String createMessageHash() {
        String[] words = messageText.trim().split("\\s+");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        return messageId.substring(0, 2)
                + ":"
                + messageNumber
                + ":"
                + firstWord.toUpperCase()
                + lastWord.toUpperCase();
    }

    public String printMessage() {
        return "Message ID: " + messageId
                + "\nMessage Hash: " + messageHash
                + "\nRecipient: " + recipient
                + "\nMessage: " + messageText;
    }

    public static int returnTotalMessages() {
        return totalMessages;
        
    }
    public void saveMessageToJson() {
        
        ///Stores messages inside the file///

    String json = "{\n"
            + "  \"messageId\": \"" + messageId + "\",\n"
            + "  \"messageNumber\": " + messageNumber + ",\n"
            + "  \"recipient\": \"" + recipient + "\",\n"
            + "  \"messageText\": \"" + messageText + "\",\n"
            + "  \"messageHash\": \"" + messageHash + "\"\n"
            + "}";

    try {

        FileWriter writer = new FileWriter("message" + messageNumber + ".json");

        writer.write(json);

        writer.close();

        System.out.println("JSON file created successfully.");

    } catch (Exception e) {

        System.out.println("Error creating JSON file.");
        e.printStackTrace();
    }
}
    }
           
    
    
    
    
    
    

