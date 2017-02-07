package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@FinancialPositionNodeChildScope
public class FinancialPositionNodeChildModule {


    @Provides
    @FinancialPositionNodeChildScope
    @Named("assetsNode")
    AssetsNode provideAssetsNode(
        FinancialPositionNode parent,
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
        FinancialPositionNode parent,
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
        FinancialPositionNode parent,
        MembersInjector<ExpensesNode> injector
    ) {
        ExpensesNode node = new ExpensesNode(parent, "expensesNode");

        injector.injectMembers(node);
        return node;
    }

}