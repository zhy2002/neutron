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

public class OtherAssetDescriptionNode extends StringUiNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetDescriptionNode.class;
    }

    private OtherAssetDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherAssetDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetDescriptionNodeModule(new OtherAssetDescriptionNodeModule(this)).build();
    }

    @Override
    protected OtherAssetDescriptionNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetDescriptionNodeRuleProvider();
    }

    public OtherAssetDescriptionNode(OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
