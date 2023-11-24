package org.example.entity;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        //�������� ������� SessionFactory � ������� ������
        Session session=HibernateUtil.getSessionFactory().openSession();
        //��������� ����������
        session.getTransaction().begin();

        User user=new User();
        user.setEmail("markovnikov962@mail.ru");
        user.setUsername("Artemka2");
        user.setUserpassword("1234");

        session.save(user);//��������� ��������� � �������

        session.getTransaction().commit();//��������� ��������� (���������� �����������)
        System.out.println("user.getId() = "+user.getId());
        session.close();//��������� ������
        HibernateUtil.shutdown();
    }
}