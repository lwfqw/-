package com.lwf.mapper;

import com.lwf.pojo.Cname;
import com.lwf.pojo.CnameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CnameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int countByExample(CnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int deleteByExample(CnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int deleteByPrimaryKey(String cno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int insert(Cname record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int insertSelective(Cname record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    List<Cname> selectByExample(CnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    Cname selectByPrimaryKey(String cno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") Cname record, @Param("example") CnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int updateByExample(@Param("record") Cname record, @Param("example") CnameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int updateByPrimaryKeySelective(Cname record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CNAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    int updateByPrimaryKey(Cname record);
}