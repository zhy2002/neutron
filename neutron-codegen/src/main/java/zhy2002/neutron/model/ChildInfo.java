package zhy2002.neutron.model;

import zhy2002.neutron.service.CodeGenUtil;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

public class ChildInfo extends CodeGenInfo {

    private String name;
    @Valid
    private List<InitInfo> init;
    @Valid
    private List<RuleInfo> rules;
    private boolean loadWithParent = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InitInfo> getInit() {
        return init;
    }

    public void setInit(List<InitInfo> init) {
        this.init = init;
    }

    public List<RuleInfo> getRules() {
        return rules;
    }

    public void setRules(List<RuleInfo> rules) {
        this.rules = rules;
    }

    public boolean isLoadWithParent() {
        return loadWithParent;
    }

    public void setLoadWithParent(boolean loadWithParent) {
        this.loadWithParent = loadWithParent;
    }

    ////////////////////////////////////////////////////

    private NodeInfo childType;
    private NodeInfo parentType;

    public NodeInfo getChildType() {
        return childType;
    }

    void setChildType(NodeInfo childType) {
        this.childType = childType;
    }

    public NodeInfo getParentType() {
        return parentType;
    }

    void setParentType(NodeInfo parentType) {
        this.parentType = parentType;
    }

    public boolean getHasRuleProvider() {
        return getInit() != null && getInit().size() > 0 || getRules() != null && getRules().size() > 0;
    }

    @Override
    public void initialize() {
        super.initialize();

        if (getName() == null) {
            setName(CodeGenUtil.firstCharLower(getTypeName()));
        }

        if (getChildType() == null)
            raiseError("childType is not set");
        if (getParentType() == null)
            raiseError("parentType is not set");
        if (getChildType().isAbstractNode())
            raiseError("childType cannot be abstract");

        ValueUtil.ifNull(getInit(), Collections.emptyList()).forEach(item -> item.initialize(this));

        ValueUtil.ifNull(getRules(), Collections.emptyList()).forEach(rule -> {
            rule.setDomainInfo(getDomainInfo());
            rule.setOwnerType(getChildType());
            rule.initialize();
        });

    }
}
