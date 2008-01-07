
package org.docx4j.jaxb.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_NumberFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_NumberFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="upperRoman"/>
 *     &lt;enumeration value="lowerRoman"/>
 *     &lt;enumeration value="upperLetter"/>
 *     &lt;enumeration value="lowerLetter"/>
 *     &lt;enumeration value="ordinal"/>
 *     &lt;enumeration value="cardinalText"/>
 *     &lt;enumeration value="ordinalText"/>
 *     &lt;enumeration value="chicago"/>
 *     &lt;enumeration value="decimalEnclosedCircle"/>
 *     &lt;enumeration value="bullet"/>
 *     &lt;enumeration value="decimalEnclosedFullstop"/>
 *     &lt;enumeration value="decimalEnclosedParen"/>
 *     &lt;enumeration value="decimalEnclosedCircleChinese"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_NumberFormat")
@XmlEnum
public enum STNumberFormat {


    /**
     * Decimal Numbers
     * 
     */
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),

    /**
     * Uppercase Roman
     * 						Numerals
     * 
     */
    @XmlEnumValue("upperRoman")
    UPPER_ROMAN("upperRoman"),

    /**
     * Lowercase Roman
     * 						Numerals
     * 
     */
    @XmlEnumValue("lowerRoman")
    LOWER_ROMAN("lowerRoman"),

    /**
     * Uppercase Latin
     * 						Alphabet
     * 
     */
    @XmlEnumValue("upperLetter")
    UPPER_LETTER("upperLetter"),

    /**
     * Lowercase Latin
     * 						Alphabet
     * 
     */
    @XmlEnumValue("lowerLetter")
    LOWER_LETTER("lowerLetter"),

    /**
     * Ordinal
     * 
     */
    @XmlEnumValue("ordinal")
    ORDINAL("ordinal"),

    /**
     * Cardinal Text
     * 
     */
    @XmlEnumValue("cardinalText")
    CARDINAL_TEXT("cardinalText"),

    /**
     * Ordinal Text
     * 
     */
    @XmlEnumValue("ordinalText")
    ORDINAL_TEXT("ordinalText"),

    /**
     * Chicago Manual of Style
     * 
     */
    @XmlEnumValue("chicago")
    CHICAGO("chicago"),

    /**
     * Decimal Numbers Enclosed in a
     * 						Circle
     * 
     */
    @XmlEnumValue("decimalEnclosedCircle")
    DECIMAL_ENCLOSED_CIRCLE("decimalEnclosedCircle"),

    /**
     * Bullet
     * 
     */
    @XmlEnumValue("bullet")
    BULLET("bullet"),

    /**
     * Decimal Numbers Followed by a
     * 						Period
     * 
     */
    @XmlEnumValue("decimalEnclosedFullstop")
    DECIMAL_ENCLOSED_FULLSTOP("decimalEnclosedFullstop"),

    /**
     * Decimal Numbers Enclosed in
     * 						Parenthesis
     * 
     */
    @XmlEnumValue("decimalEnclosedParen")
    DECIMAL_ENCLOSED_PAREN("decimalEnclosedParen"),

    /**
     * Decimal Numbers Enclosed in a
     * 						Circle
     * 
     */
    @XmlEnumValue("decimalEnclosedCircleChinese")
    DECIMAL_ENCLOSED_CIRCLE_CHINESE("decimalEnclosedCircleChinese"),

    /**
     * No Numbering
     * 
     */
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    STNumberFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STNumberFormat fromValue(String v) {
        for (STNumberFormat c: STNumberFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
