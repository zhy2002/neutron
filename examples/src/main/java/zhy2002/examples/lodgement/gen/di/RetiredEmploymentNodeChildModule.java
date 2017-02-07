package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@RetiredEmploymentNodeChildScope
public class RetiredEmploymentNodeChildModule {

    private final RetiredEmploymentNode parent;

    public RetiredEmploymentNodeChildModule(RetiredEmploymentNode parent) {
        this.parent = parent;
    }


    @Provides
    @RetiredEmploymentNodeChildScope
    @Named("retiredOnBenefitFlagNode")
    RetiredOnBenefitFlagNode provideRetiredOnBenefitFlagNode(
        MembersInjector<RetiredOnBenefitFlagNode> injector
    ) {
        RetiredOnBenefitFlagNode node = new RetiredOnBenefitFlagNode(parent, "retiredOnBenefitFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @RetiredEmploymentNodeChildScope
    @Named("retiredSinceNode")
    RetiredSinceNode provideRetiredSinceNode(
        MembersInjector<RetiredSinceNode> injector
    ) {
        RetiredSinceNode node = new RetiredSinceNode(parent, "retiredSinceNode");

        injector.injectMembers(node);
        return node;
    }

}