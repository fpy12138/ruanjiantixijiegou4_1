
package service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>calculatePersonalIncomeTaxResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="calculatePersonalIncomeTaxResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculatePersonalIncomeTaxResponse", propOrder = {
    "_return"
})
public class CalculatePersonalIncomeTaxResponse {

    @XmlElement(name = "return")
    protected double _return;

    /**
     * 获取return属性的值。
     * 
     */
    public double getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     */
    public void setReturn(double value) {
        this._return = value;
    }

}
