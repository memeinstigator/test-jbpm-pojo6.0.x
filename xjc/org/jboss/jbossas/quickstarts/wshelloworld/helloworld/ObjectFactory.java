//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.17 at 03:17:51 PM PDT 
//


package org.jboss.jbossas.quickstarts.wshelloworld.helloworld;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.jbossas.quickstarts.wshelloworld.helloworld package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyDummyPOJO_QNAME = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", "MyDummyPOJO");
    private final static QName _TestObject_QNAME = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", "testObject");
    private final static QName _TestObjectResponse_QNAME = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", "testObjectResponse");
    private final static QName _TestObjectReturn_QNAME = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", "testObjectReturn");
    private final static QName _TestObjectReturnResponse_QNAME = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", "testObjectReturnResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.jbossas.quickstarts.wshelloworld.helloworld
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyDummyPOJO }
     * 
     */
    public MyDummyPOJO createMyDummyPOJO() {
        return new MyDummyPOJO();
    }

    /**
     * Create an instance of {@link TestObject }
     * 
     */
    public TestObject createTestObject() {
        return new TestObject();
    }

    /**
     * Create an instance of {@link TestObjectReturnResponse }
     * 
     */
    public TestObjectReturnResponse createTestObjectReturnResponse() {
        return new TestObjectReturnResponse();
    }

    /**
     * Create an instance of {@link TestObjectReturn }
     * 
     */
    public TestObjectReturn createTestObjectReturn() {
        return new TestObjectReturn();
    }

    /**
     * Create an instance of {@link TestObjectResponse }
     * 
     */
    public TestObjectResponse createTestObjectResponse() {
        return new TestObjectResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyDummyPOJO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", name = "MyDummyPOJO")
    public JAXBElement<MyDummyPOJO> createMyDummyPOJO(MyDummyPOJO value) {
        return new JAXBElement<MyDummyPOJO>(_MyDummyPOJO_QNAME, MyDummyPOJO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", name = "testObject")
    public JAXBElement<TestObject> createTestObject(TestObject value) {
        return new JAXBElement<TestObject>(_TestObject_QNAME, TestObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestObjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", name = "testObjectResponse")
    public JAXBElement<TestObjectResponse> createTestObjectResponse(TestObjectResponse value) {
        return new JAXBElement<TestObjectResponse>(_TestObjectResponse_QNAME, TestObjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestObjectReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", name = "testObjectReturn")
    public JAXBElement<TestObjectReturn> createTestObjectReturn(TestObjectReturn value) {
        return new JAXBElement<TestObjectReturn>(_TestObjectReturn_QNAME, TestObjectReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestObjectReturnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", name = "testObjectReturnResponse")
    public JAXBElement<TestObjectReturnResponse> createTestObjectReturnResponse(TestObjectReturnResponse value) {
        return new JAXBElement<TestObjectReturnResponse>(_TestObjectReturnResponse_QNAME, TestObjectReturnResponse.class, null, value);
    }

}
