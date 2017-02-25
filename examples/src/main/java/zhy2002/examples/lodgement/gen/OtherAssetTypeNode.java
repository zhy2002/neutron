package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
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

    public OtherAssetTypeNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
