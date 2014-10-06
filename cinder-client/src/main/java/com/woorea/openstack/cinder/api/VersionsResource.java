package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.OpenStackClient;

/**
 *
 * @author Naresh-Govindon <naresh.kibnc@gmail.com>
 */
public class VersionsResource { 
    
    /**
     * The Instance to the OpenStack Client.
     */
    private final OpenStackClient CLIENT;
    
    /**
     * The Constructor to the OpenStack Client.
     * @param client request is assigned to the VersionResource Class.
     */
    public VersionsResource( OpenStackClient client ) {
        CLIENT = client;
    }
    
}
