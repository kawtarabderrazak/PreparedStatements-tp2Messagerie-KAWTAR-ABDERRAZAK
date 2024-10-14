package ma.projet.test;

import java.sql.Date;
import ma.projet.beans.Employe;
import ma.projet.beans.Message;
import ma.projet.service.EmployeService;
import ma.projet.service.MessageService1;

public class Messagerie {
    public static void main(String[] args) {
        // Création d'employés
        EmployeService es = new EmployeService();
        es.create(new Employe("AB", "KAWTAR"));
        es.create(new Employe("ABD", "AYA"));
        es.create(new Employe("ABDER", "RAYHANA"));

        // Modification d'un employé
        Employe e = es.getById(1);
        if (e != null) { 
            e.setNom("YOUNESS");
            e.setPrenom("YOUSSEF"); 
            es.update(e);
        }
       
        //Suppression d'un employe
es.delete(es.getById(50));

        // Liste des employés
        for (Employe emp : es.getAll()) {
            System.out.println(" " + emp.getNom());
        }

        // Création de messages
        MessageService1 ms = new MessageService1();

        // Utiliser la date actuelle pour les messages et la convertir en java.sql.Date
        java.util.Date currentDate = new java.util.Date();
        Date sqlDate = new Date(currentDate.getTime());

        // Création des messages avec java.sql.Date
        ms.create(new Message("Réunion", "Réunion de fin d'année", sqlDate, es.getById(51), es.getById(52)));
        ms.create(new Message("Réunion", "Réunion de fin d'année", sqlDate, es.getById(53), es.getById(54)));
        ms.create(new Message("Stage", "Stage à Marrakech", sqlDate, es.getById(55), es.getById(56)));
        ms.create(new Message("Stage", "Stage à Marrakech", sqlDate, es.getById(57), es.getById(58)));
    }
}
