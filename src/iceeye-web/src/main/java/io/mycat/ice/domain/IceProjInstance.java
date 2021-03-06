package io.mycat.ice.domain;

import java.util.Date;

public class IceProjInstance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_proj_instance.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_proj_instance.PROJECTID
     *
     * @mbggenerated
     */
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_proj_instance.CLUSTER_ID
     *
     * @mbggenerated
     */
    private Integer clusterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_proj_instance.STATUS
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_proj_instance.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ice_proj_instance.LAST_UPDATED
     *
     * @mbggenerated
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_proj_instance.ID
     *
     * @return the value of ice_proj_instance.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_proj_instance.ID
     *
     * @param id the value for ice_proj_instance.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_proj_instance.PROJECTID
     *
     * @return the value of ice_proj_instance.PROJECTID
     *
     * @mbggenerated
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_proj_instance.PROJECTID
     *
     * @param projectid the value for ice_proj_instance.PROJECTID
     *
     * @mbggenerated
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_proj_instance.CLUSTER_ID
     *
     * @return the value of ice_proj_instance.CLUSTER_ID
     *
     * @mbggenerated
     */
    public Integer getClusterId() {
        return clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_proj_instance.CLUSTER_ID
     *
     * @param clusterId the value for ice_proj_instance.CLUSTER_ID
     *
     * @mbggenerated
     */
    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_proj_instance.STATUS
     *
     * @return the value of ice_proj_instance.STATUS
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_proj_instance.STATUS
     *
     * @param status the value for ice_proj_instance.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_proj_instance.NOTE
     *
     * @return the value of ice_proj_instance.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_proj_instance.NOTE
     *
     * @param note the value for ice_proj_instance.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ice_proj_instance.LAST_UPDATED
     *
     * @return the value of ice_proj_instance.LAST_UPDATED
     *
     * @mbggenerated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ice_proj_instance.LAST_UPDATED
     *
     * @param lastUpdated the value for ice_proj_instance.LAST_UPDATED
     *
     * @mbggenerated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}