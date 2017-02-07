package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    AssetsNodeChildComponent.class,
    LiabilitiesNodeChildComponent.class,
    ExpensesNodeItemComponent.class
})
@FinancialPositionNodeChildScope
public class FinancialPositionNodeChildModule {

    private final FinancialPositionNode parent;

    public FinancialPositionNodeChildModule(FinancialPositionNode parent) {
        this.parent = parent;
    }


    @Provides
    @FinancialPositionNodeChildScope
    @Named("assetsNode")
    AssetsNode provideAssetsNode(
        MembersInjector<AssetsNode> injector
    ) {
        AssetsNode node = new AssetsNode(parent, "assetsNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @FinancialPositionNodeChildScope
    @Named("liabilitiesNode")
    LiabilitiesNode provideLiabilitiesNode(
        MembersInjector<LiabilitiesNode> injector
    ) {
        LiabilitiesNode node = new LiabilitiesNode(parent, "liabilitiesNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @FinancialPositionNodeChildScope
    @Named("expensesNode")
    ExpensesNode provideExpensesNode(
        MembersInjector<ExpensesNode> injector
    ) {
        ExpensesNode node = new ExpensesNode(parent, "expensesNode");

        injector.injectMembers(node);
        return node;
    }

}