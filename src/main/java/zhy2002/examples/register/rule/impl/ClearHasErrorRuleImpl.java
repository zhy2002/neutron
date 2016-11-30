package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.RegisterNode;
import zhy2002.examples.register.rule.ClearHasErrorRule;

public class ClearHasErrorRuleImpl extends ClearHasErrorRule {

    public static class Factory implements ClearHasErrorRule.Factory {

        @Override
        public ClearHasErrorRule create(RegisterNode owner) {
            return new ClearHasErrorRuleImpl(owner);
        }
    }

    private ClearHasErrorRuleImpl(RegisterNode owner) {
        super(owner);
    }
}
