package de.studio.beans;

import javax.inject.Named;

@Named
public class UserBean {
    public String printMsgFromSpring(){
        return "Hello";
    }
}
