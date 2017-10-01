package zhy2002.mortgage.application.node;

import jsinterop.annotations.JsMethod;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.mortgage.application.gen.node.ErrorListNode;
import zhy2002.mortgage.application.gen.node.ErrorNode;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Pair {
    List<Integer> order;
    ErrorNode node;

    Pair(ErrorNode node) {
        this.node = node;
        this.order = getOrder(node.getSource());
    }

    private List<Integer> getOrder(UiNode<?> node) {
        List<Integer> result = new ArrayList<>();
        do {
            result.add(node.getIndex());
            node = node.getParent();
        } while (node != null);

        int start = 0, end = result.size() - 1;
        while (start < end) {
            Integer temp = result.get(start);
            result.set(start, result.get(end));
            result.set(end, temp);
            start++;
            end--;
        }
        return result;
    }
}

public class ErrorListNodeImpl extends ErrorListNode {

    @Inject
    protected ErrorListNodeImpl(@Owner ApplicationNode parent) {
        super(parent);
    }

    private Object[] sortedErrors;

    public void clearSortedErrors() {
        sortedErrors = null;
    }

    @JsMethod
    public Object[] getSortedErrors() {
        if (sortedErrors == null) {
            List<Pair> pairs = new ArrayList<>();
            for (int i = 0; i < getItemCount(); i++) {
                pairs.add(new Pair(getItem(i)));
            }

            sortedErrors = pairs.stream().sorted((p1, p2) -> {
                List<Integer> order1 = p1.order;
                List<Integer> order2 = p2.order;
                int index = 0;
                while (true) {
                    if (index == order1.size()) {
                        return index < order2.size() ? -1 : 0;
                    }
                    if (index == order2.size()) {
                        return index < order1.size() ? 1 : 0;
                    }
                    int v1 = order1.get(index);
                    int v2 = order2.get(index);
                    if (v1 == v2) {
                        index++;
                    } else {
                        return v1 - v2;
                    }
                }
            }).map(p -> p.node).collect(Collectors.toList()).toArray();
        }

        return sortedErrors;
    }

}
