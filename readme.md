todo 
-----------------
* focus on field when click error
* rule should have a load event to init node properties
* hierachical di
* factor inheritance to composition once things get clearer
* preserve value when node is disabled -> conditional state
* built in states
* add sourcemap to webpack
* implement rule priority
* implement rule group/flow
* more control about the rule logic, e.g. abort cycle, abort tick, cycle config, phase config, etc.
* state metadata (type and stuff)
* support post event send event processing
* code gen xml overriding mechanism
* improve dev process (webpack, live-reload, jasmine to test all the examples)
* use type script
* performance changes
* more features of drools rules (rule metadata/configuration)
* rule max change level detection
* validation rule does not rely on the changes and can be fired for validation event
    validation is independ of change though can be called after change (only called for changed nodes)
    Design Ui node load/refresh/validate event
* check for memory leak
* react component scaffolding 
* tracing and visualization of rule firing / logging
* parser/transformer coversion between gwt and react
* state property namespace or distinction between system property and user property
* allow user to customize ui, generate automatic fields
* build up a correspoding react component library
* node clone and take snapshot
* calculate diff of two versions
* async rules
* context.query("\ss\ee\tt[1]") node.query("$(host)\child\")
* query/reference/proxy nodes
* event bus for each node.
* rule set, a set of rules activated or deactivated together (e.g. when a product is selected
* api for getting old value, inherited value and stuff
* init or fix value event
* event notification strategy - self,children,parent; descendant,parent; self; ...
* fire rules by group
* warning rules and suppressed warning

= event trigger opportunity is up to the ui implementor
= states should be independent, e.g. parent.disabled child.disabled should be independent. getValue v.s. getInheritedValue


- send = process everything immediately & post = current behaviour where changes are added to a queue first.
https://docs.google.com/document/d/10fmlEYIHcyead_4R1S5wKGs1t2I7Fnp_PaNaa7XTEk0/edit#

Goals
------------------
* Decouple UI logic (GWT) from UI rendering (React & css)
* Reuse UI logic such as validation on the server side
* Small file and single responsibility so as to minimize merge conflict
* Separation and well defined interface between generated code and customization (mismatch is caught by compiler)
* Whole UI state can be serialized
* Verify UI logic in unit tests and rendering result in screenshots
* strong typing as much as possible

Problems
------------------
* Super dev mode debugging experience (GWT remains a black box in js)


Things Neutron can do
------------------
A feild is required - check
A field pattern validation - check
A field value is validated again another field value - check
A field value causes update of another field value - check
Field value and display format are different - check
One of two fields is mandatory - check
Panel appear when a field has a certain value - check
rules to apply depends on the value of a field - check

















