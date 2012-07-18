### Features
This version of the feature model designer enables:

* modeling of Domain, Service and Requirements models
* determination of possible Cloud service configurations using an integrated solver
* selection of configurations from the service models based on requirements stated in the requirements model

### Code documentation
The designer consists of three projects:

* edu.kit.cockpit.sfmdesigner (contains meta model and corresponding model code)
* edu.kit.cockpit.sfmdesigner.edit (contains item providers to edit model instances)
* edu.kit.cockpit.sfmdesigner.editor (contains the Eclipse editor as plug-in and all application logic, i.e., configuration determination, requirements filter etc.)


### Architecture
The architecture of the Cloud Feature Modeling designer is illustrated in the following figure:

# ![Architecture](https://dl.dropbox.com/u/9784913/Architecture.png)

The Cloud Feature Model Designer consists of the following components:
* CFM Modeling: This component provides the model code that defines the model elements and their relationships, based on the CFM Metamodel. The CFM API component allows to create and change model instances.
* Modeling UI: This component provides the user interface that decision makers interact with to model Cloud Feature Models, namely the EMF Editor. The modeling UI makes use of the CFM API component to change model instances upon user interaction. The Modeling UI further provides means to trigger determination of configurations and a wizard to enable users to control the requirements filtering.
* Model Analyzer: This component contains the engine to transfer Cloud Feature Models to constraint satisfaction problems (CSPs). The Reasoner is used to solve CSPs. The Feature Attribute Aggregator determines attribute values for each determined configurations. Configurations, including their attributes, are stored in the CFM by the Configuration Persistence. The analyzer is written in Groovy, thus requiring the below-stated Groovy plugin to be installed on the IDE from which the Cloud Feature Model Designer is started.
* Requirements Filter: This component contains the logic to elicit the configurations of a given service model depending on the requirements stated in a given requirements model. The Requirements Extractor reads out all requirements stated in the requirements model. The Requirements Filter then matches these requirements with the configurations of the service model.

### Preliminaries to run the designer
* Eclipse Modeling Tools (Helios v3.6, available at: http://www.eclipse.org/downloads/packages/release/helios/sr2)
* Groovy-Eclipse Feature (v2.1.2.xx-20110310, available at Eclipse update site: http://dist.springsource.org/release/GRECLIPSE/e3.6/) including: "Groovy Compiler 1.6.7 Feature", "Groovy Compiler 1.7.8 Feature", "Groovy-Eclipse Headless Feature" and "JDT Core patch for Groovy-Eclipse plugin".

### Instructions
* Determination of configurations: Right-click on any element of the model in use and select "Cloud Feature Model/Determine service configurations...". Configurations are determined (including attribute aggregation) and the result is stored under the "Configurations" element of the model.
* Filter Configurations regarding requirements: Right-click on any element of the model in use and select "Cloud Feature Model/Filter configurations for requirements...". In the wizard, select the requirements model and the service model to use. Clicking on "Finish" will produce the output of the requirements filtering the console of the development Eclipse instance.