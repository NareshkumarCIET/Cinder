package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Calendar;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * @author Naresh-Govindon < naresh.kibnc@gmail.com >
 * The Volume Class gives the Storage detail of the Block Storage.
 *
 */
@JsonRootName("Volume")
public class Volume implements Serializable {

    /**
     * The Status for the Volume .
     */
    private String status;

    /**
     * The Name for the Volume.
     */
    private String displayName;

    /**
     * The Attachments for the Instances.
     */
    private String attachments;

    /**
     * The Availability zone for the Volumes.
     */
    private String availablity_zone;

    /**
     * The Bootable is to set the Volumes Instances.
     */
    private boolean bootable;

    /**
     * The createdAt gives date and time for the created Volume.
     */
    private Calendar createdAt;

    /**
     * The Description gives the Display Information for Volume.
     */
    private String displayDescription;

    /**
     * The Volume_Type is gives the Sub Volume type of the Volume.
     */
    private String volumeType;

    /**
     * The SnapShot Id gives the detail of the Cinder Snapshots.
     */
    private String snapshotId;

    /**
     * The source_volid gives specific ID of the Volume.
     */
    private String source_volid;

    /**
     * The Metadata gives data about the Volume which is going to create.
     */
    private String metadata;

    /**
     * The ID gives the Id of the Volume.
     */
    private String Id;

    /**
     * The size is to give the Size of the Volume.
     */
    private int size;

    public String getAvailablity_zone() {
        return availablity_zone;
    }

    public String getDisplayDescription() {
        return displayDescription;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public String getSource_volid() {
        return source_volid;
    }

    public String getMetadata() {
        return metadata;
    }

    public int getSize() {
        return size;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public void setAvailablity_zone(String availablity_zone) {
        this.availablity_zone = availablity_zone;
    }

    public void setBootable(boolean bootable) {
        this.bootable = bootable;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public void setSource_volid(String source_volid) {
        this.source_volid = source_volid;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "Volume: { status :" + status + "display_name :" + displayName +
                "attachments :" + attachments + "availability_zone :" 
                + availablity_zone + "bootable" + bootable + "created_at" 
                + createdAt + "display_description" + displayDescription + 
                "volume_type" + volumeType +"snapshot_id" + snapshotId + 
                "source_volid" + snapshotId +  "metadata" + metadata + "id" 
                + Id+ "size" + size + "}" ;
    }
}
