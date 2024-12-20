package org.vivoweb.harvester.extractdspace.vocab.vivo;

import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

public class BIBO {
    /**
     * <p>The namespace of the vocabulary as a string</p>
     */
    public static final String NS = "http://purl.org/ontology/bibo/";
    /**
     * <p>The ontology model that holds the vocabulary terms</p>
     */
    private static final OntModel M_MODEL =
        ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
    /**
     * <p>The namespace of the vocabulary as a resource</p>
     */
    public static final Resource NAMESPACE = M_MODEL.createResource(NS);
    /**
     * <p>A legal decision that affirms a ruling.</p>
     */
    public static final ObjectProperty affirmedBy =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/affirmedBy");
    /**
     * <p>Critical or explanatory note for a Document.</p>
     */
    public static final ObjectProperty annotates =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/annotates");
    public static final ObjectProperty citedBy =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/citedBy");
    public static final ObjectProperty cites =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/cites");
    /**
     * <p>A court associated with a legal document; for example, that which issues a
     * decision.</p>
     */
    public static final ObjectProperty court =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/court");
    /**
     * <p>The thesis degree.</p>
     */
    public static final ObjectProperty degree =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/degree");
    /**
     * <p>A Film director.</p>
     */
    public static final ObjectProperty director =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/director");
    public static final ObjectProperty distributor =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/distributor");
    /**
     * <p>An agent that is interviewed by another agent.</p>
     */
    public static final ObjectProperty interviewee =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/interviewee");
    /**
     * <p>An agent that interview another agent.</p>
     */
    public static final ObjectProperty interviewer =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/interviewer");
    /**
     * <p>An entity responsible for issuing often informally published documents such
     * as press releases, reports, etc.</p>
     */
    public static final ObjectProperty issuer =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/issuer");
    public static final ObjectProperty performer =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/performer");
    /**
     * <p>Relates a document to an event; for example, a paper to a conference.</p>
     */
    public static final ObjectProperty presentedAt =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/presentedAt");
    /**
     * <p>Relates an event to associated documents; for example, conference to a paper.</p>
     */
    public static final ObjectProperty presents =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/presents");
    /**
     * <p>An agent that receives a communication document.</p>
     */
    public static final ObjectProperty recipient =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/recipient");
    public static final ObjectProperty reproducedIn =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/reproducedIn");
    /**
     * <p>A legal decision that reverses a ruling.</p>
     */
    public static final ObjectProperty reversedBy =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/reversedBy");
    public static final ObjectProperty reviewOf =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/reviewOf");
    public static final ObjectProperty status =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/status");
    /**
     * <p>A legal decision on appeal that takes action on a case (affirming it, reversing
     * it, etc.).</p>
     */
    public static final ObjectProperty subsequentLegalDecision =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/subsequentLegalDecision");
    /**
     * <p>Relates a document to some transcribed original.</p>
     */
    public static final ObjectProperty transcriptOf =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/transcriptOf");
    /**
     * <p>Relates a translated document to the original document.</p>
     */
    public static final ObjectProperty translationOf =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/translationOf");
    public static final ObjectProperty translator =
        M_MODEL.createObjectProperty("http://purl.org/ontology/bibo/translator");
    /**
     * <p>A summary of the resource.</p>
     */
    public static final DatatypeProperty abstract_ =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/abstract");
    /**
     * <p>Amazon Standard Identification Number</p>
     */
    public static final DatatypeProperty asin =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/asin");
    /**
     * <p>An chapter number</p>
     */
    public static final DatatypeProperty chapter =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/chapter");
    /**
     * <p>An identifier of serials, still in use by libraries, but replaced by ISSN
     * for any new work</p>
     */
    public static final DatatypeProperty coden =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/coden");
    /**
     * <p>Digital Object Identifier</p>
     */
    public static final DatatypeProperty doi =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/doi");
    /**
     * <p>European Article Number/Uniform Commercier Code 13</p>
     */
    public static final DatatypeProperty eanucc13 =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/eanucc13");
    /**
     * <p>The name defining a special edition of a document. Normally its a literal
     * value composed of a version number and words.</p>
     */
    public static final DatatypeProperty edition =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/edition");
    /**
     * <p>The electronic ISSN number of a periodical.</p>
     */
    public static final DatatypeProperty eissn =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/eissn");
    /**
     * <p>Global Trade Item Number 14</p>
     */
    public static final DatatypeProperty gtin14 =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/gtin14");
    public static final DatatypeProperty identifier =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/identifier");
    public static final DatatypeProperty isbn10 =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/isbn10");
    public static final DatatypeProperty isbn13 =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/isbn13");
    /**
     * <p>International Standard Serial Number</p>
     */
    public static final DatatypeProperty issn =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/issn");
    public static final DatatypeProperty issue =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/issue");
    /**
     * <p>Library of Congress Control Number</p>
     */
    public static final DatatypeProperty lccn =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/lccn");
    /**
     * <p>A description (often numeric) that locates an item within a containing document
     * or collection.</p>
     */
    public static final DatatypeProperty locator =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/locator");
    public static final DatatypeProperty numPages =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/numPages");
    public static final DatatypeProperty number =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/number");
    /**
     * <p>OCLC Identifier</p>
     */
    public static final DatatypeProperty oclcnum =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/oclcnum");
    /**
     * <p>Ending page number within a continuous page range.</p>
     */
    public static final DatatypeProperty pageEnd =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/pageEnd");
    /**
     * <p>Starting page number within a continuous page range.</p>
     */
    public static final DatatypeProperty pageStart =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/pageStart");
    /**
     * <p>PubMed Identifier</p>
     */
    public static final DatatypeProperty pmid =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/pmid");
    /**
     * <p>The prefix of a name</p>
     */
    public static final DatatypeProperty prefixName =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/prefixName");
    /**
     * <p>An section number</p>
     */
    public static final DatatypeProperty section =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/section");
    /**
     * <p>A short description of the resource.</p>
     */
    public static final DatatypeProperty shortDescription =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/shortDescription");
    /**
     * <p>Serial Item and Contribution Identifier</p>
     */
    public static final DatatypeProperty sici =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/sici");
    /**
     * <p>Universal Product Code</p>
     */
    public static final DatatypeProperty upc =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/upc");
    public static final DatatypeProperty uri =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/uri");
    public static final DatatypeProperty volume =
        M_MODEL.createDatatypeProperty("http://purl.org/ontology/bibo/volume");
    /**
     * <p>A scholarly academic article, typically published in a journal.</p>
     */
    public static final OntClass AcademicArticle =
        M_MODEL.createClass("http://purl.org/ontology/bibo/AcademicArticle");
    /**
     * <p>A written composition in prose, usually nonfiction, on a specific topic, forming
     * an independent part of a book or other publication, as a newspaper or magazine.</p>
     */
    public static final OntClass Article =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Article");
    /**
     * <p>An audio document; aka record.</p>
     */
    public static final OntClass AudioDocument =
        M_MODEL.createClass("http://purl.org/ontology/bibo/AudioDocument");
    /**
     * <p>An audio-visual document; film, video, and so forth.</p>
     */
    public static final OntClass AudioVisualDocument =
        M_MODEL.createClass("http://purl.org/ontology/bibo/AudioVisualDocument");
    /**
     * <p>Draft legislation presented for discussion to a legal body.</p>
     */
    public static final OntClass Bill = M_MODEL.createClass("http://purl.org/ontology/bibo/Bill");
    /**
     * <p>A written or printed work of fiction or nonfiction, usually on sheets of paper
     * fastened or bound together within covers.</p>
     */
    public static final OntClass Book = M_MODEL.createClass("http://purl.org/ontology/bibo/Book");
    /**
     * <p>A section of a book.</p>
     */
    public static final OntClass BookSection =
        M_MODEL.createClass("http://purl.org/ontology/bibo/BookSection");
    /**
     * <p>A written argument submitted to a court.</p>
     */
    public static final OntClass Brief = M_MODEL.createClass("http://purl.org/ontology/bibo/Brief");
    /**
     * <p>A chapter of a book.</p>
     */
    public static final OntClass Chapter =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Chapter");
    /**
     * <p>A collection of statutes.</p>
     */
    public static final OntClass Code = M_MODEL.createClass("http://purl.org/ontology/bibo/Code");
    /**
     * <p>A document that simultaneously contains other documents.</p>
     */
    public static final OntClass CollectedDocument =
        M_MODEL.createClass("http://purl.org/ontology/bibo/CollectedDocument");
    /**
     * <p>A collection of Documents or Collections</p>
     */
    public static final OntClass Collection =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Collection");
    /**
     * <p>A meeting for consultation or discussion.</p>
     */
    public static final OntClass Conference =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Conference");
    /**
     * <p>A collection of legal cases.</p>
     */
    public static final OntClass CourtReporter =
        M_MODEL.createClass("http://purl.org/ontology/bibo/CourtReporter");
    /**
     * <p>A document (noun) is a bounded physical representation of body of information
     * designed with the capacity (and usually intent) to communicate. A document
     * may manifest symbolic, diagrammatic or sensory-representational information.</p>
     */
    public static final OntClass Document =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Document");
    /**
     * <p>a distinct part of a larger document or collected document.</p>
     */
    public static final OntClass DocumentPart =
        M_MODEL.createClass("http://purl.org/ontology/bibo/DocumentPart");
    /**
     * <p>The status of the publication of a document.</p>
     */
    public static final OntClass DocumentStatus =
        M_MODEL.createClass("http://purl.org/ontology/bibo/DocumentStatus");
    /**
     * <p>An edited book.</p>
     */
    public static final OntClass EditedBook =
        M_MODEL.createClass("http://purl.org/ontology/bibo/EditedBook");
    /**
     * <p>A passage selected from a larger work.</p>
     */
    public static final OntClass Excerpt =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Excerpt");
    /**
     * <p>aka movie.</p>
     */
    public static final OntClass Film = M_MODEL.createClass("http://purl.org/ontology/bibo/Film");
    /**
     * <p>An instance or a session in which testimony and arguments are presented, esp.
     * before an official, as a judge in a lawsuit.</p>
     */
    public static final OntClass Hearing =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Hearing");
    /**
     * <p>A document that presents visual or diagrammatic information.</p>
     */
    public static final OntClass Image = M_MODEL.createClass("http://purl.org/ontology/bibo/Image");
    /**
     * <p>A formalized discussion between two or more people.</p>
     */
    public static final OntClass Interview =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Interview");
    /**
     * <p>something that is printed or published and distributed, esp. a given number
     * of a periodical</p>
     */
    public static final OntClass Issue = M_MODEL.createClass("http://purl.org/ontology/bibo/Issue");
    /**
     * <p>A periodical of scholarly journal Articles.</p>
     */
    public static final OntClass Journal =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Journal");
    /**
     * <p>A document accompanying a legal case.</p>
     */
    public static final OntClass LegalCaseDocument =
        M_MODEL.createClass("http://purl.org/ontology/bibo/LegalCaseDocument");
    /**
     * <p>A document containing an authoritative determination (as a decree or judgment)
     * made after consideration of facts or law.</p>
     */
    public static final OntClass LegalDecision =
        M_MODEL.createClass("http://purl.org/ontology/bibo/LegalDecision");
    /**
     * <p>A legal document; for example, a court decision, a brief, and so forth.</p>
     */
    public static final OntClass LegalDocument =
        M_MODEL.createClass("http://purl.org/ontology/bibo/LegalDocument");
    /**
     * <p>A legal document proposing or enacting a law or a group of laws.</p>
     */
    public static final OntClass Legislation =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Legislation");
    public static final OntClass Letter =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Letter");
    /**
     * <p>A periodical of magazine Articles. A magazine is a publication that is issued
     * periodically, usually bound in a paper cover, and typically contains essays,
     * stories, poems, etc., by many writers, and often photographs and drawings,
     * frequently specializing in a particular subject or area, as hobbies, news,
     * or sports.</p>
     */
    public static final OntClass Magazine =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Magazine");
    /**
     * <p>A small reference book, especially one giving instructions.</p>
     */
    public static final OntClass Manual =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Manual");
    /**
     * <p>An unpublished Document, which may also be submitted to a publisher for publication.</p>
     */
    public static final OntClass Manuscript =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Manuscript");
    /**
     * <p>A graphical depiction of geographic features.</p>
     */
    public static final OntClass Map = M_MODEL.createClass("http://purl.org/ontology/bibo/Map");
    /**
     * <p>A periodical of documents, usually issued daily or weekly, containing current
     * news, editorials, feature articles, and usually advertising.</p>
     */
    public static final OntClass Newspaper =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Newspaper");
    /**
     * <p>Notes or annotations about a resource.</p>
     */
    public static final OntClass Note = M_MODEL.createClass("http://purl.org/ontology/bibo/Note");
    /**
     * <p>A document describing the exclusive right granted by a government to an inventor
     * to manufacture, use, or sell an invention for a certain number of years.</p>
     */
    public static final OntClass Patent =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Patent");
    /**
     * <p>A public performance.</p>
     */
    public static final OntClass Performance =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Performance");
    /**
     * <p>A group of related documents issued at regular intervals.</p>
     */
    public static final OntClass Periodical =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Periodical");
    public static final OntClass PersonalCommunicationDocument =
        M_MODEL.createClass("http://purl.org/ontology/bibo/PersonalCommunicationDocument");
    /**
     * <p>A compilation of documents published from an event, such as a conference.</p>
     */
    public static final OntClass Proceedings =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Proceedings");
    /**
     * <p>An excerpted collection of words.</p>
     */
    public static final OntClass Quote = M_MODEL.createClass("http://purl.org/ontology/bibo/Quote");
    /**
     * <p>A document that presents authoritative reference information, such as a dictionary
     * or encylopedia .</p>
     */
    public static final OntClass ReferenceSource =
        M_MODEL.createClass("http://purl.org/ontology/bibo/ReferenceSource");
    /**
     * <p>A document describing an account or statement describing in detail an event,
     * situation, or the like, usually as the result of observation, inquiry, etc..</p>
     */
    public static final OntClass Report =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Report");
    /**
     * <p>A loose, thematic, collection of Documents, often Books.</p>
     */
    public static final OntClass Series =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Series");
    /**
     * <p>A slide in a slideshow</p>
     */
    public static final OntClass Slide = M_MODEL.createClass("http://purl.org/ontology/bibo/Slide");
    /**
     * <p>A presentation of a series of slides, usually presented in front of an audience
     * with written text and images.</p>
     */
    public static final OntClass Slideshow =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Slideshow");
    /**
     * <p>A document describing a standard</p>
     */
    public static final OntClass Standard =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Standard");
    /**
     * <p>A bill enacted into law.</p>
     */
    public static final OntClass Statute =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Statute");
    /**
     * <p>A document created to summarize research findings associated with the completion
     * of an academic degree.</p>
     */
    public static final OntClass Thesis =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Thesis");
    /**
     * <p>The academic degree of a Thesis</p>
     */
    public static final OntClass ThesisDegree =
        M_MODEL.createClass("http://purl.org/ontology/bibo/ThesisDegree");
    /**
     * <p>A web page is an online document available (at least initially) on the world
     * wide web. A web page is written first and foremost to appear on the web, as
     * distinct from other online resources such as books, manuscripts or audio documents
     * which use the web primarily as a distribution mechanism alongside other more
     * traditional methods such as print.</p>
     */
    public static final OntClass Webpage =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Webpage");
    /**
     * <p>A group of Webpages accessible on the Web.</p>
     */
    public static final OntClass Website =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Website");
    /**
     * <p>A seminar, discussion group, or the like, that emphasizes zxchange of ideas
     * and the demonstration and application of techniques, skills, etc.</p>
     */
    public static final OntClass Workshop =
        M_MODEL.createClass("http://purl.org/ontology/bibo/Workshop");

    /**
     * <p>The namespace of the vocabulary as a string</p>
     *
     * @return namespace as String
     * @see #NS
     */
    public static String getURI() {
        return NS;
    }

}
