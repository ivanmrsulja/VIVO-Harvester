package org.vivoweb.harvester.extractdspace.vocab.vivo;

import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

public class VIVO {
    /**
     * <p>The namespace of the vocabulary as a string</p>
     */
    public static final String NS = "http://vivoweb.org/ontology/core#";
    /**
     * <p>The ontology model that holds the vocabulary terms</p>
     */
    private static final OntModel M_MODEL =
        ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
    /**
     * <p>The namespace of the vocabulary as a resource</p>
     */
    public static final Resource NAMESPACE = M_MODEL.createResource(NS);
    public static final ObjectProperty affiliatedOrganization =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#affiliatedOrganization");
    public static final ObjectProperty assignedBy =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#assignedBy");
    public static final ObjectProperty assignee =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#assignee");
    public static final ObjectProperty assigneeFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#assigneeFor");
    public static final ObjectProperty assigns =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#assigns");
    public static final ObjectProperty conceptAssociatedWith =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#conceptAssociatedWith");
    /**
     * <p>Indicates that the Orcid ID has been confirmed by this Person</p>
     */
    public static final ObjectProperty confirmedOrcidId =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#confirmedOrcidId");
    public static final ObjectProperty contributingRole =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#contributingRole");
    public static final ObjectProperty dateFiled =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#dateFiled");
    public static final ObjectProperty dateIssued =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#dateIssued");
    public static final ObjectProperty dateTimeInterval =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#dateTimeInterval");
    public static final ObjectProperty dateTimePrecision =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#dateTimePrecision");
    public static final ObjectProperty dateTimeValue =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#dateTimeValue");
    public static final ObjectProperty degreeCandidacy =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#degreeCandidacy");
    public static final ObjectProperty distributes =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#distributes");
    public static final ObjectProperty distributesFundingFrom =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#distributesFundingFrom");
    public static final ObjectProperty eligibleFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#eligibleFor");
    public static final ObjectProperty end =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#end");
    public static final ObjectProperty equipmentFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#equipmentFor");
    public static final ObjectProperty expirationDate =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#expirationDate");
    public static final ObjectProperty facilityFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#facilityFor");
    public static final ObjectProperty featuredIn =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#featuredIn");
    public static final ObjectProperty features =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#features");
    public static final ObjectProperty fundingVehicleFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#fundingVehicleFor");
    public static final ObjectProperty geographicFocus =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#geographicFocus");
    public static final ObjectProperty geographicFocusOf =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#geographicFocusOf");
    public static final ObjectProperty governingAuthorityFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#governingAuthorityFor");
    public static final ObjectProperty grantSubcontractedThrough =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#grantSubcontractedThrough");
    public static final ObjectProperty hasAssociatedConcept =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasAssociatedConcept");
    public static final ObjectProperty hasCollaborator =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasCollaborator");
    public static final ObjectProperty hasEquipment =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasEquipment");
    public static final ObjectProperty hasFacility =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasFacility");
    public static final ObjectProperty hasFundingVehicle =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasFundingVehicle");
    public static final ObjectProperty hasGoverningAuthority =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasGoverningAuthority");
    public static final ObjectProperty hasPredecessorOrganization =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasPredecessorOrganization");
    public static final ObjectProperty hasPrerequisite =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasPrerequisite");
    public static final ObjectProperty hasProceedings =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasProceedings");
    public static final ObjectProperty hasPublicationVenue =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasPublicationVenue");
    public static final ObjectProperty hasResearchArea =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasResearchArea");
    public static final ObjectProperty hasSubjectArea =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasSubjectArea");
    public static final ObjectProperty hasSuccessorOrganization =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasSuccessorOrganization");
    public static final ObjectProperty hasTranslation =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#hasTranslation");
    public static final ObjectProperty informationResourceSupportedBy =
        M_MODEL.createObjectProperty(
            "http://vivoweb.org/ontology/core#informationResourceSupportedBy");
    public static final ObjectProperty offeredBy =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#offeredBy");
    public static final ObjectProperty offers =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#offers");
    public static final ObjectProperty orcidId =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#orcidId");
    public static final ObjectProperty prerequisiteFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#prerequisiteFor");
    public static final ObjectProperty proceedingsOf =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#proceedingsOf");
    public static final ObjectProperty providesFundingThrough =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#providesFundingThrough");
    public static final ObjectProperty publicationVenueFor =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#publicationVenueFor");
    public static final ObjectProperty publisher =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#publisher");
    public static final ObjectProperty publisherOf =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#publisherOf");
    public static final ObjectProperty relatedBy =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#relatedBy");
    public static final ObjectProperty relates =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#relates");
    public static final ObjectProperty reproduces =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#reproduces");
    public static final ObjectProperty researchAreaOf =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#researchAreaOf");
    public static final ObjectProperty reviewedIn =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#reviewedIn");
    public static final ObjectProperty roleContributesTo =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#roleContributesTo");
    public static final ObjectProperty sponsoredBy =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#sponsoredBy");
    public static final ObjectProperty sponsors =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#sponsors");
    public static final ObjectProperty start =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#start");
    public static final ObjectProperty subcontractsGrant =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#subcontractsGrant");
    public static final ObjectProperty subjectAreaOf =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#subjectAreaOf");
    public static final ObjectProperty supportedBy =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#supportedBy");
    public static final ObjectProperty supportedInformationResource = M_MODEL.createObjectProperty(
        "http://vivoweb.org/ontology/core#supportedInformationResource");
    public static final ObjectProperty supports =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#supports");
    public static final ObjectProperty translatorOf =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#translatorOf");
    public static final ObjectProperty validIn =
        M_MODEL.createObjectProperty("http://vivoweb.org/ontology/core#validIn");
    public static final DatatypeProperty abbreviation =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#abbreviation");
    public static final DatatypeProperty cclCode =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#cclCode");
    public static final DatatypeProperty contactInformation =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#contactInformation");
    public static final DatatypeProperty courseCredits =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#courseCredits");
    public static final DatatypeProperty dateTime =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#dateTime");
    public static final DatatypeProperty departmentOrSchool =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#departmentOrSchool");
    public static final DatatypeProperty description =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#description");
    public static final DatatypeProperty eRACommonsId =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#eRACommonsId");
    public static final DatatypeProperty entryTerm =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#entryTerm");
    public static final DatatypeProperty freetextKeyword =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#freetextKeyword");
    public static final DatatypeProperty grantDirectCosts =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#grantDirectCosts");
    public static final DatatypeProperty hasMonetaryAmount =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#hasMonetaryAmount");
    public static final DatatypeProperty hasValue =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#hasValue");
    public static final DatatypeProperty hideFromDisplay =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#hideFromDisplay");
    public static final DatatypeProperty hrJobTitle =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#hrJobTitle");
    public static final DatatypeProperty iclCode =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#iclCode");
    public static final DatatypeProperty identifier =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#identifier");
    public static final DatatypeProperty isCorrespondingAuthor =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#isCorrespondingAuthor");
    public static final DatatypeProperty licenseNumber =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#licenseNumber");
    public static final DatatypeProperty localAwardId =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#localAwardId");
    public static final DatatypeProperty majorField =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#majorField");
    public static final DatatypeProperty middleName =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#middleName");
    public static final DatatypeProperty nihmsid =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#nihmsid");
    public static final DatatypeProperty outreachOverview =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#outreachOverview");
    public static final DatatypeProperty overview =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#overview");
    public static final DatatypeProperty patentNumber =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#patentNumber");
    public static final DatatypeProperty placeOfPublication =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#placeOfPublication");
    public static final DatatypeProperty pmcid =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#pmcid");
    public static final DatatypeProperty preferredDisplayOrder =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#preferredDisplayOrder");
    public static final DatatypeProperty rank =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#rank");
    public static final DatatypeProperty reportId =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#reportId");
    public static final DatatypeProperty researchOverview =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#researchOverview");
    public static final DatatypeProperty researcherId =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#researcherId");
    public static final DatatypeProperty scopusId =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#scopusId");
    public static final DatatypeProperty seatingCapacity =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#seatingCapacity");
    public static final DatatypeProperty sponsorAwardId =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#sponsorAwardId");
    public static final DatatypeProperty supplementalInformation =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#supplementalInformation");
    public static final DatatypeProperty teachingOverview =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#teachingOverview");
    public static final DatatypeProperty termLabel =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#termLabel");
    public static final DatatypeProperty termType =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#termType");
    public static final DatatypeProperty totalAwardAmount =
        M_MODEL.createDatatypeProperty("http://vivoweb.org/ontology/core#totalAwardAmount");
    public static final OntClass Abstract =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Abstract");
    public static final OntClass AcademicDegree =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AcademicDegree");
    public static final OntClass AcademicDepartment =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AcademicDepartment");
    public static final OntClass AcademicTerm =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AcademicTerm");
    public static final OntClass AcademicYear =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AcademicYear");
    public static final OntClass AdministratorRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AdministratorRole");
    public static final OntClass AdviseeRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AdviseeRole");
    public static final OntClass AdvisingProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AdvisingProcess");
    public static final OntClass AdvisingRelationship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AdvisingRelationship");
    public static final OntClass AdvisorRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AdvisorRole");
    public static final OntClass Association =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Association");
    public static final OntClass AttendeeRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AttendeeRole");
    public static final OntClass AttendingProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AttendingProcess");
    /**
     * <p></p>
     */
    public static final OntClass Authorship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Authorship");
    public static final OntClass Award =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Award");
    public static final OntClass AwardReceipt =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AwardReceipt");
    public static final OntClass AwardedDegree =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#AwardedDegree");
    public static final OntClass Blog =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Blog");
    public static final OntClass BlogPosting =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#BlogPosting");
    public static final OntClass Building =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Building");
    public static final OntClass Campus =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Campus");
    public static final OntClass CaseStudy =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#CaseStudy");
    public static final OntClass Catalog =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Catalog");
    public static final OntClass Center =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Center");
    public static final OntClass Certificate =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Certificate");
    public static final OntClass Certification =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Certification");
    public static final OntClass ClinicalOrganization =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ClinicalOrganization");
    public static final OntClass ClinicalRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ClinicalRole");
    public static final OntClass CoPrincipalInvestigatorRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#CoPrincipalInvestigatorRole");
    public static final OntClass CollectionProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#CollectionProcess");
    public static final OntClass College =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#College");
    public static final OntClass Committee =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Committee");
    public static final OntClass Company =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Company");
    public static final OntClass Competition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Competition");
    public static final OntClass ConferencePaper =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ConferencePaper");
    public static final OntClass ConferencePoster =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ConferencePoster");
    public static final OntClass ConferenceSeries =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ConferenceSeries");
    public static final OntClass Consortium =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Consortium");
    public static final OntClass Continent =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Continent");
    public static final OntClass Contract =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Contract");
    public static final OntClass CoreLaboratory =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#CoreLaboratory");
    public static final OntClass Country =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Country");
    public static final OntClass County =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#County");
    public static final OntClass Course =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Course");
    public static final OntClass Credential =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Credential");
    public static final OntClass CurationProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#CurationProcess");
    public static final OntClass Database =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Database");
    public static final OntClass Dataset =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Dataset");
    public static final OntClass DateTimeInterval =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#DateTimeInterval");
    public static final OntClass DateTimeValue =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#DateTimeValue");
    public static final OntClass DateTimeValuePrecision =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#DateTimeValuePrecision");
    public static final OntClass Department =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Department");
    public static final OntClass Division =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Division");
    public static final OntClass EditorRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EditorRole");
    public static final OntClass EditorialArticle =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EditorialArticle");
    public static final OntClass Editorship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Editorship");
    public static final OntClass EducationalProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EducationalProcess");
    public static final OntClass EmeritusFaculty =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EmeritusFaculty");
    public static final OntClass EmeritusLibrarian =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EmeritusLibrarian");
    public static final OntClass EmeritusProfessor =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EmeritusProfessor");
    public static final OntClass Equipment =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Equipment");
    public static final OntClass EventSeries =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#EventSeries");
    public static final OntClass Exhibit =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Exhibit");
    public static final OntClass ExtensionUnit =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ExtensionUnit");
    public static final OntClass F1000Link =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#F1000Link");
    public static final OntClass Facility =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Facility");
    public static final OntClass FacultyAdministrativePosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#FacultyAdministrativePosition");
    public static final OntClass FacultyMember =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#FacultyMember");
    public static final OntClass FacultyMentoringRelationship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#FacultyMentoringRelationship");
    public static final OntClass FacultyPosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#FacultyPosition");
    public static final OntClass Foundation =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Foundation");
    public static final OntClass FundingOrganization =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#FundingOrganization");
    public static final OntClass GeographicLocation =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GeographicLocation");
    public static final OntClass GeographicRegion =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GeographicRegion");
    public static final OntClass GeopoliticalEntity =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GeopoliticalEntity");
    public static final OntClass GeoreferencingProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GeoreferencingProcess");
    public static final OntClass GovernmentAgency =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GovernmentAgency");
    public static final OntClass GraduateAdvisingRelationship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GraduateAdvisingRelationship");
    public static final OntClass GraduateStudent =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#GraduateStudent");
    public static final OntClass Grant =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Grant");
    public static final OntClass Hospital =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Hospital");
    public static final OntClass IdentificationProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#IdentificationProcess");
    public static final OntClass Institute =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Institute");
    public static final OntClass Internship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Internship");
    public static final OntClass InvestigatorRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#InvestigatorRole");
    public static final OntClass InvitedTalk =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#InvitedTalk");
    public static final OntClass IssuedCredential =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#IssuedCredential");
    public static final OntClass Laboratory =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Laboratory");
    public static final OntClass LeaderRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#LeaderRole");
    public static final OntClass Librarian =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Librarian");
    public static final OntClass LibrarianPosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#LibrarianPosition");
    public static final OntClass Library =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Library");
    public static final OntClass License =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#License");
    public static final OntClass Licensure =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Licensure");
    public static final OntClass Location =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Location");
    public static final OntClass MeasurementProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#MeasurementProcess");
    public static final OntClass MedicalResidency =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#MedicalResidency");
    public static final OntClass Meeting =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Meeting");
    public static final OntClass MemberRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#MemberRole");
    public static final OntClass Museum =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Museum");
    public static final OntClass NewsRelease =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#NewsRelease");
    public static final OntClass Newsletter =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Newsletter");
    public static final OntClass NonAcademic =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#NonAcademic");
    public static final OntClass NonAcademicPosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#NonAcademicPosition");
    public static final OntClass NonFacultyAcademic =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#NonFacultyAcademic");
    public static final OntClass NonFacultyAcademicPosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#NonFacultyAcademicPosition");
    public static final OntClass OrganizerRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#OrganizerRole");
    public static final OntClass OrganizingProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#OrganizingProcess");
    public static final OntClass OutreachProviderRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#OutreachProviderRole");
    public static final OntClass PeerReviewerRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PeerReviewerRole");
    public static final OntClass PopulatedPlace =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PopulatedPlace");
    public static final OntClass Position =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Position");
    public static final OntClass Postdoc =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Postdoc");
    public static final OntClass PostdocOrFellowAdvisingRelationship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PostdocOrFellowAdvisingRelationship");
    public static final OntClass PostdocPosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PostdocPosition");
    public static final OntClass PostdoctoralTraining =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PostdoctoralTraining");
    public static final OntClass Presentation =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Presentation");
    public static final OntClass PresenterRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PresenterRole");
    public static final OntClass PresentingProcess =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PresentingProcess");
    public static final OntClass PrimaryPosition =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PrimaryPosition");
    public static final OntClass PrincipalInvestigatorRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PrincipalInvestigatorRole");
    public static final OntClass PrivateCompany =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#PrivateCompany");
    public static final OntClass Program =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Program");
    public static final OntClass Project =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Project");
    public static final OntClass Publisher =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Publisher");
    public static final OntClass Relationship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Relationship");
    public static final OntClass ResearchOrganization =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ResearchOrganization");
    public static final OntClass ResearchProposal =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ResearchProposal");
    public static final OntClass ResearcherRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ResearcherRole");
    public static final OntClass Review =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Review");
    public static final OntClass ReviewerRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ReviewerRole");
    public static final OntClass Room =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Room");
    public static final OntClass School =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#School");
    public static final OntClass Score =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Score");
    public static final OntClass Screenplay =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Screenplay");
    public static final OntClass SeminarSeries =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#SeminarSeries");
    public static final OntClass ServiceProvidingLaboratory =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#ServiceProvidingLaboratory");
    public static final OntClass Speech =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Speech");
    public static final OntClass StateOrProvince =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#StateOrProvince");
    public static final OntClass Student =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Student");
    public static final OntClass StudentOrganization =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#StudentOrganization");
    /**
     * <p>For example, the Midwest, northeast U.S.</p>
     */
    public static final OntClass SubnationalRegion =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#SubnationalRegion");
    public static final OntClass TeacherRole =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#TeacherRole");
    public static final OntClass Team =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Team");
    public static final OntClass Translation =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Translation");
    public static final OntClass UndergraduateAdvisingRelationship =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#UndergraduateAdvisingRelationship");
    public static final OntClass UndergraduateStudent =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#UndergraduateStudent");
    public static final OntClass University =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#University");
    public static final OntClass Video =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#Video");
    public static final OntClass WorkingPaper =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#WorkingPaper");
    public static final OntClass WorkshopSeries =
        M_MODEL.createClass("http://vivoweb.org/ontology/core#WorkshopSeries");

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
