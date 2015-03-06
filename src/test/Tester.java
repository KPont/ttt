/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Projects;
import entity.Task;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kasper
 */
public class Tester {
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("KPSP4PU");
         EntityManager em = emf.createEntityManager();
         
         Projects prj = new Projects("test1", "desc1");
         Task t1 = new Task("task1", "descr1", 10, 4);
         em.getTransaction().begin();
         em.persist(prj);
         em.persist(t1);
         em.getTransaction().commit();
    }
}
