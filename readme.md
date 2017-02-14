todo 
----------------- 
* Cancel (stop here or rollback) an event or a cycle from within a rule
* performance tuning
* implement rule priority
* implement router - navigate to view via url
* implement load defaults functionality (auto populate)
* implement layout components to reduce duplication
* write a proper code gen tool with friendly logging and error messages
* deferred event execution - if the user types in many characters quickly
  we should wait for a pause before we do an update. 
* per-lender config override (white label)
* bean validation of domain info
* support multiple list item types (with one being default)
* simplify event binding api
* integrate with font awesome


### Engine - find a use case before doing these improvements
* more control about the rule logic, e.g. abort cycle, abort tick, cycle config, phase config, etc.
* more features of drools rules (rule metadata/configuration)
* when deciding if a rule should be triggered, check the event type considering inheritance

### Frontend - needs a more comprehensive example first
* improve dev process (webpack, live-reload, jasmine to test all the examples)
* react component scaffolding 
* parser/transformer coversion between gwt and react

### Node structure
* Class level config
* Consider adding MapUiNode which maps one UiNode to another.
* Node/UI state copy and paste
* query/reference/proxy nodes
* context.query("\ss\ee\tt[1]") node.query("$(host)\child\")
* node clone and take snapshot
* calculate diff of two versions
* tags - objects stored in node

### Misc
* rule should have a load event to init node properties
* rule that count populated field count
* preserve value when node is disabled -> conditional state
* hierarchical di
* factor inheritance to composition once things get clearer
* built in states
* state metadata (type and stuff)
* code gen xml overriding mechanism
* performance changes
* Design Ui node load/refresh/validate event
* check for memory leak
* tracing and visualization of rule firing / logging
* state property namespace or distinction between system property and user property
* allow user to customize ui, generate automatic fields
* async rules
* event bus for each node.
* rule set, a set of rules activated or deactivated together (e.g. when a product is selected
* api for getting old value, inherited value and stuff
* init or fix value event
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
* improve interop development experience
* effect of rule execution should not depend on order of state change.
same state via same rules -> same result state

Problems
------------------
* Super dev mode debugging experience (GWT remains a black box in js)

On Hold
------------------
* use type script: Use of js code is already minimized via usage of GWT.

Things Neutron can do
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


# Node types
- Abstract generated
- Concrete generated
- Variant hand coded

# Finished
* use dagger2 for di <br/>
no scope hierarchy, one scope instance per node context
* event notification strategy - self,children,parent; descendant,parent; self; ... <br/>
It is decided each type of event has its fixed digestion order.
* rule max change level detection <br/>
Cycle has a rule activation limit.
* upgrade example front end to react material
React material is not mature enough. Decided to go with Bootstrap 3.



proper error handling and logging

todo loading spinner

todo create a dialog component:
backdrop:
<div id="mydiv" style="
    position: absolute;
    z-index: 10;
    width: 100%;
    height: 100%;
    background-color: black;
    opacity: 0.6;
"></div>


