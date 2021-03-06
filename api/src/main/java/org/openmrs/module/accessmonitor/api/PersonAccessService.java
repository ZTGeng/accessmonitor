/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.accessmonitor.api;

import java.util.Date;
import java.util.List;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.accessmonitor.PersonServiceAccess;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean
 * which is configured in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(OrderAccessesService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface PersonAccessService extends OpenmrsService {
    
    /*
     * Add service methods here
     */
    
    // New methods added on 5/13/2015
    public List<PersonServiceAccess> getPersonAccessesByAccessDateOrderByPersonId(
            Date from, Date to);
    
    // New methods added on 5/4/2015
    public List<PersonServiceAccess> getPersonServiceAccessesByAccessDate(
            Date from, Date to);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByAccessorId(
            Integer accessorId, Date from, Date to);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByPersonId(
            Integer personId, Date from, Date to);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByPersonUuid(
            String personUuid, Date from, Date to);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByAccessType(
            String accessType, Date from, Date to);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByVoidReason(
            String voidReason, Date from, Date to);
    
    // Old methods
    public PersonServiceAccess getPersonServiceAccessById(Integer id);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByAccessorId(
            Integer accessorId);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByPersonId(
            Integer personId);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByPersonType(
            String personType);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByPersonUuid(
            String personUuid);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByAccessType(
            String accessType);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByVoidReason(
            String voidReason);
    
    public List<PersonServiceAccess> getPersonServiceAccessesByAccessDate(
            Date accessDate);
    
    public List<PersonServiceAccess> getAllPersonServiceAccesses();
    
    public PersonServiceAccess savePersonServiceAccess(
            PersonServiceAccess personServiceAccess);

    //public void generateData();
    
}