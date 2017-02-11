package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;

public class PropertyAddressNode extends StringUiNode<PropertyDetailsNode>
{
    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PropertyAddressNode> config = classRegistry.getUiNodeConfig(PropertyAddressNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PropertyAddressNode(PropertyDetailsNode parent, String name) {
        super(parent, name);
    }

}
