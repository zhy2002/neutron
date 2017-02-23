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

public class SpouseNode extends StringUiNode<PersonGeneralNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return SpouseNode.class;
    }

    private SpouseNodeComponent component;

    @Inject
    void createComponent(SpouseNodeComponent.Builder builder) {
        this.component = builder.setSpouseNodeModule(new SpouseNodeModule(this)).build();
    }

    @Override
    protected SpouseNodeRuleProvider getRuleProvider() {
        return component.getSpouseNodeRuleProvider();
    }

    public SpouseNode(PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}
