/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokko.uds;

/**
 *
 * @author psyriccio
 */
public class Message {

    private final String sender;
    private final String recipient;
    private final Object content;

    public Message(String sender, String recipient, Object content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public Object getContent() {
        return content;
    }
    
}
