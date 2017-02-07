package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@SelfEmployedNodeChildScope
public class SelfEmployedNodeChildModule {


    @Provides
    @SelfEmployedNodeChildScope
    @Named("businessTypeNode")
    BusinessTypeNode provideBusinessTypeNode(
        SelfEmployedNode parent,
        MembersInjector<BusinessTypeNode> injector
    ) {
        BusinessTypeNode node = new BusinessTypeNode(parent, "businessTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SelfEmployedNodeChildScope
    @Named("profitThisYearNode")
    ProfitThisYearNode provideProfitThisYearNode(
        SelfEmployedNode parent,
        MembersInjector<ProfitThisYearNode> injector
    ) {
        ProfitThisYearNode node = new ProfitThisYearNode(parent, "profitThisYearNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SelfEmployedNodeChildScope
    @Named("profitPreviousYearNode")
    ProfitPreviousYearNode provideProfitPreviousYearNode(
        SelfEmployedNode parent,
        MembersInjector<ProfitPreviousYearNode> injector
    ) {
        ProfitPreviousYearNode node = new ProfitPreviousYearNode(parent, "profitPreviousYearNode");

        injector.injectMembers(node);
        return node;
    }

}