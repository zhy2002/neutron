package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class OtherAssetTypeNode extends StringUiNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetTypeNode.class;
    }

    private OtherAssetTypeNodeComponent component;

    @Inject
    void createComponent(OtherAssetTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetTypeNodeModule(new OtherAssetTypeNodeModule(this)).build();
    }

    @Override
    protected OtherAssetTypeNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetTypeNodeRuleProvider();
    }

    public OtherAssetTypeNode(OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
