/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package persistence;

import entities.Consorcio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistence.exceptions.NonexistentEntityException;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConsorcioJpaController implements Serializable {

    public ConsorcioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public ConsorcioJpaController() {
        emf = Persistence.createEntityManagerFactory("WebEmisoraPU");
    }

    public void create(Consorcio consorcio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(consorcio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Consorcio consorcio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            consorcio = em.merge(consorcio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = consorcio.getId();
                if (findConsorcio(id) == null) {
                    throw new NonexistentEntityException("The consorcio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consorcio consorcio;
            try {
                consorcio = em.getReference(Consorcio.class, id);
                consorcio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The consorcio with id " + id + " no longer exists.", enfe);
            }
            em.remove(consorcio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Consorcio> findConsorcioEntities() {
        return findConsorcioEntities(true, -1, -1);
    }

    public List<Consorcio> findConsorcioEntities(int maxResults, int firstResult) {
        return findConsorcioEntities(false, maxResults, firstResult);
    }

    private List<Consorcio> findConsorcioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Consorcio.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Consorcio findConsorcio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Consorcio.class, id);
        } finally {
            em.close();
        }
    }

    public int getConsorcioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Consorcio> rt = cq.from(Consorcio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
