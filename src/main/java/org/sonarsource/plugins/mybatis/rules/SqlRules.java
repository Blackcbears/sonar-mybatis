//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 09:04:39 PM EET 
//

package org.sonarsource.plugins.mybatis.rules;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}rule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="repoName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repoKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *       &lt;attribute name="isAdhoc" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rule" })
@XmlRootElement(name = "sql-rules")
public class SqlRules {

	protected List<Rule> rule;
	@XmlAttribute(name = "repoName")
	protected String repoName;
	@XmlAttribute(name = "repoKey")
	protected String repoKey;
	@XmlAttribute(name = "version")
	protected String version;
	@XmlAttribute(name = "isAdhoc")
	protected Boolean isAdhoc = false;
	@XmlAttribute(name = "isExternal")
	protected Boolean isExternal = false;
	@XmlAttribute(name = "dialect")
	protected String dialect = "tsql";

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	/**
	 * Gets the value of the rule property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the rule property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRule().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Rule }
	 * 
	 * 
	 */
	public List<Rule> getRule() {
		if (rule == null) {
			rule = new ArrayList<Rule>();
		}
		return this.rule;
	}

	/**
	 * Gets the value of the repoName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRepoName() {
		return repoName;
	}

	/**
	 * Sets the value of the repoName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRepoName(String value) {
		this.repoName = value;
	}

	/**
	 * Gets the value of the repoKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRepoKey() {
		return repoKey;
	}

	/**
	 * Sets the value of the repoKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRepoKey(String value) {
		this.repoKey = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		if (version == null) {
			return "1";
		} else {
			return version;
		}
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Gets the value of the isAdhoc property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isIsAdhoc() {
		if (isAdhoc == null) {
			return false;
		} else {
			return isAdhoc;
		}
	}

	/**
	 * Sets the value of the isAdhoc property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsAdhoc(Boolean value) {
		this.isAdhoc = value;
	}

	public Boolean getIsExternal() {
		if (isExternal == null) {
			return false;
		}
		return isExternal;
	}

	public void setIsExternal(Boolean isExternal) {
		this.isExternal = isExternal;
	}

}
