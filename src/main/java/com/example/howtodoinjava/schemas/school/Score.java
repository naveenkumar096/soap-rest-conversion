//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.19 at 08:33:14 AM IST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for score complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wins" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="losses" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ties" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "wins",
    "losses",
    "ties"
})
public class Score {

    protected int wins;
    protected int losses;
    protected int ties;

    /**
     * Gets the value of the wins property.
     * 
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets the value of the wins property.
     * 
     */
    public void setWins(int value) {
        this.wins = value;
    }

    /**
     * Gets the value of the losses property.
     * 
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Sets the value of the losses property.
     * 
     */
    public void setLosses(int value) {
        this.losses = value;
    }

    /**
     * Gets the value of the ties property.
     * 
     */
    public int getTies() {
        return ties;
    }

    /**
     * Sets the value of the ties property.
     * 
     */
    public void setTies(int value) {
        this.ties = value;
    }

}
