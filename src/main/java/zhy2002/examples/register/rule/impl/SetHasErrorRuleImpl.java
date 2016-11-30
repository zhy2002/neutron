package zhy2002.examples.register.rule.impl;


import zhy2002.examples.register.RegisterNode;
import zhy2002.examples.register.rule.SetHasErrorRule;

public class SetHasErrorRuleImpl extends SetHasErrorRule {

    public static class Factory implements SetHasErrorRule.Factory {

        @Override
        public SetHasErrorRule create(RegisterNode owner) {
            return new SetHasErrorRuleImpl(owner);
        }
    }

    private SetHasErrorRuleImpl(RegisterNode owner) {
        super(owner);
    }
}
