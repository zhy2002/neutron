package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public abstract class MonthYearNode<P extends ParentUiNode<?>> extends ObjectUiNode<P>
{
    private MonthNode monthNode;
    private YearNode yearNode;

    protected MonthYearNode(P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public MonthNode getMonthNode() {
        return monthNode;
    }

    @JsMethod
    public YearNode getYearNode() {
        return yearNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        monthNode = context.createChildNode(MonthNode.class, this, "monthNode");
        yearNode = context.createChildNode(YearNode.class, this, "yearNode");

        return Arrays.asList(
            monthNode,
            yearNode
        );
    }



}
