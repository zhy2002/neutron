package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@AccessNodeChildScope
public class AccessNodeChildModule {


    @Provides
    @AccessNodeChildScope
    @Named("accessContactTypeNode")
    AccessContactTypeNode provideAccessContactTypeNode(
        AccessNode parent,
        MembersInjector<AccessContactTypeNode> injector
    ) {
        AccessContactTypeNode node = new AccessContactTypeNode(parent, "accessContactTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AccessNodeChildScope
    @Named("accessContactTitleNode")
    AccessContactTitleNode provideAccessContactTitleNode(
        AccessNode parent,
        MembersInjector<AccessContactTitleNode> injector
    ) {
        AccessContactTitleNode node = new AccessContactTitleNode(parent, "accessContactTitleNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AccessNodeChildScope
    @Named("accessContactFirstNameNode")
    AccessContactFirstNameNode provideAccessContactFirstNameNode(
        AccessNode parent,
        MembersInjector<AccessContactFirstNameNode> injector
    ) {
        AccessContactFirstNameNode node = new AccessContactFirstNameNode(parent, "accessContactFirstNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AccessNodeChildScope
    @Named("accessContactLastNameNode")
    AccessContactLastNameNode provideAccessContactLastNameNode(
        AccessNode parent,
        MembersInjector<AccessContactLastNameNode> injector
    ) {
        AccessContactLastNameNode node = new AccessContactLastNameNode(parent, "accessContactLastNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AccessNodeChildScope
    @Named("accessCompanyNameNode")
    AccessCompanyNameNode provideAccessCompanyNameNode(
        AccessNode parent,
        MembersInjector<AccessCompanyNameNode> injector
    ) {
        AccessCompanyNameNode node = new AccessCompanyNameNode(parent, "accessCompanyNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AccessNodeChildScope
    @Named("accessTelephoneNode")
    AccessTelephoneNode provideAccessTelephoneNode(
        AccessNode parent,
        MembersInjector<AccessTelephoneNode> injector
    ) {
        AccessTelephoneNode node = new AccessTelephoneNode(parent, "accessTelephoneNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AccessNodeChildScope
    @Named("accessOtherDescriptionNode")
    AccessOtherDescriptionNode provideAccessOtherDescriptionNode(
        AccessNode parent,
        MembersInjector<AccessOtherDescriptionNode> injector
    ) {
        AccessOtherDescriptionNode node = new AccessOtherDescriptionNode(parent, "accessOtherDescriptionNode");

        injector.injectMembers(node);
        return node;
    }

}