package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@UnemployedNodeChildScope
public class UnemployedNodeChildModule {


    @Provides
    @UnemployedNodeChildScope
    @Named("unemployedOnBenefitFlagNode")
    UnemployedOnBenefitFlagNode provideUnemployedOnBenefitFlagNode(
        UnemployedNode parent,
        MembersInjector<UnemployedOnBenefitFlagNode> injector
    ) {
        UnemployedOnBenefitFlagNode node = new UnemployedOnBenefitFlagNode(parent, "unemployedOnBenefitFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UnemployedNodeChildScope
    @Named("studentFlagNode")
    StudentFlagNode provideStudentFlagNode(
        UnemployedNode parent,
        MembersInjector<StudentFlagNode> injector
    ) {
        StudentFlagNode node = new StudentFlagNode(parent, "studentFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UnemployedNodeChildScope
    @Named("studentTypeNode")
    StudentTypeNode provideStudentTypeNode(
        UnemployedNode parent,
        MembersInjector<StudentTypeNode> injector
    ) {
        StudentTypeNode node = new StudentTypeNode(parent, "studentTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UnemployedNodeChildScope
    @Named("houseDutiesFlagNode")
    HouseDutiesFlagNode provideHouseDutiesFlagNode(
        UnemployedNode parent,
        MembersInjector<HouseDutiesFlagNode> injector
    ) {
        HouseDutiesFlagNode node = new HouseDutiesFlagNode(parent, "houseDutiesFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UnemployedNodeChildScope
    @Named("unemployedSinceNode")
    UnemployedSinceNode provideUnemployedSinceNode(
        UnemployedNode parent,
        MembersInjector<UnemployedSinceNode> injector
    ) {
        UnemployedSinceNode node = new UnemployedSinceNode(parent, "unemployedSinceNode");

        injector.injectMembers(node);
        return node;
    }

}