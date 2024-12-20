package org.vivoweb.harvester.extractdspace.vocab.vivo;

import org.apache.jena.ontology.AnnotationProperty;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

public class GEO {
    /**
     * <p>The namespace of the vocabulary as a string</p>
     */
    public static final String NS = "http://aims.fao.org/aos/geopolitical.owl#";
    /**
     * <p>The ontology model that holds the vocabulary terms</p>
     */
    private static final OntModel M_MODEL =
        ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
    /**
     * <p>The namespace of the vocabulary as a resource</p>
     */
    public static final Resource NAMESPACE = M_MODEL.createResource(NS);
    public static final ObjectProperty hasBorderWith =
        M_MODEL.createObjectProperty("http://aims.fao.org/aos/geopolitical.owl#hasBorderWith");
    public static final ObjectProperty hasMember =
        M_MODEL.createObjectProperty("http://aims.fao.org/aos/geopolitical.owl#hasMember");
    public static final ObjectProperty isAdministeredBy =
        M_MODEL.createObjectProperty("http://aims.fao.org/aos/geopolitical.owl#isAdministeredBy");
    public static final ObjectProperty isInGroup =
        M_MODEL.createObjectProperty("http://aims.fao.org/aos/geopolitical.owl#isInGroup");
    public static final ObjectProperty isPredecessorOf =
        M_MODEL.createObjectProperty("http://aims.fao.org/aos/geopolitical.owl#isPredecessorOf");
    public static final ObjectProperty isSuccessorOf =
        M_MODEL.createObjectProperty("http://aims.fao.org/aos/geopolitical.owl#isSuccessorOf");
    public static final DatatypeProperty GDP =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#GDP");
    public static final DatatypeProperty GDPNotes =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#GDPNotes");
    public static final DatatypeProperty GDPTotalInCurrentPrices = M_MODEL.createDatatypeProperty(
        "http://aims.fao.org/aos/geopolitical.owl#GDPTotalInCurrentPrices");
    public static final DatatypeProperty GDPUnit =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#GDPUnit");
    public static final DatatypeProperty GDPYear =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#GDPYear");
    public static final DatatypeProperty HDI =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#HDI");
    public static final DatatypeProperty HDINotes =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#HDINotes");
    public static final DatatypeProperty HDITotal =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#HDITotal");
    public static final DatatypeProperty HDIUnit =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#HDIUnit");
    public static final DatatypeProperty HDIYear =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#HDIYear");
    public static final DatatypeProperty agriculturalArea =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#agriculturalArea");
    public static final DatatypeProperty agriculturalAreaNotes = M_MODEL.createDatatypeProperty(
        "http://aims.fao.org/aos/geopolitical.owl#agriculturalAreaNotes");
    public static final DatatypeProperty agriculturalAreaTotal = M_MODEL.createDatatypeProperty(
        "http://aims.fao.org/aos/geopolitical.owl#agriculturalAreaTotal");
    public static final DatatypeProperty agriculturalAreaUnit = M_MODEL.createDatatypeProperty(
        "http://aims.fao.org/aos/geopolitical.owl#agriculturalAreaUnit");
    public static final DatatypeProperty agriculturalAreaYear = M_MODEL.createDatatypeProperty(
        "http://aims.fao.org/aos/geopolitical.owl#agriculturalAreaYear");
    public static final DatatypeProperty codeAGROVOC =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeAGROVOC");
    public static final DatatypeProperty codeCurrency =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeCurrency");
    public static final DatatypeProperty codeDBPediaID =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeDBPediaID");
    public static final DatatypeProperty codeFAOSTAT =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeFAOSTAT");
    public static final DatatypeProperty codeFAOTERM =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeFAOTERM");
    public static final DatatypeProperty codeGAUL =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeGAUL");
    public static final DatatypeProperty codeISO2 =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeISO2");
    public static final DatatypeProperty codeISO3 =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeISO3");
    public static final DatatypeProperty codeUN =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeUN");
    public static final DatatypeProperty codeUNDP =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#codeUNDP");
    public static final DatatypeProperty countryArea =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#countryArea");
    public static final DatatypeProperty countryAreaNotes =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#countryAreaNotes");
    public static final DatatypeProperty countryAreaTotal =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#countryAreaTotal");
    public static final DatatypeProperty countryAreaUnit =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#countryAreaUnit");
    public static final DatatypeProperty countryAreaYear =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#countryAreaYear");
    public static final DatatypeProperty hasCode =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasCode");
    public static final DatatypeProperty hasCoordinate =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasCoordinate");
    public static final DatatypeProperty hasCurrency =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasCurrency");
    public static final DatatypeProperty hasListName =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasListName");
    public static final DatatypeProperty hasMaxLatitude =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasMaxLatitude");
    public static final DatatypeProperty hasMaxLongitude =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasMaxLongitude");
    public static final DatatypeProperty hasMinLatitude =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasMinLatitude");
    public static final DatatypeProperty hasMinLongitude =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasMinLongitude");
    public static final DatatypeProperty hasNationality =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasNationality");
    public static final DatatypeProperty hasOfficialName =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasOfficialName");
    public static final DatatypeProperty hasShortName =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasShortName");
    public static final DatatypeProperty hasStatistics =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#hasStatistics");
    public static final DatatypeProperty landArea =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#landArea");
    public static final DatatypeProperty landAreaNotes =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#landAreaNotes");
    public static final DatatypeProperty landAreaTotal =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#landAreaTotal");
    public static final DatatypeProperty landAreaUnit =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#landAreaUnit");
    public static final DatatypeProperty landAreaYear =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#landAreaYear");
    public static final DatatypeProperty nameCurrencyAR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyAR");
    public static final DatatypeProperty nameCurrencyEN =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyEN");
    public static final DatatypeProperty nameCurrencyES =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyES");
    public static final DatatypeProperty nameCurrencyFR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyFR");
    public static final DatatypeProperty nameCurrencyIT =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyIT");
    public static final DatatypeProperty nameCurrencyRU =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyRU");
    public static final DatatypeProperty nameCurrencyZH =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameCurrencyZH");
    public static final DatatypeProperty nameListAR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListAR");
    public static final DatatypeProperty nameListEN =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListEN");
    public static final DatatypeProperty nameListES =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListES");
    public static final DatatypeProperty nameListFR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListFR");
    public static final DatatypeProperty nameListIT =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListIT");
    public static final DatatypeProperty nameListRU =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListRU");
    public static final DatatypeProperty nameListZH =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameListZH");
    public static final DatatypeProperty nameOfficialAR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialAR");
    public static final DatatypeProperty nameOfficialEN =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialEN");
    public static final DatatypeProperty nameOfficialES =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialES");
    public static final DatatypeProperty nameOfficialFR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialFR");
    public static final DatatypeProperty nameOfficialIT =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialIT");
    public static final DatatypeProperty nameOfficialRU =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialRU");
    public static final DatatypeProperty nameOfficialZH =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameOfficialZH");
    public static final DatatypeProperty nameShortAR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortAR");
    public static final DatatypeProperty nameShortEN =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortEN");
    public static final DatatypeProperty nameShortES =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortES");
    public static final DatatypeProperty nameShortFR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortFR");
    public static final DatatypeProperty nameShortIT =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortIT");
    public static final DatatypeProperty nameShortRU =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortRU");
    public static final DatatypeProperty nameShortZH =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nameShortZH");
    public static final DatatypeProperty nationalityAR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityAR");
    public static final DatatypeProperty nationalityEN =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityEN");
    public static final DatatypeProperty nationalityES =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityES");
    public static final DatatypeProperty nationalityFR =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityFR");
    public static final DatatypeProperty nationalityIT =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityIT");
    public static final DatatypeProperty nationalityRU =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityRU");
    public static final DatatypeProperty nationalityZH =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#nationalityZH");
    public static final DatatypeProperty population =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#population");
    public static final DatatypeProperty populationNotes =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#populationNotes");
    public static final DatatypeProperty populationTotal =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#populationTotal");
    public static final DatatypeProperty populationUnit =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#populationUnit");
    public static final DatatypeProperty populationYear =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#populationYear");
    /**
     * <p>The value of the datatype property *validSince* associated to a particular
     * area (territory or group) indicates the area's first year of validity. The
     * geopolitical ontology traces back historic changes only until 1985, therefore,
     * if an area has a validSince = 1985, this indicates that the area is/was valid
     * since 1985 or before.</p>
     */
    public static final DatatypeProperty validSince =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#validSince");
    /**
     * <p>The value of the datatype property *validUntil* associated to a particular
     * area (territory or group) indicates the area's last year of validity. In case
     * the area is currently valid, this value is set by default to 9999.</p>
     */
    public static final DatatypeProperty validUntil =
        M_MODEL.createDatatypeProperty("http://aims.fao.org/aos/geopolitical.owl#validUntil");
    public static final AnnotationProperty sourceCreator =
        M_MODEL.createAnnotationProperty("http://aims.fao.org/aos/geopolitical.owl#sourceCreator");
    public static final AnnotationProperty sourceIdentifier = M_MODEL.createAnnotationProperty(
        "http://aims.fao.org/aos/geopolitical.owl#sourceIdentifier");
    public static final AnnotationProperty sourceModified =
        M_MODEL.createAnnotationProperty("http://aims.fao.org/aos/geopolitical.owl#sourceModified");
    public static final OntClass area =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#area");
    public static final OntClass disputed =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#disputed");
    public static final OntClass economic_region =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#economic_region");
    public static final OntClass geographical_region =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#geographical_region");
    public static final OntClass group =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#group");
    public static final OntClass non_self_governing =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#non_self_governing");
    public static final OntClass organization =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#organization");
    public static final OntClass other =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#other");
    public static final OntClass self_governing =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#self_governing");
    public static final OntClass special_group =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#special_group");
    public static final OntClass territory =
        M_MODEL.createClass("http://aims.fao.org/aos/geopolitical.owl#territory");

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
