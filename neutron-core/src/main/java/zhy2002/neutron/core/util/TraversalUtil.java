package zhy2002.neutron.core.util;

import zhy2002.neutron.core.ParentUiNode;
import zhy2002.neutron.core.UiNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.function.Consumer;

public final class TraversalUtil {

    private TraversalUtil() {
    }

    public static void bfs(Consumer<UiNode<?>> visitor, UiNode<?>... nodes) {
        Queue<UiNode<?>> queue = new ArrayDeque<>();
        queue.addAll(Arrays.asList(nodes));
        while (!queue.isEmpty()) {
            UiNode<?> node = queue.poll();
            visitor.accept(node);
            if (node instanceof ParentUiNode) {
                ParentUiNode<?> parent = (ParentUiNode<?>) node;
                queue.addAll(Arrays.asList(parent.getChildren()));
            }
        }
    }

}
