//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.05 at 10:02:16 AM MESZ 
//


package edu.kit.cockpit.valuationserver.rest.messages;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.kit.cockpit.valuationserver.rest.messages package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.kit.cockpit.valuationserver.rest.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModelList }
     * 
     */
    public ModelList createModelList() {
        return new ModelList();
    }

    /**
     * Create an instance of {@link Votes }
     * 
     */
    public Votes createVotes() {
        return new Votes();
    }

    /**
     * Create an instance of {@link Evaluations }
     * 
     */
    public Evaluations createEvaluations() {
        return new Evaluations();
    }

    /**
     * Create an instance of {@link Vote }
     * 
     */
    public Vote createVote() {
        return new Vote();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Configuration.ConfigurationRanking }
     * 
     */
    public Configuration.ConfigurationRanking createConfigurationConfigurationRanking() {
        return new Configuration.ConfigurationRanking();
    }

    /**
     * Create an instance of {@link Configuration.ConfigurationAttributes }
     * 
     */
    public Configuration.ConfigurationAttributes createConfigurationConfigurationAttributes() {
        return new Configuration.ConfigurationAttributes();
    }

    /**
     * Create an instance of {@link ModelList.Models }
     * 
     */
    public ModelList.Models createModelListModels() {
        return new ModelList.Models();
    }

    /**
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
    }

    /**
     * Create an instance of {@link Votes.VoteEntry }
     * 
     */
    public Votes.VoteEntry createVotesVoteEntry() {
        return new Votes.VoteEntry();
    }

    /**
     * Create an instance of {@link Evaluations.EvaluationEntry }
     * 
     */
    public Evaluations.EvaluationEntry createEvaluationsEvaluationEntry() {
        return new Evaluations.EvaluationEntry();
    }

    /**
     * Create an instance of {@link Vote.Preference }
     * 
     */
    public Vote.Preference createVotePreference() {
        return new Vote.Preference();
    }

    /**
     * Create an instance of {@link Configuration.ConfigurationRanking.RankedConfiguration }
     * 
     */
    public Configuration.ConfigurationRanking.RankedConfiguration createConfigurationConfigurationRankingRankedConfiguration() {
        return new Configuration.ConfigurationRanking.RankedConfiguration();
    }

    /**
     * Create an instance of {@link Configuration.ConfigurationAttributes.FeatureAttribute }
     * 
     */
    public Configuration.ConfigurationAttributes.FeatureAttribute createConfigurationConfigurationAttributesFeatureAttribute() {
        return new Configuration.ConfigurationAttributes.FeatureAttribute();
    }

    /**
     * Create an instance of {@link ModelList.Models.Model }
     * 
     */
    public ModelList.Models.Model createModelListModelsModel() {
        return new ModelList.Models.Model();
    }

}