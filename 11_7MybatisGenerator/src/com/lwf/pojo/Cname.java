package com.lwf.pojo;

import java.io.Serializable;

public class Cname implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CNAME.CNO
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    private String cno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CNAME.NAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CNAME.CNO
     *
     * @return the value of CNAME.CNO
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    public String getCno() {
        return cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CNAME.CNO
     *
     * @param cno the value for CNAME.CNO
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    public void setCno(String cno) {
        this.cno = cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CNAME.NAME
     *
     * @return the value of CNAME.NAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CNAME.NAME
     *
     * @param name the value for CNAME.NAME
     *
     * @mbggenerated Sat Nov 07 10:01:00 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }
}