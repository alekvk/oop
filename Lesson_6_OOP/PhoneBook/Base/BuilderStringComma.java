package Lesson_6_OOP.PhoneBook.Base;

import java.util.List;


import Lesson_6_OOP.PhoneBook.Base.Interfaces.*;


public class BuilderStringComma implements InterBuilderStringComma {
  
    @Override
    public StringBuilder BuildStringComma(List<Contact> contacts) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("id, Имя, Отчество, Фамилия, Телефон, Комментарий\n");
        for (Contact contact : contacts) {
            sb.append(contact.getIdContact()).append(",");
            sb.append(contact.getFirstName()).append(",");
            sb.append(contact.getPatronymic()).append(",");
            sb.append(contact.getLastName()).append(",");
            sb.append(contact.getPhone()).append(",");
            sb.append(contact.getComment()).append("\n");
        }  
        return sb;
    }
    
}


/*
public class BuilderStringComma implements InterBuilderStringComma {
  
    @Override
    public StringBuilder BuildStringComma(List<Contact> contacts) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("id, Имя, Отчество, Фамилия, Телефон, Комментарий\n");
        for (Contact contact : contacts) {
            sb.append(contact.getIdContact()).append(",");
            sb.append(contact.getFirstName()).append(",");
            sb.append(contact.getPatronymic()).append(",");
            sb.append(contact.getLastName()).append(",");
            sb.append(contact.getPhone()).append(",");
            sb.append(contact.getComment()).append("\n");
        }  
        return sb;
    }
    
} */