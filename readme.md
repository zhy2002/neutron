Get Started
-----------------
- In root directory run:
<pre>
mvn clean install
</pre>
- Then:
<pre>
cd neutron-examples/neutron-examples-ui
npm install
npm run build
</pre>
- Then setup Run Configuration in IntelliJ IDEA as per <code>doc/config_intellij_idea</code>.

- Enable Elasticsearch mock backend:
<pre>
http:
  cors:
    enabled: true
    allow-origin: http://127.0.0.1:8889
</pre>

Todo
-----------------  
- i18n support parser/formatter/array leaf value
  - runtime configurable culture specific parser/formatter chain
  - formatter chain for all node
  - parser chain for leaf nodes
  - React i18n
- create layout components
- link to other documents; display linked documents as accordion or auto complete
- implement server side validation/translation
  
Todo (low priority)
-----------------
- implement rule priority
- rolling commit - only keep N cycles in the current session
- implement context menu component
- profiling: reduce memory consumption
- profiling: reduce computation time
- copy & paste data between nodes
- Visualization of node hierarchy (convert desc.yml to html)
- review Drools manual to see what features can borrow
- shorten view - modify - verify loop of JSX development
- reduce compilation time
- report line number for configuration errors in the yml file.
- only import necessary packages in the generated files.
- fix compilation warning messages.
- save and restore full state (not just value and id) for debugging purpose
- align JSX code with RxJS patterns
- implement partial load/unload examples
  - e.g. data on a screen is not loaded when it is not visited - lazy loading of node hierarchy

Todo (long term)
-----------------
- remove dagger 2 because its making the build too slow.
- construct framework nodes via reflection in codegen module.
- load config from json
- support expression in init (as opposed to only constants)
- watcher for the yaml files and incremental build
- compute on WebWorker thread
  - do not directly reference context and nodes but send action and receive state via messages
- split example project and core framework
- add/remove/configure domain/profile while app is running (via server side compilation)
  - when adding domain also add the supporting JSX components
- calculate state diff
- versioned domain and profile
- migrate from GWT to Kotlin
- property DSL to replace yaml.

Design
-----------------
### Goals
* Decouple UI logic (GWT) from UI rendering (React & css)
* Reuse UI logic such as validation on the server side
* Strong typing as much as possible in GWT
* Primarily verify UI logic in unit tests and rendering result in screenshots
* Minimal code in view layer (JSX)
* Easy to clone, store and restore UI state
* Easy to navigate in code base
* Small source file with single responsibility 
* Clear separation between generated code and customization(they interact with well defined interface) 

### Assumptions
* effect of rule execution should not depend on order of state change. same state via same rules -> same result state
* do not bind same node more than once in the same view without specifying an id suffix.

### Node role
In the node hierarchy a node can have one of three roles:

1 Abstract Node
  * An abstract node must be an abstract class. 
  * All concrete nodes inherit and only inherit from an abstract node.
  * The foundational abstract nodes come with the Neutron framework.
  * Additional abstract nodes are code generated or hand coded.

2 Concrete Node
  * A concrete node is the first instantiatable node in an inheritance path.
  * Concrete nodes can be referenced in the node hierarchy.
  * Concrete nodes are all code generated.
  * Concrete node simple class name is unique with in a node hierarchy.
  * Concrete node does not have parent node generic type.

3 Variant Node
  * Variant nodes inherit from a concrete node and are instantiable.
  There for in any inheritance path the top half are abstract and bottom half are non-abstract.
  * They are created manually. 
  * They can provide extra methods for JsInterop or override concrete node behaviour.
  * The node hierarchy cannot reference variant nodes. They are only injected into the node hierarchy
  in place of its concrete node via Dagger2.

### Node Types
In the node hierarchy there are four types of nodes:
1 Object Node
  * Root node is an Object Node whose parent is Void Node.
  * An object node has predefined named children.
  * The life cycle of child nodes is from load to unload of parent node.
  * An abstract object node has concrete children.

2 List Node
  * A list node declares the base type of its item, which is always concrete.
  Specifically an abstract list node's item node is concrete.
  
3 Leaf Node
  * A leaf node declares the type of its value.
  
4 Void Node
  * A placeholder class that serve as the parent class of a root node.
  
### Directory Structure
To create a new domain and profiles, we need to place a <code>DOMAIN.yml</code> or a <code>PROFILE.yml</code> in a directory.

* A directory named 'gen' will be generated next to the yml file which contains all the generated code for the domain or profile.
* It should be obvious but do not modify code in the 'gen' directory.
* More detailed explanation goes here

Finished
-----------------
1 Use dagger2 for DI
  * There is one scope instance per node context. 
  * There is no scope hierarchy (Dagger2 sub-components). Ideally the children of
  an object node should be in their own scope because they share the same life cycle.
  But as the node hierarchy becomes more and more complex the Dagger2 generated code will
  eventually give 'file path too long' error when javac writes class files to disk.

2 Custom event activation logic, i.e. allow the client to change
   getActivations method. E.g. self,children,parent; descendant,parent; self; ...
  * It is decided each type of event should have a fixed activation logic. 
    If necessary we can parameterize this logic to achieve some degree of customisation.  

3 Rule max change level detection
  * This is required to 1) avoid infinitive loop; 2) raise error when node hierarchy takes to much time 
  (avoid UI stop responding).
  * Currently this is achieved by cycle having a rule activation count limit. 

4 Upgrade example front end to react material
  * React material is not mature/flexible enough for building enterprise application. 
  I have decided to go with Bootstrap 3 with this demo project.

5 Support multiple list item types (with one being default)
  * This idea is abandoned. The main reason for having multiple 
  concrete item node types is to show a list of slightly different 
  UI sections, such as list of member and non-members. 
  This design forces the client to check the real type of item nodes.
  Therefore when we add or remove item types client code has to change as well.
  * I've decided to achieved this requirement by enabling/disabling sub-sections of an item node.
  
6 Create a dialog component:
  * Created a React component wrapping up the Bootstrap dialog. 
  * Does not support popping up multiple dialogs at the same time.
 
7 Use type script with JSX
  * This idea is abandoned because it will make JSX code more verbose.
  * Will use JSX tool set to enforce some compile time check.
  * JSX code should be as simple as possible (rendering and event notification only). 
  All verifiable logic should be implemented in the node hierarchy.
  
8 Explore alternatives to GWT, e.g. TypeScript, Scala.js, Kotlin, etc.
  * After having a quick look at other alternatives GWT remains the best choice for writing JS 
  in a strongly typed language.
  * Code needs to be run on both client side and server side, difficult to do this in TypeScript.
  * Kotlin and Scala.js are not mature enough (e.g. no tree shaking when compile).
  * Even though Java is a bit verbose it is still the preferred source language because of its popularity.
  
9 Bean validation of domain info
  * todo might need to write additional validators for better error reporting.
  
10 Write a proper code gen tool with friendly logging and error messages.
  * The current code gen scheme is fine.

11 Deferred event execution - if the user types in many characters quickly - we should wait for a pause before we do an update. 
  * Added a debouncing cycle mode
  * React need to debounce the flush event.
  * Only used for textbox input
  
12 loading spinner
  * Implemented in HTML and JavaScript

13 children level init and rules collection
  * Implemented using instance rule provider
  
14 integrate with font awesome

15 implement router - navigate to view via url

16 added a root node type 

17 simplify event binding api
  * Allow only one subject per binding.
  
18 Cancel (stop here or rollback) an event or a cycle from within a rule
  * Just throw an exception from the rule
  
19 load initial values (as a part of node load) 
  * see NodeDataStore class
  
20 Generate per-profile default values and rules

21 when deciding if a rule should be triggered, check the event type considering inheritance
  * no need, rule can subscribe to the parent event type as well
  
22 rule should have a load event to init node properties

23 send = process everything immediately & post = current behaviour where changes are added to a queue first.
 
24 add context level default loadWithParent instead of fixed default value of true
    
25 increase dynamism: configure at runtime instead of compile time
  - add/remove rules at runtime
  - change default values at runtime
  - ???
  
26 hierarchical di
  - allow node to inherit property value from parent
  - <s>define an expression language which allows a node to ask its parent for objects meeting certain criteria</s>
  - notification will NOT be provided when the injected instance is changed

27 move logic from JSX to AppManagerNode

28 add a new notification event type which is propagated through the hierarchy but does not represent a change of state.
  - refresh event directiron? downwards, upwards, both

29 allow bypass validation rules at various levels

30 align JSX code with Redux patterns
  - property set/action dispatch into node hierarchy
  - property get/notification out of node hierarchy

31 exclude generated files from source control

32 dob year defaults to 18 years ago

33 - error when navigating to a none existent app

34 - Use HOCs replace Neutron base components

35 - Error when closing a none active app tab

36 - Handle url change when back/forward browser buttons are clicked.

37 - add mocha enzyme for testing react components.

### Garbage

* preserve value when node is disabled -> conditional state
* built in states
* code gen xml overriding mechanism
* Design Ui node load/refresh/validate event
* check for memory leak
* tracing and visualization of rule firing / logging
* allow user to customize ui, generate automatic fields
* async rules
* event bus for each node.
* rule set, a set of rules activated or deactivated together (e.g. when a product is selected
* api for getting old value, inherited value and stuff
* init or fix value event
* warning rules and suppressed warning
* proper error handling and logging
= event trigger opportunity is up to the ui implementor 
* state property namespace or distinction between system property and user property   
* GWT Interop: https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/edit#

==================================================
message provider

mechanism	target	usage	
childProvider -override new child	named concrete class	"provide node impl
add node config"	node impl = add new jsinterop methods
childProvider - create factory	abstract or concrete class	add node config	add node config = set properties & add rules
ruleProvider	concrete class	set properties & add rules	
rule	rule in the profile	rule implementation	
di	super type	get instance by super type	
classRegistry	(predefined) related type	get instance by related type	


npm i -g npm-check-updates
npm-check-updates -u
npm install