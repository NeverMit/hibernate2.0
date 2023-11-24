package org.example.entity;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        //получаем готовый SessionFactory и создаем сессию
        Session session=HibernateUtil.getSessionFactory().openSession();
        //открываем транзакцию
        session.getTransaction().begin();

        User user=new User();
        user.setEmail("markovnikov962@mail.ru");
        user.setUsername("Artemka2");
        user.setUserpassword("1234");

        session.save(user);//фиксирует изменения в объекте

        session.getTransaction().commit();//сохраняем изменения (транзакция завершается)
        System.out.println("user.getId() = "+user.getId());
        session.close();//закрываем сессию
        HibernateUtil.shutdown();
    }
}