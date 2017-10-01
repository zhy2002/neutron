package zhy2002.neutron.core;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import zhy2002.neutron.core.node.BigDecimalUiNode;
import zhy2002.neutron.core.node.BooleanUiNode;
import zhy2002.neutron.core.node.ReferenceUiNode;
import zhy2002.neutron.core.node.StringUiNode;
import zhy2002.neutron.core.rule.*;

import javax.inject.Inject;
import java.util.*;
import java.util.function.BiConsumer;


public class RuleCreator {

    private final Map<Class<?>, NodeRuleCreator<?>> typedMap = new HashMap<>();
    private final Table<Class<?>, String, NodeRuleCreator<?>> namedMap = HashBasedTable.create();

    @Inject
    public RuleCreator() {
    }

    @Inject
    final void initialize() {
        Iterable<NodeRuleCreator<?>> creators = getAllCreators();
        for (NodeRuleCreator<?> creator : creators) {
            if (creator.getName() == null) {
                typedMap.put(creator.getClazz(), creator);
            } else {
                namedMap.put(creator.getClazz(), creator.getName(), creator);
            }
        }
    }

    protected List<NodeRuleCreator<?>> getAllCreators() {
        List<NodeRuleCreator<?>> list = new ArrayList<>();

        list.add(new NodeRuleCreator<>(UiNode.class, (owner, createdRules) -> createdRules.add(new UiNode.ResetDirtyRule(owner))));

        list.add(new NodeRuleCreator<>(ParentUiNode.class, (owner, createdRules) -> createdRules.add(new ParentUiNode.MaintainDirtyDescendantCountRule(owner))));

        list.add(new NodeRuleCreator<>(ListUiNode.class, (owner, createdRules) -> createdRules.add(new ListUiNode.MaintainSelfDirtyRule(owner))));

        list.add(new NodeRuleCreator<>(RootUiNode.class, (owner, createdRules) -> createdRules.add(new RootUiNode.ClearErrorsForDisabledNodeRule(owner))));

        list.add(new NodeRuleCreator<>(LeafUiNode.class, (owner, createdRules) -> {
            createdRules.add(new LeafUiNode.MaintainSelfDirtyRule(owner));
            createdRules.add(new LeafValueRequiredValidationRule(owner));
        }));

        list.add(new NodeRuleCreator<>(BooleanUiNode.class, (owner, createdRules) -> owner.setValue(Boolean.FALSE)));

        list.add(new NodeRuleCreator<>(ReferenceUiNode.class, (owner, createdRules) -> createdRules.add(new ReferenceUiNode.NodeReferenceChangeRule(owner))));

        list.add(new NodeRuleCreator<>(StringUiNode.class, (owner, createdRules) -> {
            createdRules.add(new PatternValidationRule(owner));
            createdRules.add(new LengthValidationRule(owner));
        }));

        list.add(new NodeRuleCreator<>(BigDecimalUiNode.class, (owner, createdRules) -> {
            createdRules.add(new BigDecimalUiNode.SyncValueTextRule(owner));
            createdRules.add(new RangeValidationRule(owner));
            createdRules.add(new NumberFormatValidationRule(owner));
        }));

        return list;
    }

    public final void create(UiNode<?> owner, List<UiNodeRule<?>> createdRules) {
        Class<?> clazz = owner.getClass();
        Stack<Class<?>> stack = new Stack<>();
        while (clazz != Object.class) {
            stack.push(clazz);
            clazz = clazz.getSuperclass();
        }

        while (!stack.isEmpty()) {
            NodeRuleCreator<?> creator = typedMap.get(stack.pop());
            if (creator != null) {
                creator.createRules(owner, createdRules);
            }
        }

        NodeRuleCreator<?> creator = namedMap.get(clazz, owner.getName());
        if (creator != null) {
            creator.createRules(owner, createdRules);
        }
    }

    protected static class NodeRuleCreator<N extends UiNode<?>> {

        private final Class<N> clazz;
        private final String name;
        private final BiConsumer<N, List<UiNodeRule<?>>> func;

        public NodeRuleCreator(Class<N> clazz, BiConsumer<N, List<UiNodeRule<?>>> func) {
            this(clazz, null, func);
        }

        protected NodeRuleCreator(Class<N> clazz, String name, BiConsumer<N, List<UiNodeRule<?>>> func) {
            this.clazz = clazz;
            this.name = name;
            this.func = func;
        }

        public Class<N> getClazz() {
            return clazz;
        }

        public String getName() {
            return name;
        }

        @SuppressWarnings("unchecked")
        public final void createRules(UiNode<?> owner, List<UiNodeRule<?>> createdRules) {
            func.accept((N) owner, createdRules);
        }
    }
}
