package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@SelfEmployedNodeChildScope
public class SelfEmployedNodeChildModule {

    private final SelfEmployedNode parent;

    public SelfEmployedNodeChildModule(SelfEmployedNode parent) {
        this.parent = parent;
    }


    @Provides
    @SelfEmployedNodeChildScope
    @Named("businessTypeNode")
    BusinessTypeNode provideBusinessTypeNode(
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
        MembersInjector<ProfitPreviousYearNode> injector
    ) {
        ProfitPreviousYearNode node = new ProfitPreviousYearNode(parent, "profitPreviousYearNode");

        injector.injectMembers(node);
        return node;
    }

}