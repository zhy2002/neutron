package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductLoanTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductLoanTypeNode extends StringUiNode<ProductsNode> {

    @Inject
    protected ProductLoanTypeNode(@Owner ProductsNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductLoanTypeNode.class;
    }

    protected final ProductLoanTypeNodeComponent getComponent() {
        return component;
    }


    private ProductLoanTypeNodeComponent component;

    @Inject
    void createComponent(ProductLoanTypeNodeComponent.Builder builder) {
        this.component = builder.setProductLoanTypeNodeModule(new ProductLoanTypeNodeModule(this)).build();
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
