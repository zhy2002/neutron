package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.app.data.*;

public  class LodgementNode extends ObjectUiNode<VoidUiNode>
{
    private AppManagerNode appManagerNode;

    protected LodgementNode(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
    }

    @JsMethod
    public AppManagerNode getAppManagerNode() {
        return appManagerNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        appManagerNode = context.createChildNode(AppManagerNode.class, this, "appManagerNode");

        return Arrays.asList(
            appManagerNode
        );
    }



}
