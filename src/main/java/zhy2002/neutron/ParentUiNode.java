package zhy2002.neutron;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A UiNode that can have child UiNodes.
 * The two known subclasses are ObjectUiNode and ListUiNode.
 * todo Consider adding MapUiNode which maps one UiNode to another.
 */
public abstract class ParentUiNode<P extends ParentUiNode<?>> extends UiNode<P> {

    private final List<UiNode<P>> children = new ArrayList<>();
    private final Map<String, UiNode<P>> childrenMap = new HashMap<>();

    protected ParentUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ParentUiNode(@NotNull UiNodeContext context) {
        super(context);
    }

    public int indexOf(UiNode<?> pUiNode) {
        throw new RuntimeException("Not implemented.");
    }

    public UiNode<?> getChildren(String name) {
        return childrenMap.get(name);
    }
}
