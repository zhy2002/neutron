package ${targetPackage}.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ${typeName}Factory implements ChildNodeFactory<${typeName}, ${parent.typeName}> {

    @Override
    public ${typeName} create(${parent.typeName} parent, String name) {
        return new ${typeName}(parent, name);
    }
}
