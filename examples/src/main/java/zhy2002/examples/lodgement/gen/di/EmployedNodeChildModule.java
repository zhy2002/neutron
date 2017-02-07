package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@EmployedNodeChildScope
public class EmployedNodeChildModule {


    @Provides
    @EmployedNodeChildScope
    @Named("employmentStatusNode")
    EmploymentStatusNode provideEmploymentStatusNode(
        EmployedNode parent,
        MembersInjector<EmploymentStatusNode> injector
    ) {
        EmploymentStatusNode node = new EmploymentStatusNode(parent, "employmentStatusNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmployedNodeChildScope
    @Named("occupationNode")
    OccupationNode provideOccupationNode(
        EmployedNode parent,
        MembersInjector<OccupationNode> injector
    ) {
        OccupationNode node = new OccupationNode(parent, "occupationNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmployedNodeChildScope
    @Named("employerNameNode")
    EmployerNameNode provideEmployerNameNode(
        EmployedNode parent,
        MembersInjector<EmployerNameNode> injector
    ) {
        EmployerNameNode node = new EmployerNameNode(parent, "employerNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmployedNodeChildScope
    @Named("employerAddressNode")
    EmployerAddressNode provideEmployerAddressNode(
        EmployedNode parent,
        MembersInjector<EmployerAddressNode> injector
    ) {
        EmployerAddressNode node = new EmployerAddressNode(parent, "employerAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmployedNodeChildScope
    @Named("employerPhoneNode")
    EmployerPhoneNode provideEmployerPhoneNode(
        EmployedNode parent,
        MembersInjector<EmployerPhoneNode> injector
    ) {
        EmployerPhoneNode node = new EmployerPhoneNode(parent, "employerPhoneNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmployedNodeChildScope
    @Named("employmentStartedNode")
    EmploymentStartedNode provideEmploymentStartedNode(
        EmployedNode parent,
        MembersInjector<EmploymentStartedNode> injector
    ) {
        EmploymentStartedNode node = new EmploymentStartedNode(parent, "employmentStartedNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @EmployedNodeChildScope
    @Named("employmentEndedNode")
    EmploymentEndedNode provideEmploymentEndedNode(
        EmployedNode parent,
        MembersInjector<EmploymentEndedNode> injector
    ) {
        EmploymentEndedNode node = new EmploymentEndedNode(parent, "employmentEndedNode");

        injector.injectMembers(node);
        return node;
    }

}