todo 
-----------------  
use rxjs
load portion by portion (e.g. data on a screen is not loaded when it is not visited - lazy loading of node hierarchy)
do not directly reference context and nodes (implement web worker)
1. rolling commit - only keep N cycles in the current session
2. load initial values (as a part of node load) 
  - load value only or the full state?
11. Generate per-profile constants and assets
* Class level config  
* state metadata (type and stuff)  
* state property namespace or distinction between system property and user property  
reduce the number of rules to fire onload. e.g. bypass all validation rules.
reduce memory consumption

1. context menu
4. Per-lender config override
  - each profile (desc.yml) generate a separate profile (profile module and dependencies)
  - add an option to combine the node structure of multiple desc.yml files
  - support a tree of profiles
  - Use 'profile' dagger component/module to provide root node configured for a lender
 
8. node query and injection in rules
  - context.query("\ss\ee\tt[1]") node.query("$(host)\child\")

9. implement rule priority
10. i18n

12. Visualization of node hierarchy (convert desc.yml to html)

### Engine - find a use case before doing these improvements
* more control about the rule logic, e.g. abort cycle, abort tick, cycle config, phase config, etc.
  - Cancel (stop here or rollback) an event or a cycle from within a rule
* more features of drools rules (rule metadata/configuration)
* when deciding if a rule should be triggered, check the event type considering inheritance

### Frontend - needs a more comprehensive example first
* improve dev process (webpack, live-reload, jasmine to test all the examples)
* react component scaffolding 
* parser/transformer conversion between gwt and react
* implement layout components to reduce duplication

### Node structure

* Consider adding MapUiNode which maps one UiNode to another.
* Node/UI state copy and paste
* query/reference/proxy nodes
* node clone and take snapshot
* calculate diff of two versions
* tags - objects stored in node

### Misc
* performance tuning
* rule should have a load event to init node properties
* rule that count populated field count
* preserve value when node is disabled -> conditional state
* hierarchical di
* factor inheritance to composition once things get clearer
* built in states
* code gen xml overriding mechanism
* performance changes
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
= states should be independent, e.g. parent.disabled child.disabled should be independent. getValue v.s. getInheritedValue
- send = process everything immediately & post = current behaviour where changes are added to a queue first.
https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/edit#


<hr/>

Goals
------------------
* Decouple UI logic (GWT) from UI rendering (React & css)
* Reuse UI logic such as validation on the server side
* strong typing as much as possible
* Verify UI logic in unit tests and rendering result in screenshots
* Minimum code in view (JSX)
* Whole UI state can be serialized
* Easy code navigation

* Small file and single responsibility so as to minimize merge conflict
* effect of rule execution should not depend on order of state change. same state via same rules -> same result state
* Separation and well defined interface between generated code and customization (mismatch is caught by compiler)

Functionality Check List
------------------
- A field is required - check
- A field pattern validation - check
- A field value is validated again another field value - check
- A field value causes update of another field value - check
- Field value and display format are different - check
- One of two fields is mandatory - check
- Panel appear when a field has a certain value - check
- rules to apply depends on the value of a field - check
- prevent certain chars from being typed in - check

Problems
------------------
1. Super dev mode debugging experience (GWT remains a black box in js)
  * Should allow either debug the application in GWT (as already implemented) or 
  debug as a JSX application with browser sync and all the goodies (to be implemented).
  * Should verify Java code behaviour in unit tests first to reduce the need for debugging 
  in super dev mode.

2. Code gen error reporting does not indicate line number
  * The current code gen scheme is geared toward fast prototyping. When you edit desc.yml there is no intelli sense or 
  on-the-fly error checking. 
  * Error message can be difficult to understand as they come from different sources (Yml, Bean Validation, custom error and FTL).

3. Difficulty when configure the descendants of a abstract node
  * Descendants of an abstract node should pick up configuration from the abstract node.

4. UI freeze when node update takes a long time
  * run on web worker or break the long running process into multiple steps dispatched to a queue.

# Finished
1. Use dagger2 for DI
  * There is one scope instance per node context. 
  * There is no scope hierarchy (Dagger2 sub-components). Ideally the children of
  an object node should be in their own scope because they share the same life cycle.
  But as the node hierarchy becomes more and more complex the Dagger2 generated code will
  eventually give 'file path too long' error when javac writes class files to disk.

2. Custom event activation logic, i.e. allow the client to change
   getActivations method. E.g. self,children,parent; descendant,parent; self; ...
  * It is decided each type of event should have a fixed activation logic. 
    If necessary we can parameterize this logic to achieve some degree of customisation.  

3. Rule max change level detection
  * This is required to 1) avoid infinitive loop; 2) raise error when node hierarchy takes to much time 
  (avoid UI stop responding).
  * Currently this is achieved by cycle having a rule activation count limit. 

4. Upgrade example front end to react material
  * React material is not mature/flexible enough for building enterprise application. 
  I have decided to go with Bootstrap 3 with this demo project.

5 Support multiple list item types (with one being default)
  * This idea is abandoned. The main reason for having multiple 
  concrete item node types is to show a list of slightly different 
  UI sections, such as list of member and non-members. 
  This design forces the client to check the real type of item nodes.
  Therefore when we add or remove item types client code has to change as well.
  * I've decided to achieved this requirement by enabling/disabling sub-sections of an item node.
  
6. Create a dialog component:
  * Created a React component wrapping up the Bootstrap dialog. 
  * Does not support popping up multiple dialogs at the same time.
 
7. Use type script with JSX
  * This idea is abandoned because it will make JSX code more verbose.
  * Will use JSX tool set to enforce some compile time check.
  * JSX code should be as simple as possible (rendering and event notification only). 
  All verifiable logic should be implemented in the node hierarchy.
  
8. Explore alternatives to GWT, e.g. TypeScript, Scala.js, Kotlin, etc.
  * After having a quick look at other alternatives GWT remains the best choice for writing JS 
  in a strongly typed language.
  * Code needs to be run on both client side and server side, difficult to do this in TypeScript.
  * Kotlin and Scala.js are not mature enough (e.g. no tree shaking when compile).
  * Even though Java is a bit verbose it is still the preferred source language because of its popularity.
  
9. Bean validation of domain info
  * todo might need to write additional validators for better error reporting.
  
10. Write a proper code gen tool with friendly logging and error messages.
  * The current code gen scheme is fine.

11. Deferred event execution - if the user types in many characters quickly - we should wait for a pause before we do an update. 
  * Added a debouncing cycle mode
  * React need to debounce the flush event.
  * Only used for textbox input
  
12. loading spinner
  * Implemented in HTML and JavaScript

13. children level init and rules collection
  * Implemented using instance rule provider
  
14. integrate with font awesome

15. implement router - navigate to view via url

16. added a root node type 

17. simplify event binding api
  * Allow only one subject per binding.
  
# Node Roles
In the node hierarchy a node can have one of three roles:

1. Abstract Node
  * An abstract node must be an abstract class. 
  * All concrete nodes inherit and only inherit from an abstract node.
  * The foundational abstract nodes come with the Neutron framework.
  * Additional abstract nodes are code generated or hand coded.
  
2. Concrete Node
  * A concrete node is the first instantiatable node in an inheritance path.
  * Concrete nodes can be referenced in the node hierarchy.
  * Concrete nodes are all code generated.
  * Concrete node simple class name is unique with in a node hierarchy.
  * Concrete node does not have parent node generic type.
  
3. Variant Node
  * Variant nodes inherit from a concrete node and are instantiable.
  There for in any inheritance path the top half are abstract and bottom half are non-abstract.
  * They are created manually. 
  * They can provide extra methods for JsInterop or override concrete node behaviour.
  * The node hierarchy cannot reference variant nodes. They are only injected into the node hierarchy
  in place of its concrete node via Dagger2.

# Node Types
In the node hierarchy there are four types of nodes:

1. Object Node
  * Root node is an Object Node whose parent is Void Node.
  * An object node has predefined named children.
  * The life cycle of child nodes is from load to unload of parent node.
  * An abstract object node has concrete children.

2. List Node
  * A list node declares the base type of its item, which is always concrete.
  Specifically an abstract list node's item node is concrete.
  
3. Leaf Node
  * A leaf node declares the type of its value.
  
4. Void Node
  * A placeholder class that serve as the parent class of a root node.
  
# Directory Structure
To create a new domain and profiles, we need to do the following in the domain's root folder.
1. desc.yml
  * THis is how the file is currently used:
    - Map to the DomainInfo data structure -> Bean Validation -> Initialization and error checking
    - It describes all the nodes and their behaviour in the node hierarchy
  * todo: implement profiles 
    - same node structure different behaviour. 
    - A node has its inherent default property values and rules. On top of this you can define profiles
    which can give each node additional configuration (property values + rules).
2. gen directory
  * All the generated classes are placed here. Do not modify code in this directory.
  * The folders in the domain root directory mirrors the folders in the gen directory (except for the gen directory itself of course).
  * XxxNodeFactory: This is the generated entry point for the client to use the node hierarchy.
3. di directory
  * This is where you manually encapsulate the generated code and provide and Factory class to the client.
    - XxxProfileModule: Manually created abstract module that matches required classes with implementation classes.
    It must include the ManifestModule of the domain.
    - CustomModule: Optional module that contains instantiation logic (non-abstract module). If present it should be 
    included in XxxProfileModule.
    
==================================================
message provider
profile

mechanism	target	usage	
childProvider -override new child	named concrete class	"provide node impl
add node config"	node impl = add new jsinterop methods
childProvider - create factory	abstract or concrete class	add node config	add node config = set properties & add rules
ruleProvider	concrete class	set properties & add rules	
rule	rule in the profile	rule implementation	
di	super type	get instance by super type	
classRegistry	(predefined) related type	get instance by related type	

todo: 
eliminate classRegistry




////////////////////////////////////
valueTypeName -> default baseTypeName: LeafUiNode
commonTypes -> abstractNode: true
baseTypeName: LeafUiNode -> parentBaseTypeName: ParentUiNode<?>
children is not null -> baseTypeName: ObjectUiNode
baseTypeName: ObjectUiNode -> parentBaseTypeName: ParentUiNode<?>


cascade list
node state
generic event binding
field length
trust ref list


//pending tasks
<pre>
add to person summary:
Employment Incomes (0)
Other Incomes (0)
</pre>

<pre>
person general page: 
age and number of dependants
name of trust field
next of kin field
other title field
</pre>

<pre>

</pre>

<pre>

</pre>

<pre>

</pre>

<pre>

</pre>

<pre>

</pre>

<pre>

</pre>






