package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    PayeEmployedNodeChildComponent.class,
    SelfEmployedNodeChildComponent.class,
    EmployedNodeChildComponent.class,
    UnemployedNodeChildComponent.class,
    RetiredEmploymentNodeChildComponent.class
})
@EmploymentNodeChildScope
public class EmploymentNodeChildModule {

    private final EmploymentNode parent;

    public EmploymentNodeChildModule(EmploymentNode parent) {
        this.parent = parent;
    }


    @Provides
    @EmploymentNodeChildScope
    @Named("employmentTypeNode")
    EmploymentTypeNode provideEmploymentTypeNode(
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
        MembersInjector<RetiredEmploymentNode> injector
    ) {
        RetiredEmploymentNode node = new RetiredEmploymentNode(parent, "retiredEmploymentNode");

        injector.injectMembers(node);
        return node;
    }

}