//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.19 at 08:33:14 AM IST 
//


package com.example.howtodoinjava.schemas.school;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.howtodoinjava.schemas.school package. 
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

    private final static QName _Download_QNAME = new QName("http://service.soap.web.com/", "download");
    private final static QName _DownloadResponse_QNAME = new QName("http://service.soap.web.com/", "downloadResponse");
    private final static QName _GetScore_QNAME = new QName("http://service.soap.web.com/", "getScore");
    private final static QName _GetScoreResponse_QNAME = new QName("http://service.soap.web.com/", "getScoreResponse");
    private final static QName _RestScore_QNAME = new QName("http://service.soap.web.com/", "restScore");
    private final static QName _RestScoreResponse_QNAME = new QName("http://service.soap.web.com/", "restScoreResponse");
    private final static QName _UpdateScore_QNAME = new QName("http://service.soap.web.com/", "updateScore");
    private final static QName _UpdateScoreResponse_QNAME = new QName("http://service.soap.web.com/", "updateScoreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.howtodoinjava.schemas.school
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link GetScore }
     * 
     */
    public GetScore createGetScore() {
        return new GetScore();
    }

    /**
     * Create an instance of {@link GetScoreResponse }
     * 
     */
    public GetScoreResponse createGetScoreResponse() {
        return new GetScoreResponse();
    }

    /**
     * Create an instance of {@link RestScore }
     * 
     */
    public RestScore createRestScore() {
        return new RestScore();
    }

    /**
     * Create an instance of {@link RestScoreResponse }
     * 
     */
    public RestScoreResponse createRestScoreResponse() {
        return new RestScoreResponse();
    }

    /**
     * Create an instance of {@link UpdateScore }
     * 
     */
    public UpdateScore createUpdateScore() {
        return new UpdateScore();
    }

    /**
     * Create an instance of {@link UpdateScoreResponse }
     * 
     */
    public UpdateScoreResponse createUpdateScoreResponse() {
        return new UpdateScoreResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "getScore")
    public JAXBElement<GetScore> createGetScore(GetScore value) {
        return new JAXBElement<GetScore>(_GetScore_QNAME, GetScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "getScoreResponse")
    public JAXBElement<GetScoreResponse> createGetScoreResponse(GetScoreResponse value) {
        return new JAXBElement<GetScoreResponse>(_GetScoreResponse_QNAME, GetScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "restScore")
    public JAXBElement<RestScore> createRestScore(RestScore value) {
        return new JAXBElement<RestScore>(_RestScore_QNAME, RestScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "restScoreResponse")
    public JAXBElement<RestScoreResponse> createRestScoreResponse(RestScoreResponse value) {
        return new JAXBElement<RestScoreResponse>(_RestScoreResponse_QNAME, RestScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "updateScore")
    public JAXBElement<UpdateScore> createUpdateScore(UpdateScore value) {
        return new JAXBElement<UpdateScore>(_UpdateScore_QNAME, UpdateScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.web.com/", name = "updateScoreResponse")
    public JAXBElement<UpdateScoreResponse> createUpdateScoreResponse(UpdateScoreResponse value) {
        return new JAXBElement<UpdateScoreResponse>(_UpdateScoreResponse_QNAME, UpdateScoreResponse.class, null, value);
    }

}