package zhy2002.neutron;

@FunctionalInterface
public interface UiNodeRuleFactory<R extends UiNodeRule<?, N>, N extends UiNode<?>> {

    R create(N owner);
}
