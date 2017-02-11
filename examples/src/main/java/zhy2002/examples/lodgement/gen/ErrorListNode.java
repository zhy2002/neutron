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

public class ErrorListNode extends ListUiNode<ApplicationNode,ErrorListNode,ErrorNode>
{
    private ErrorListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ErrorListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    ErrorListNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

    public ErrorListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ErrorNode> getItemClass() {
        return ErrorNode.class;
    }

    @Override
    protected <M extends ErrorNode> ErrorNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createErrorNode(name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setChangeTrackingMode(ApplicationNodeConstants.FOCUS, ChangeTrackingModeEnum.Always);
    }

    @JsMethod
    public String getFocus() {
        return getStateValue(ApplicationNodeConstants.FOCUS);
    }

    @JsMethod
    public void setFocus(String value) {
        setStateValue(ApplicationNodeConstants.FOCUS, String.class, value);
    }

}
