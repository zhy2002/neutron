package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@EmploymentNodeChildScope
public class EmploymentNodeChildModule {


    @Provides
    @EmploymentNodeChildScope
    @Named("employmentTypeNode")
    EmploymentTypeNode provideEmploymentTypeNode(
        EmploymentNode parent,
        MembersInjector<EmploymentTypeNode> injector
    ) {
        EmploymentTypeNode node = new EmploymentTypeNode(parent, "employmentTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmploymentNodeChildScope
    @Named("payeEmployedNode")
    PayeEmployedNode providePayeEmployedNode(
        EmploymentNode parent,
        MembersInjector<PayeEmployedNode> injector
    ) {
        PayeEmployedNode node = new PayeEmployedNode(parent, "payeEmployedNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmploymentNodeChildScope
    @Named("selfEmployedNode")
    SelfEmployedNode provideSelfEmployedNode(
        EmploymentNode parent,
        MembersInjector<SelfEmployedNode> injector
    ) {
        SelfEmployedNode node = new SelfEmployedNode(parent, "selfEmployedNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmploymentNodeChildScope
    @Named("unemployedNode")
    UnemployedNode provideUnemployedNode(
        EmploymentNode parent,
        MembersInjector<UnemployedNode> injector
    ) {
        UnemployedNode node = new UnemployedNode(parent, "unemployedNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmploymentNodeChildScope
    @Named("retiredEmploymentNode")
    RetiredEmploymentNode provideRetiredEmploymentNode(
        EmploymentNode parent,
        MembersInjector<RetiredEmploymentNode> injector
    ) {
        RetiredEmploymentNode node = new RetiredEmploymentNode(parent, "retiredEmploymentNode");

        injector.injectMembers(node);
        return node;
    }

}