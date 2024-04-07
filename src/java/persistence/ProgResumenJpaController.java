/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package persistence;

import entities.ProgResumen;
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
public class ProgResumenJpaController implements Serializable {

    public ProgResumenJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public ProgResumenJpaController() {
        emf = Persistence.createEntityManagerFactory("WebEmisoraPU");
    }

    public void create(ProgResumen progResumen) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(progResumen);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ProgResumen progResumen) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            progResumen = em.merge(progResumen);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = progResumen.getId();
                if (findProgResumen(id) == null) {
                    throw new NonexistentEntityException("The progResumen with id " + id + " no longer exists.");
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
            ProgResumen progResumen;
            try {
                progResumen = em.getReference(ProgResumen.class, id);
                progResumen.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The progResumen with id " + id + " no longer exists.", enfe);
            }
            em.remove(progResumen);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ProgResumen> findProgResumenEntities() {
        return findProgResumenEntities(true, -1, -1);
    }

    public List<ProgResumen> findProgResumenEntities(int maxResults, int firstResult) {
        return findProgResumenEntities(false, maxResults, firstResult);
    }

    private List<ProgResumen> findProgResumenEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ProgResumen.class));
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

    public ProgResumen findProgResumen(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ProgResumen.class, id);
        } finally {
            em.close();
        }
    }

    public int getProgResumenCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ProgResumen> rt = cq.from(ProgResumen.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
