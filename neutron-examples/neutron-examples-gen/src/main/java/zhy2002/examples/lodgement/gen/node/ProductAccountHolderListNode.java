package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductAccountHolderListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductAccountHolderListNode extends SelectAccountHolderListNode<ProductDescriptionNode> {

    @Inject
    protected ProductAccountHolderListNode(@Owner ProductDescriptionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductAccountHolderListNode.class;
    }

    protected final ProductAccountHolderListNodeComponent getComponent() {
        return component;
    }


    private ProductAccountHolderListNodeComponent component;

    @Inject
    void createComponent(ProductAccountHolderListNodeComponent.Builder builder) {
        this.component = builder.setProductAccountHolderListNodeModule(new ProductAccountHolderListNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
