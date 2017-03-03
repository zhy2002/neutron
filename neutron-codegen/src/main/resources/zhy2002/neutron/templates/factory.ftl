package ${targetPackage}.gen;

import jsinterop.annotations.JsType;
import ${targetPackage}.di.DaggerDefaultProfileComponent;
import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ${typeName}Factory {

    public static ${typeName} create() {
        return DaggerDefaultProfileComponent.create().provide${typeName}Context().getRootNode();
    }

    //todo factory methods for other profiles
}



