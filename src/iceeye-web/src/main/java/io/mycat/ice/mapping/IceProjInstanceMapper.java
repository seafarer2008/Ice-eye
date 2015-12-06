package io.mycat.ice.mapping;

import io.mycat.ice.domain.IceProjInstance;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface IceProjInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_instance
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ice_proj_instance",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_instance
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ice_proj_instance (ID, PROJECTID, ",
        "CLUSTER_ID, STATUS, ",
        "NOTE, LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{projectid,jdbcType=INTEGER}, ",
        "#{clusterId,jdbcType=INTEGER}, #{status,jdbcType=TINYINT}, ",
        "#{note,jdbcType=VARCHAR}, #{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(IceProjInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_instance
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, PROJECTID, CLUSTER_ID, STATUS, NOTE, LAST_UPDATED",
        "from ice_proj_instance",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECTID", property="projectid", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    IceProjInstance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_instance
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, PROJECTID, CLUSTER_ID, STATUS, NOTE, LAST_UPDATED",
        "from ice_proj_instance"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECTID", property="projectid", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<IceProjInstance> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_instance
     *
     * @mbggenerated
     */
    @Update({
        "update ice_proj_instance",
        "set PROJECTID = #{projectid,jdbcType=INTEGER},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "STATUS = #{status,jdbcType=TINYINT},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IceProjInstance record);
}