package zhy2002.neutron;


import java.util.List;

public interface RuleProvider<N extends UiNode<?>> {

    List<UiNodeRule<N>> createRules(N node);
}
