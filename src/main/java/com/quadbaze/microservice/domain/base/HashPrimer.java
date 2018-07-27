package com.quadbaze.microservice.domain.base;

/**
 * @author Olatunji O. Longe: Created on (18/04/2018)
 */
public class HashPrimer {

    public final int PRIME = 31;
    public final int ID_PRIME;

    public HashPrimer(Long entityId){
        ID_PRIME = (int) (entityId % 2 == 0 ? entityId + 1 : entityId);
    }
}
