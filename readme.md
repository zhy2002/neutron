Summary
-----------------
This is an experimental single page web application based on the libraries/frameworks below:

* GWT 2.8.1 (state management)
* ReactJs 15.5.10 (rendering)
* Dagger 2 (DI)
* Elasticsearch 5.4 (mock backend)
* Maven & Webpack (build)

The goal of this project is to provide an alternative to Redux for enterprise applications state management.

The UI state is described using a tree of nodes. The interaction of nodes is handle by rules - 
which are hooks into the node tree. Logically each rule is a stateless piece of code that is fired when some event occurs
in the node tree, e.g. if this node has value A then update another node becomes required.

THe UI is rendered via React component. When a node is changed, the React component bound to it will update. 
On the other side when an event occurs in the UI, React component will update node properties or fire up node actions to
trigger the rules hooked into the node tree.

#### Features
* Declarative UI state - the UI structure behaviour is configured via a YML file; e.g.
<pre>
targetPackage: zhy2002.mortgage.login
# this domain describe from the sate of the login page.
typeName: Login

rootType:
  typeName: LoginNode
  baseTypeName: RootUiNode
  properties:
  - {name: loginState, typeName: String, default: '""'}
  rules:
  - {typeName: UpdateLoginStateRule}
  children:
  - {typeName: UsernameNode}
  - {typeName: PasswordNode}
  childTypes:
  - typeName: UsernameNode
    baseTypeName: StringUiNode
    config:
    - {property: '@required', value: 'true'}
    - {property: '@pattern', value: '"^[a-zA-Z0-9_\\-]*$"'}
    - {property: '@patternMessage', value: '"Username can only contain letter, digit, dash or underscore."'}
    - {property: '@minLength', value: '6'}
    - {property: '@maxLength', value: '12'}

  - typeName: PasswordNode
    baseTypeName: StringUiNode
    config:
    - {property: '@required', value: 'true'}
    - {property: '@minLength', value: '6'}
    - {property: '@maxLength', value: '12'}

</pre>

* Highly testable UI state. You can instantiate the node tree and test its behaviour as a whole in JUnit.
The GWT code does not have any dependency on the browser. 

* Flexible - you can alter the behaviour of the node tree via profiles.

* Reuse UI logic on the server side. You can extract JSON data from the UI and reconstruct the node tree
on the server to validate with an extended set of rules (a different profile).
I have not implemented this but the GWT code is designed to run on both client side as server side.

* Simplified UI layer. Since state management is handled by GWT, the React components are very simple. 
Most of them are functions or PureComponents connected to node tree via High Order components. 
Also since the UI layer is very thin it will not take much trouble to migrate to Angular2+ or Vue.js.

* Strongly typed and DI enabled GWT code. When you code a rule you will code against concrete node class types, e.g.

~~~~
public class AddNewCompanyApplicantRule extends UiNodeRule<OwnershipListNode<?>> {

    @Inject
    ApplicationNode applicationNode;

    @Inject
    public AddNewCompanyApplicantRule(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    @Override
    protected UiNode<?> findHost() {
        return applicationNode.getCompanyListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new NodeAddEventBinding<>(
                        this::importApplicant,
                        CompanyNodeAddEvent.class
                )
        );
    }

    private void importApplicant(CompanyNodeAddEvent addEvent) {
        final OwnershipNode ownershipNode = getOwner().createItem();
        .....
    }
}

~~~~

* Built in support for dirty checking, has value checking, retrieve original (last saved) value,
readonly state, disabled state, visibility, extract data, set data, clone node tree, 
undo/redo, value option list, validation and error state and so on.

* All React components have an identifier class for easy debugging/automation.

* i18n support (incomplete)

#### Justification for GWT
At this day an age many would be surprised to see new projects based on GWT. I agree GWT has lots of problems as a 
UI/PRC technology and we should not use the widget library any more. 

However, as a transpiler from Java/JRE to JavaScript it is still the best option to date (mid 2017). 
So it really comes down to why use Java and the answer to that is.........
its popularity.

Get Started
-----------------
- In root directory run:
~~~~
mvn clean install
~~~~
- Then:
~~~~
cd neutron-examples/mortgage/mortgage-ui
npm install
npm run build
~~~~
- Then setup Run Configuration in IntelliJ IDEA as per:

![intellij](doc/config_intellij_idea.png)

- Setup Elasticsearch mock backend (required for persistence)
  - Run <code>neutron-examples/mortgage/setup/elasticsearch_init.jmx</code>
  - Setup CORS for Elasticsearch:
~~~~
http:
  cors:
    enabled: true
    allow-origin: http://127.0.0.1:8889
~~~~

When you run the demo application you will see:

![screenshot](doc/screenshot.png)

#### Directory Structure
To create a new domain and profiles, we need to place a <code>DOMAIN.yml</code> or a <code>PROFILE.yml</code> in a directory.

* A directory named 'gen' will be generated next to the yml file which contains all the generated code for the domain or profile.
* It should be obvious but do not modify code in the 'gen' directory.
* More detailed explanation goes here

#### Working with Neutron
* Effect of rule execution should not depend on order of state change, i.e. 
same state changes + same rules -> same stable state
* Do not bind same node more than once in the same view without specifying an id suffix.
* Keep source file small and with single responsibility 

Todo
-----------------  
- create auto layout components
- create link widgets that allow display/edit nested node hierarchies
- implement server side validation/translation as a microservice
  
Todo (low priority)
-----------------
- implement rule priority
- rolling commit - only keep N cycles in the current session
- implement context menu component
- profiling: reduce memory consumption
- profiling: reduce computation time
- reduce compilation time
- copy & paste data between nodes
- Visualization of node hierarchy (convert desc.yml to html)
- review Drools manual to see what features can borrow
- report line number for configuration errors in the yml file.
- only import necessary packages in the generated files.
- fix compilation warning messages.
- save and restore full state (not just value and id) for debugging purpose
- align JSX code with RxJS patterns
- implement partial load/unload examples
  - e.g. data on a screen is not loaded when it is not visited - lazy loading of node hierarchy

Todo (long term)
-----------------
- construct framework nodes via reflection in codegen module.
- allow load overriding config from json.
- watcher for the yaml files for incremental code generation.
- compute on WebWorker thread
  - do not directly reference context and nodes but send action and receive state via messages
- add/remove/configure domain/profile while app is running (via server side compilation)
  - when adding domain also add the supporting JSX components
- calculate state diff and allow patch to be send / received
- versioned domain and profile
- property DSL to replace yaml.

### Design
#### Node Levels
In the node hierarchy a node is at one of the three abstraction levels:

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

#### Node Types
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
  
#### Extension points
| Mechanism   |      Target      |  Usage |
|----------|:-------------:|------:|
| Config |  Node on path | Initialize property values |
| Type Rule Provider | Node of type |   Initial value (higher priority than config) or add rules |
| Child Rule Provider | Concrete node of type with name XXX |    Same above but higher priority |
| Child Provider | Parent node type | Change how child nodes are created|
| Custom module | Domain or profile | Provide alternative variant node type, override type/child rule provider and child provider or alternative implementation of rules |
| Node life cycle listener | All node instances | Dynamically modify node behaviour |
				
Finished
-----------------
1 - Use dagger2 for DI
  * There is one scope instance per node context. 
  * There is no scope hierarchy (Dagger2 sub-components). Ideally the children of
  an object node should be in their own scope because they share the same life cycle.
  But as the node hierarchy becomes more and more complex the Dagger2 generated code will
  eventually give 'file path too long' error when javac writes class files to disk.

2 - Custom event activation logic, i.e. allow the client to change
   getActivations method. E.g. self,children,parent; descendant,parent; self; ...
  * It is decided each type of event should have a fixed activation logic. 
    If necessary we can parameterize this logic to achieve some degree of customisation.  

3 - Rule max change level detection
  * This is required to 1) avoid infinitive loop; 2) raise error when node hierarchy takes to much time 
  (avoid UI stop responding).
  * Currently this is achieved by cycle having a rule activation count limit. 

4 Upgrade example front end to react material
  * React material is not mature/flexible enough for building enterprise application. 
  I have decided to go with Bootstrap 3 with this demo project.

5 - Support multiple list item types (with one being default)
  * This idea is abandoned. The main reason for having multiple 
  concrete item node types is to show a list of slightly different 
  UI sections, such as list of member and non-members. 
  This design forces the client to check the real type of item nodes.
  Therefore when we add or remove item types client code has to change as well.
  * I've decided to achieved this requirement by enabling/disabling sub-sections of an item node.
  
6 - Create a dialog component:
  * Created a React component wrapping up the Bootstrap dialog. 
  * Does not support popping up multiple dialogs at the same time.
 
7 - Use type script with JSX
  * This idea is abandoned because it will make JSX code more verbose.
  * Will use JSX tool set to enforce some compile time check.
  * JSX code should be as simple as possible (rendering and event notification only). 
  All verifiable logic should be implemented in the node hierarchy.
  
8 - Explore alternatives to GWT, e.g. TypeScript, Scala.js, Kotlin, etc.
  * After having a quick look at other alternatives GWT remains the best choice for writing JS 
  in a strongly typed language.
  * Code needs to be run on both client side and server side, difficult to do this in TypeScript.
  * Kotlin and Scala.js are not mature enough (e.g. no tree shaking when compile).
  * Even though Java is a bit verbose it is still the preferred source language because of its popularity.
  
9 - Bean validation of domain info
  * todo might need to write additional validators for better error reporting.
  
10 - Write a proper code gen tool with friendly logging and error messages.
  * The current code gen scheme is fine.

11 - Deferred event execution - if the user types in many characters quickly - we should wait for a pause before we do an update. 
  * Added a debouncing cycle mode
  * React need to debounce the flush event.
  * Only used for textbox input
  
12 - loading spinner
  * Implemented in HTML and JavaScript

13 - children level init and rules collection
  * Implemented using instance rule provider
  
14 - integrate with font awesome

15 - implement router - navigate to view via url

16 - added a root node type 

17 - simplify event binding api
  * Allow only one subject per binding.
  
18 - Cancel (stop here or rollback) an event or a cycle from within a rule
  * Just throw an exception from the rule
  
19 - load initial values (as a part of node load) 
  * see NodeDataStore class
  
20 - Generate per-profile default values and rules

21 - when deciding if a rule should be triggered, check the event type considering inheritance
  * no need, rule can subscribe to the parent event type as well
  
22 - rule should have a load event to init node properties

23 - send = process everything immediately & post = current behaviour where changes are added to a queue first.
 
24 - add context level default loadWithParent instead of fixed default value of true
    
25 - increase dynamism: configure at runtime instead of compile time
  - add/remove rules at runtime
  - change default values at runtime
  - ???
  
26 - hierarchical di
  - allow node to inherit property value from parent
  - <s>define an expression language which allows a node to ask its parent for objects meeting certain criteria</s>
  - notification will NOT be provided when the injected instance is changed

27 - move logic from JSX to AppManagerNode

28 - add a new notification event type which is propagated through the hierarchy but does not represent a change of state.
  - refresh event directiron? downwards, upwards, both

29 - allow bypass validation rules at various levels

30 - align JSX code with Redux patterns
  - property set/action dispatch into node hierarchy
  - property get/notification out of node hierarchy

31 - exclude generated files from source control

32 - dob year defaults to 18 years ago

33 - error when navigating to a none existent app

34 - Use HOCs replace Neutron base components

35 - Error when closing a none active app tab

36 - Handle url change when back/forward browser buttons are clicked.

37 - add mocha enzyme for testing react components.

38 - add i18next

39 - split examples and core framework
  
### Problems
* Compilation/loading speed. Dagger 2 generates too much code (add 10x code) which is making the 
compilation/loading a bit slow. 
* No time : ()
