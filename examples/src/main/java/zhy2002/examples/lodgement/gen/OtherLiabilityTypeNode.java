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

public class OtherLiabilityTypeNode extends StringUiNode<OtherLiabilityNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityTypeNode.class;
    }

    private OtherLiabilityTypeNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityTypeNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityTypeNodeModule(new OtherLiabilityTypeNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityTypeNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityTypeNodeRuleProvider();
    }

    public OtherLiabilityTypeNode(OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.OTHER_LIABILITY_TYPE.toArray());
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}
