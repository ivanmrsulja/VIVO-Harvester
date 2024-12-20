package org.vivoweb.harvester.extractdspace.vocab.vivo;

import org.apache.jena.ontology.AnnotationProperty;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

public class OBO {
    /**
     * <p>The namespace of the vocabulary as a string</p>
     */
    public static final String NS = "http://purl.obolibrary.org/obo/";
    /**
     * <p>The ontology model that holds the vocabulary terms</p>
     */
    private static final OntModel M_MODEL =
        ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
    /**
     * <p>The namespace of the vocabulary as a resource</p>
     */
    public static final Resource NAMESPACE = M_MODEL.createResource(NS);
    public static final ObjectProperty ARG_2000028 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ARG_2000028");
    public static final ObjectProperty ARG_2000029 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ARG_2000029");
    public static final ObjectProperty ARG_2000390 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ARG_2000390");
    public static final ObjectProperty ARG_2000391 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ARG_2000391");
    public static final ObjectProperty ARG_2000399 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ARG_2000399");
    public static final ObjectProperty BFO_0000050 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/BFO_0000050");
    public static final ObjectProperty BFO_0000051 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/BFO_0000051");
    public static final ObjectProperty BFO_0000054 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/BFO_0000054");
    public static final ObjectProperty BFO_0000055 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/BFO_0000055");
    /**
     * <p>change the domain tye to access service</p>
     */
    public static final ObjectProperty ERO_0000029 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000029");
    /**
     * <p>Here there are things to be fixed (for instance a service can use a technique...)</p>
     */
    public static final ObjectProperty ERO_0000031 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000031");
    public static final ObjectProperty ERO_0000033 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000033");
    public static final ObjectProperty ERO_0000034 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000034");
    public static final ObjectProperty ERO_0000037 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000037");
    public static final ObjectProperty ERO_0000038 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000038");
    public static final ObjectProperty ERO_0000070 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000070");
    public static final ObjectProperty ERO_0000390 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000390");
    public static final ObjectProperty ERO_0000397 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000397");
    public static final ObjectProperty ERO_0000398 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000398");
    public static final ObjectProperty ERO_0000460 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000460");
    /**
     * <p>placeholder: need to be modeled for the proper kind of service (production
     * services)</p>
     */
    public static final ObjectProperty ERO_0000481 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000481");
    /**
     * <p>Placeholder needs to be redesign</p>
     */
    public static final ObjectProperty ERO_0000482 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000482");
    public static final ObjectProperty ERO_0000543 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000543");
    public static final ObjectProperty ERO_0000572 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000572");
    public static final ObjectProperty ERO_0000775 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000775");
    public static final ObjectProperty ERO_0000918 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000918");
    public static final ObjectProperty ERO_0000919 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0000919");
    public static final ObjectProperty ERO_0001518 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0001518");
    public static final ObjectProperty ERO_0001520 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0001520");
    public static final ObjectProperty ERO_0001521 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/ERO_0001521");
    public static final ObjectProperty IAO_0000039 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/IAO_0000039");
    public static final ObjectProperty IAO_0000136 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/IAO_0000136");
    public static final ObjectProperty IAO_0000142 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/IAO_0000142");
    public static final ObjectProperty IAO_0000221 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/IAO_0000221");
    public static final ObjectProperty IAO_0000417 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/IAO_0000417");
    public static final ObjectProperty OBI_0000293 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000293");
    public static final ObjectProperty OBI_0000299 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000299");
    public static final ObjectProperty OBI_0000304 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000304");
    public static final ObjectProperty OBI_0000312 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000312");
    public static final ObjectProperty OBI_0000417 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000417");
    public static final ObjectProperty OBI_0000643 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000643");
    public static final ObjectProperty OBI_0000833 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/OBI_0000833");
    public static final ObjectProperty RO_0000052 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0000052");
    public static final ObjectProperty RO_0000053 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0000053");
    public static final ObjectProperty RO_0000056 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0000056");
    public static final ObjectProperty RO_0000057 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0000057");
    public static final ObjectProperty RO_0001000 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0001000");
    public static final ObjectProperty RO_0001015 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0001015");
    public static final ObjectProperty RO_0001018 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0001018");
    public static final ObjectProperty RO_0001019 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0001019");
    public static final ObjectProperty RO_0001025 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0001025");
    public static final ObjectProperty RO_0002220 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0002220");
    public static final ObjectProperty RO_0002233 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0002233");
    public static final ObjectProperty RO_0002234 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0002234");
    public static final ObjectProperty RO_0002350 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0002350");
    public static final ObjectProperty RO_0002351 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0002351");
    public static final ObjectProperty RO_0002353 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0002353");
    public static final ObjectProperty RO_0003000 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0003000");
    public static final ObjectProperty RO_0003001 =
        M_MODEL.createObjectProperty("http://purl.obolibrary.org/obo/RO_0003001");
    public static final DatatypeProperty ARG_0000001 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ARG_0000001");
    public static final DatatypeProperty ARG_0000015 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ARG_0000015");
    public static final DatatypeProperty ARG_0000172 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ARG_0000172");
    public static final DatatypeProperty ARG_0000197 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ARG_0000197");
    public static final DatatypeProperty ARG_2000012 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ARG_2000012");
    public static final DatatypeProperty ERO_0000044 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000044");
    public static final DatatypeProperty ERO_0000045 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000045");
    public static final DatatypeProperty ERO_0000046 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000046");
    public static final DatatypeProperty ERO_0000050 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000050");
    public static final DatatypeProperty ERO_0000054 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000054");
    public static final DatatypeProperty ERO_0000072 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000072");
    public static final DatatypeProperty ERO_0000424 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000424");
    public static final DatatypeProperty ERO_0000774 =
        M_MODEL.createDatatypeProperty("http://purl.obolibrary.org/obo/ERO_0000774");
    public static final AnnotationProperty ARG_0000033 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/ARG_0000033");
    public static final AnnotationProperty BFO_0000179 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/BFO_0000179");
    public static final AnnotationProperty BFO_0000180 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/BFO_0000180");
    public static final AnnotationProperty IAO_0000111 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000111");
    public static final AnnotationProperty IAO_0000112 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000112");
    public static final AnnotationProperty IAO_0000114 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000114");
    public static final AnnotationProperty IAO_0000115 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000115");
    public static final AnnotationProperty IAO_0000116 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000116");
    public static final AnnotationProperty IAO_0000117 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000117");
    public static final AnnotationProperty IAO_0000118 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000118");
    public static final AnnotationProperty IAO_0000119 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000119");
    public static final AnnotationProperty IAO_0000231 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000231");
    public static final AnnotationProperty IAO_0000232 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000232");
    public static final AnnotationProperty IAO_0000412 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000412");
    public static final AnnotationProperty IAO_0000600 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000600");
    public static final AnnotationProperty IAO_0000601 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000601");
    public static final AnnotationProperty IAO_0000602 =
        M_MODEL.createAnnotationProperty("http://purl.obolibrary.org/obo/IAO_0000602");
    public static final OntClass ARG_0000008 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_0000008");
    public static final OntClass ARG_2000008 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000008");
    public static final OntClass ARG_2000009 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000009");
    public static final OntClass ARG_2000010 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000010");
    public static final OntClass ARG_2000011 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000011");
    public static final OntClass ARG_2000021 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000021");
    public static final OntClass ARG_2000022 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000022");
    public static final OntClass ARG_2000376 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000376");
    public static final OntClass ARG_2000377 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000377");
    public static final OntClass ARG_2000379 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ARG_2000379");
    public static final OntClass BCO_0000003 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BCO_0000003");
    public static final OntClass BCO_0000042 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BCO_0000042");
    public static final OntClass BFO_0000001 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000001");
    public static final OntClass BFO_0000002 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000002");
    public static final OntClass BFO_0000003 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000003");
    public static final OntClass BFO_0000004 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000004");
    public static final OntClass BFO_0000006 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000006");
    public static final OntClass BFO_0000008 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000008");
    public static final OntClass BFO_0000015 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000015");
    public static final OntClass BFO_0000016 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000016");
    public static final OntClass BFO_0000017 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000017");
    public static final OntClass BFO_0000019 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000019");
    public static final OntClass BFO_0000020 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000020");
    public static final OntClass BFO_0000023 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000023");
    public static final OntClass BFO_0000029 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000029");
    public static final OntClass BFO_0000031 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000031");
    public static final OntClass BFO_0000034 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000034");
    public static final OntClass BFO_0000038 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000038");
    public static final OntClass BFO_0000040 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000040");
    public static final OntClass BFO_0000141 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000141");
    public static final OntClass BFO_0000148 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/BFO_0000148");
    /**
     * <p>See OBI listserv discussion for considerations in defining instrument. http://sourceforge.net/tracker/index.php?func=detail&amp;aid=2894801&amp;group_id=177891&amp;atid=886178</p>
     */
    public static final OntClass ERO_0000004 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000004");
    /**
     * <p>Coordinate with NIF. NIF ID: nlx_res_20090105</p>
     */
    public static final OntClass ERO_0000005 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000005");
    /**
     * <p>Placeholder for class to be imported from the Reagent Ontology (ReO).</p>
     */
    public static final OntClass ERO_0000006 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000006");
    /**
     * <p>Protocol is added to eagle-i temporarily until a relationship between the
     * informatio entity "protocol" and these planned processes is created. This
     * class refers to the axtual process not the document</p>
     */
    public static final OntClass ERO_0000007 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000007");
    public static final OntClass ERO_0000012 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000012");
    /**
     * <p>Maybe SameAs "Investigation" but is the subject of funding</p>
     */
    public static final OntClass ERO_0000014 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000014");
    /**
     * <p>This should be imported from OCRE- but they currently have no generic human
     * study type. Def is modified.</p>
     */
    public static final OntClass ERO_0000015 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000015");
    public static final OntClass ERO_0000016 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000016");
    /**
     * <p>Should have relationship to Organism</p>
     */
    public static final OntClass ERO_0000020 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000020");
    /**
     * <p>IAO is a planned specification, in SWO is an Information artifact. In eagle-i,
     * we have a need to collect material instances and is it thus currently classified
     * as a material entity.</p>
     */
    public static final OntClass ERO_0000071 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000071");
    public static final OntClass ERO_0000224 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000224");
    public static final OntClass ERO_0000225 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000225");
    /**
     * <p>Coordinate with NIF</p>
     */
    public static final OntClass ERO_0000391 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000391");
    /**
     * <p>coordinate with NIF. NIF ID:nlx_res_20090419</p>
     */
    public static final OntClass ERO_0000392 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000392");
    /**
     * <p>Coordinate with NIF. NIF ID: nlx_res_20090444</p>
     */
    public static final OntClass ERO_0000393 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000393");
    /**
     * <p>Coordinate with NIF: NIF ID: nlx_res_20090416</p>
     */
    public static final OntClass ERO_0000394 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000394");
    /**
     * <p>Coordinate with NIF: NIF ID: nlx_res_20090420</p>
     */
    public static final OntClass ERO_0000395 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000395");
    /**
     * <p>Coordinate with NIF. NIF ID: nlx_res_20090418</p>
     */
    public static final OntClass ERO_0000396 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000396");
    public static final OntClass ERO_0000565 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000565");
    public static final OntClass ERO_0000595 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000595");
    public static final OntClass ERO_0000776 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000776");
    public static final OntClass ERO_0000777 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000777");
    public static final OntClass ERO_0000778 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000778");
    public static final OntClass ERO_0000779 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000779");
    public static final OntClass ERO_0000780 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000780");
    public static final OntClass ERO_0000783 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000783");
    public static final OntClass ERO_0000784 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000784");
    public static final OntClass ERO_0000785 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000785");
    public static final OntClass ERO_0000786 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000786");
    public static final OntClass ERO_0000787 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000787");
    public static final OntClass ERO_0000788 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000788");
    public static final OntClass ERO_0000789 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000789");
    public static final OntClass ERO_0000790 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000790");
    public static final OntClass ERO_0000914 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0000914");
    public static final OntClass ERO_0001245 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001245");
    public static final OntClass ERO_0001254 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001254");
    public static final OntClass ERO_0001255 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001255");
    public static final OntClass ERO_0001256 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001256");
    public static final OntClass ERO_0001257 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001257");
    public static final OntClass ERO_0001258 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001258");
    public static final OntClass ERO_0001259 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001259");
    public static final OntClass ERO_0001260 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001260");
    public static final OntClass ERO_0001261 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001261");
    public static final OntClass ERO_0001262 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001262");
    public static final OntClass ERO_0001263 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001263");
    /**
     * <p>Just a place horder. It will probably be replaced by NIF term: http://ontology.neuinfo.org/NIF/DigitalEntities/NIF-Resource.owl#nlx_res_20090405</p>
     */
    public static final OntClass ERO_0001716 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/ERO_0001716");
    public static final OntClass IAO_0000003 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000003");
    public static final OntClass IAO_0000005 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000005");
    public static final OntClass IAO_0000007 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000007");
    public static final OntClass IAO_0000009 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000009");
    public static final OntClass IAO_0000013 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000013");
    public static final OntClass IAO_0000027 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000027");
    public static final OntClass IAO_0000030 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000030");
    public static final OntClass IAO_0000032 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000032");
    public static final OntClass IAO_0000033 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000033");
    public static final OntClass IAO_0000102 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000102");
    public static final OntClass IAO_0000104 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000104");
    public static final OntClass IAO_0000109 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000109");
    public static final OntClass IAO_0000144 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000144");
    public static final OntClass IAO_0000300 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/IAO_0000300");
    public static final OntClass OBI_0000011 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000011");
    public static final OntClass OBI_0000017 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000017");
    public static final OntClass OBI_0000066 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000066");
    public static final OntClass OBI_0000086 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000086");
    public static final OntClass OBI_0000094 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000094");
    public static final OntClass OBI_0000272 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000272");
    public static final OntClass OBI_0000571 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000571");
    public static final OntClass OBI_0000835 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0000835");
    public static final OntClass OBI_0001554 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0001554");
    public static final OntClass OBI_0100026 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0100026");
    public static final OntClass OBI_0500000 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/OBI_0500000");
    public static final OntClass UO_0000280 =
        M_MODEL.createClass("http://purl.obolibrary.org/obo/UO_0000280");

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
