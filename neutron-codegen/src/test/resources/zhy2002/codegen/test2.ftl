package ${targetPackage};

public class CountryCodeNode extends ${baseType}Node {

    ${nodeType}Node(${parentType}Node parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

<#list properties as prop>
        set${prop.name}(${prop.value});
</#list>
    }
}
